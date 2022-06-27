#include <iostream>
#include <string>
using namespace std;

int main()
{
    string str1;
    string str2;
    std::cin >> str1>>str2;
    int i = 0,j=0,count = 0;
        while(i<str1.length() && j<str2.length()){
            if (str1[i]== str2[j]){
                i++;
                j++;
                //count++;
            }else{
                j++;
            }
        }
        
    cout<<i+1;
    

    return 0;
}