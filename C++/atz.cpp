/* 
 * File:   atz.cpp
 * Author: Sylveryte
 *
 * Created on June 19, 2015, 10:53 AM
 */

#include <cstdlib>
#include<iostream>
#include<time.h>

using namespace std;

#define a 10
/*
 * 
 */
int main(int argc, char** argv) {
    int mat[a][a];
    char te;
    
    cout<<"This program is property of Starx INC, written by Sylveryte\n"
            "All rights reserved :p\n"
            "Well it generates random path form A to Z. ";
    
    do{
        
    //for randomization 
    srand((unsigned)time(NULL));    
    
    //initializing matrix with .
    for(int i=0;i<a;i++)
        for(int j=0;j<a;j++)
            mat[i][j]=46;
    
    
    //path process
    for(int l[4]={0},h,i=0,j=0,num=65;num<65+26;)
    {
        if(l[0]==1&&l[1]==1&&l[2]==1&&l[3]==1)
         break;
        
        h=rand()%4;
        
        
        if(h==0&&mat[i-1][j]==46)
        { 
            if(i>0)
            i--;
        l[0]=0;l[1]=0;l[2]=0;l[3]=0; goto rex;}else if(h==0) l[0]=1;
        
       
        
        if(h==1&&mat[i][j+1]==46)
        {if(j<a)j++;
        l[0]=0;l[1]=0;l[2]=0;l[3]=0;goto rex;}else if(h==1) l[1]=1;
        
       
        
         if(h==2&&mat[i+1][j]==46)    
        { if(i<a)i++;           
        l[0]=0;l[1]=0;l[2]=0;l[3]=0;goto rex;}else if(h==2) l[2]=1;
        
      
        
         if(h==3&&mat[i][j-1]==46)
        {if(j>0)j--;            
        l[0]=0;l[1]=0;l[2]=0;l[3]=0;goto rex;}else if(h==3) l[3]=1;
        
        
        
        rex:
        
        if(mat[i][j]==46)  
          mat[i][j]=num++;
         
    }
    
    cout<<"\n\n\n";
            
    //printing part
    for(int i=0;i<a;i++)
    {
        cout<<endl<<endl;
        for(int j=0;j<a;j++)
//            
         cout<<char(mat[i][j])<<"   ";
    }
    
    cout<<"\n\n\n\nRegenerate??(y/n):";
    cin>>te;
   
}while(te=='y'||te=='Y');
    
    return 0;
}

