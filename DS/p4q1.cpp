// AIM: To learn and implement the concept of Polish Notation (Prefix), Reverse Polish Notation (Postfix), and conversion of Infix expressions into Postfix expressions.  Also, to evaluate Prefix expressions.
// 1. Convert the following Infix expressions into Postfix notation.
//     i.	(A + B) * (C - D) / E
//          A B + C D - * E /
//     ii.	(X + Y * Z) - (P / Q)
//     iii.	((A * B) + C) / (D - E)
//     iv.	((P + Q) * (R - S)) + T
//     v.	(A + (B * C)) - (D / E)

#include <iostream>
#include <vector>
#include <string>
#include <stack>
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

string infixToPostfix(string infixExp)
{
    string postfixExp,sc;
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
                postfixExp.append(op.top()+" ");
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
            postfixExp.append(sc+" ");
        }
        else if (sc == ")")
        {
            sc = op.top();
            while (sc != "(")
            {
                postfixExp.append(sc+" ");
                op.pop();
                sc = op.top();
            }
            op.pop();
        }
    }
    return postfixExp;
}

int main()
{
    vector<string> expressions = {"(A + B) * (C - D) / E", "(X + Y * Z) - (P / Q)", "((A * B) + C) / (D - E)", "((P + Q) * (R - S)) + T", "(A + (B * C)) - (D / E)"};

    cout << "Welcome to Infix Expression to Postfix Expression!" << endl;
    cout << "The Expressions are as follows: " << endl;
    for (int i = 0; i < expressions.size(); i++)
    {
        cout << "Infix Exp " << i + 1 << ": \t" << expressions[i] << endl;
        cout << "Postfix Exp " << i + 1 << ": \t" << infixToPostfix(expressions[i]) << endl
             << endl;
    }
    return 0;
}