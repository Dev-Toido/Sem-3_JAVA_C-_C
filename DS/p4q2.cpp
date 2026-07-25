// 2. Convert the following Infix arithmetic expressions into Postfix notation. 
//     i.	15 + 8 * 6 - 12 / 3 
//     ii.	25 * 4 + 30 / 5 - 9 
//     iii.	100 - 20 * 3 + 18 / 6 
//     iv.	12 + 24 / 6 * 5 - 8 
//     v.	50 - 15 + 6 * 8 / 4 

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
        }else if((sc>='A' && sc<='Z') || (sc>='a' && sc<='z') || (sc>='0' && sc<='9')){
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