// 3. Evaluate the following Prefix expressions. 
// i.	+ * 5 6 - 20 8 
// ii.	- + 18 7 * 3 4 
// iii.	* + 9 6 / 24 4 
// iv.	+ - 30 10 * 2 5 
// v.	- * 8 7 + 9 6 

#include <stack>
#include <vector>
#include <iostream>
#include <string>
using namespace std;

int evalutePrefixExp(string prefixExp){
    string temp="";
    vector<string> prefixVector;
    stack<int> result;
    int i=0;

    while(i<prefixExp.length()){
        temp="";
        while(prefixExp[i]!=' ' && i<prefixExp.length()){
            temp+=prefixExp[i];
            i++;
        }
        prefixVector.push_back(temp);
        i++;
    }

    for(i=prefixVector.size()-1;i>=0;i--){
        try{
            result.push(stoi(prefixVector[i]));
            
        }
        catch(const std::invalid_argument& e){
            char oper = prefixVector[i][0];
            int a=result.top();
                result.pop();
                int b=result.top();
                result.pop();
                int ans;
                switch(oper){
                    case '+':
                        ans=a+b;
                        break;
                    case '-':
                        ans=a-b;
                        break;
                    case '*':
                        ans=a*b;
                        break;
                    case '/':
                        ans=a/b;
                        break;
                }
                result.push(ans);
        }
    }
    return result.top();
}

int main() {
    vector<string> expressions={"+ * 5 6 - 20 8","- + 18 7 * 3 4","* + 9 6 / 24 4","+ - 30 10 * 2 5","- * 8 7 + 9 6"};

    cout<<"Welcome to Infix Expression to Postfix Expression!"<<endl;
    cout<<"The Expressions are as follows: "<<endl;
    for(int i=0;i<expressions.size();i++){
        cout<<"Infix Exp "<<i+1<<": \t"<<expressions[i]<<"\t= "<<evalutePrefixExp(expressions[i])<<endl;
    }
    return 0;
}