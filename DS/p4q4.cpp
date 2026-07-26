// 4. Convert the following Infix expressions into both Prefix and Postfix notation.
// i.	(A + B) * C - D
//      A B + C * D -
//      - * + A B C D
// ii.	(A * B) + (C / D)
// iii.	(A + B + C) * D

#include <iostream>
#include <string>
#include <stack>
#include <vector>
using namespace std;

int precedence(string op)
{
    if (op == "/" || op == "*" || op == "%")
    {
        return 2;
    }
    else if (op == "+" || op == "-")
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void reverseStr(string &str)
{
    int left = 0;
    int right = str.length() - 1;

    while (left < right)
    {
        swap(str[left], str[right]);
        left++;
        right--;
    }
}

string infixToPostfix(string infixExp)
{
    string postfixExp, sc;
    stack<string> op;
    infixExp.insert(0, "( ");
    infixExp.append(" )");

    for (int i = 0; i < infixExp.length(); i++)
    {
        sc = infixExp[i];
        if (sc == "+" || sc == "-" || sc == "*" || sc == "/" || sc == "%")
        {
            while (precedence(sc) <= precedence(op.top()))
            {
                postfixExp.append(op.top() + " ");
                op.pop();
            }
            op.push(sc);
        }
        else if (sc == "(")
        {
            op.push(sc);
        }
        else if ((sc >= "A" && sc <= "Z") || (sc >= "a" && sc <= "z"))
        {
            postfixExp.append(sc + " ");
        }
        else if (sc == ")")
        {
            sc = op.top();
            while (sc != "(")
            {
                postfixExp.append(sc + " ");
                op.pop();
                sc = op.top();
            }
            op.pop();
        }
    }
    return postfixExp;
}

string infixToPrefix(string infixExp)// precedence logic fix
{
    string prefixExp,sc;
    stack<string> op;
    infixExp.insert(0, "( ");
    infixExp.append(" )");

    for (int i = 0; i < infixExp.length(); i++)
    {
        sc = infixExp[i];
        if (sc == "+" || sc == "-" || sc == "*" || sc == "/" || sc == "%")
        {
            while (precedence(sc) <= precedence(op.top()))
            {
                prefixExp.append(op.top()+" ");
                op.pop();
            }
            op.push(sc);
        }
        else if (sc == ")")
        {
            op.push(sc);
        }
        else if ((sc >= "A" && sc <= "Z") || (sc >= "a" && sc <= "z"))
        {
            prefixExp.append(sc+" ");
        }
        else if (sc == "(")
        {
            sc = op.top();
            while (sc != ")")
            {
                prefixExp.append(sc+" ");
                op.pop();
                sc = op.top();
            }
            op.pop();
        }
    }
    reverseStr(prefixExp);
    return prefixExp;
}

int main()
{
    // string infixExp;
    // cout<<"Enter the expression: ";
    // getline(cin,infixExp);
    // cout<<"The Postfix Expresion: "<<infixToPostfix(infixExp)<<endl;
    // cout<<"The Prefix Expresion: "<<infixToPrefix(infixExp)<<endl;

    vector<string> expressions = {"(A + B) * C - D", "(A * B) + (C / D) ", "(A + B + C) * D"};

    cout << "Welcome to Infix Expression to Postfix Expression!" << endl;
    cout << "The Expressions are as follows: " << endl;
    for (int i = 0; i < expressions.size(); i++)
    {
        cout << "Infix Exp " << i + 1 << ": \t" << expressions[i] << endl;
        cout << "Postfix Exp " << i + 1 << ": \t" << infixToPostfix(expressions[i]) << endl;
        cout << "Prefix Exp " << i + 1 << ": \t" << infixToPrefix(expressions[i]) << endl
             << endl;
    }
    return 0;
}