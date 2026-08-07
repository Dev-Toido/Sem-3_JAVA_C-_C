#include <stdio.h>
#include <ctype.h>
#include <string.h>

char stack[100];
int top = -1;

void push(char c) { stack[++top] = c; }
char pop() { return stack[top--]; }
char peek() { return stack[top]; }

int precedence(char c)
{
    if (c == '+' || c == '-')
        return 1;
    if (c == '*' || c == '/')
        return 2;
    return 0;
}

int isOperator(char c)
{
    return (c == '+' || c == '-' || c == '*' || c == '/');
}

void infixToPostfix(char infix[], char *postfix)
{
    //   2 --> int
    //  '2'--> char
    //  "2"--> string
    //(A+B*(C-D)/E)
    int i, j = 0;
    for (i = 0; infix[i] != '\0'; i++)
    {
        char c = infix[i];
        if (isalnum(c)) // A-Z || a-z || 0-9
        {
            postfix[j++] = c;
        }
        else if (c == '(')
        {
            push(c);
        }
        else if (c == ')')
        {
            while (top != -1 && peek() != '(')
            {
                postfix[j++] = pop();
            }
            pop();
        }
        else if (isOperator(c))
        {
            while (top != -1 && precedence(peek()) >= precedence(c))
            {
                postfix[j++] = pop();
            }
            push(c);
        }
    }
    while (top != -1)
    {
        postfix[j++] = pop();
    }

    postfix[j] = '\0';
}

int main()
{
    char infix[100], postfix[100];

    printf("Enter infix expression: ");
    scanf("%s", infix);

    infixToPostfix(infix, postfix);

    printf("Postfix Expression: %s\n", postfix);

    return 0;
}