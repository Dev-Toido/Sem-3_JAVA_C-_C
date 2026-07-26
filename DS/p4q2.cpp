// 2. Convert the following Infix arithmetic expressions into Postfix notation.
//     i.	15 + 8 * 6 - 12 / 3
//     ii.	25 * 4 + 30 / 5 - 9
//     iii.	100 - 20 * 3 + 18 / 6
//     iv.	12 + 24 / 6 * 5 - 8
//     v.	50 - 15 + 6 * 8 / 4

#include <iostream>
#include <string>
#include <vector>
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

string infixToPostfixNumbers(string infixExp)
{
    string postfixExp, temp = "", sc;
    stack<string> op;
    vector<string> infixVector;

    int i = 0;
    infixExp.insert(0, "( ");
    infixExp.append(" )");

    while (i < infixExp.length())
    {
        temp = "";
        while (infixExp[i] != ' ' && i < infixExp.length())
        {
            temp += infixExp[i];
            i++;
        }
        infixVector.push_back(temp);
        i++;
    }

    for (i = 0; i < infixVector.size(); i++)
    {
        sc = infixVector[i];
        if ( sc == "+" || sc == "-" || sc == "*" || sc == "/" || sc == "%")
        {
            while (precedence(sc) <= precedence(op.top()))
            {
                postfixExp.append(op.top()+" ");
                op.pop();
            }
            op.push(sc);
        }
        else if(sc == "("){
            op.push(sc);
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
        else
        {
            postfixExp.append(sc + " ");
        }
    }
    return postfixExp;
}

int main()
{
    vector<string> expressions = {"15 + 8 * 6 - 12 / 3", "25 * 4 + 30 / 5 - 9", "100 - 20 * 3 + 18 / 6", "12 + 24 / 6 * 5 - 8", "50 - 15 + 6 * 8 / 4"};

    cout << "Welcome to Infix Expression to Postfix Expression!" << endl;
    cout << "The Expressions are as follows: " << endl;
    for (int i = 0; i < expressions.size(); i++)
    {
        cout << "Infix Exp " << i + 1 << ": \t" << expressions[i] << endl;
        cout << "Postfix Exp " << i + 1 << ": \t" << infixToPostfixNumbers(expressions[i]) << endl
             << endl;
    }
    return 0;
}