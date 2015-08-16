/* 
 * File:   encryp.cpp
 * Author: Sylveryte
 *
 * Created on June 28, 2015, 9:01 PM
 */

#include <cstdlib>
#include<iostream>
#include<string.h>
const int ss[27]={21,1,2,3,4,5,6,13,14,15,16,17,18,7,8,9,10,11,12,19,20,22,23,24,25,26};
char d[100],w[100];
using namespace std;

char enc(char x, int j)
{
    char h;
    if(x>='A'&&x<='Z')
    {
        cout<<"big"<<x<<endl;
        h=x+ss[j%26];
        if(h>'Z')
            h=h-26;
        cout<<"bret"<<h<<endl;
        d[j]=h;
        return 0;
    }
    else if(x>='a'&&x<='z')
    {
        cout<<"small"<<x<<endl;
        h=x+ss[j%26];
        if(h>'z')
            h=h-26;
         cout<<"bret"<<h<<endl;
        d[j]=h;
        return 0;
    }else return x;
       
}

char dec(char x, int j)
{
    
    int h;
    if(x>='A'&&x<='Z')
    {
        h=x-ss[j%26];
        if(h<'A')
            h=h+26;
        w[j]=h;
        return 0;
    }
    else if(x>='a'&&x<='z')
    {
        h=x-ss[j%26];
        if(h>'z')
            h=h+26;
        w[j]=h;
        return 0;
    }else return x;
       
}

/*
 * 
 */
int main(int argc, char** argv) {

    char s[100],q[100];
    int m;
    cout<<"For encryption 1, decryption 2, ans : ";
    cin>>m;
    if(m==1)
    {
    cout<<"Enter string : ";
    cin>>s;
    for(int i=0;i<strlen(s);i++)
        enc(s[i],i);
    cout<<"\nOriginal:"<<s;
    cout<<"\nEncrypted:"<<d<<endl;
    }
    else if(m==2)
    {
    cout<<"Enter string : ";
    cin>>q;
    for(int i=0;i<strlen(q);i++)
        dec(q[i],i);
    cout<<"\nOriginal:"<<q;
    cout<<"\nDecrypted:"<<w<<endl;
    }
    else{cout<<"\nBye!!";}
    
    
    return 0;
}

