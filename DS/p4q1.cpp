// AIM: To learn and implement the concept of Polish Notation (Prefix), Reverse Polish Notation (Postfix), and conversion of Infix expressions into Postfix expressions.  Also, to evaluate Prefix expressions. 
// 1. Convert the following Infix expressions into Postfix notation. 
//     i.	(A + B) * (C - D) / E
//          A B + C D - * E /
//     ii.	(X + Y * Z) - (P / Q)
//     iii.	((A * B) + C) / (D - E) 
//     iv.	((P + Q) * (R - S)) + T 
//     v.	(A + (B * C)) - (D / E) 

#include <iostream>
#include <string>
#include <stack>
using namespace std;  

int main() {
    string infixExp,postfixExp;
    stack<char> op;
    char sc;

    cout<<"Enter the expression: ";
    getline(cin,infixExp);
    infixExp.insert(0,"(");
    infixExp.push_back(')');


    for(int i=0;i<infixExp.length();i++){
        sc = infixExp[i];
        if(sc=='(' || sc=='+' || sc=='-' || sc=='*' || sc=='/' || sc=='%'){
            op.push(sc);
        }else if((sc>='A' && sc<='Z') || (sc>='a' && sc<='z')){
            postfixExp.push_back(sc);
            postfixExp.push_back(' ');
        }else if(sc==')'){
            sc=op.top();
            while(sc!='('){
                postfixExp.push_back(sc);
                postfixExp.push_back(' ');
                op.pop();
                sc=op.top();
            }
            op.pop();
        }
        
    }
    cout<<postfixExp<<endl;
    return 0;
}