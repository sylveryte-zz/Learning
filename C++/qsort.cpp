/* 
 * File:   qsort.cpp
 * Author: Sylveryte
 *
 * Created on June 21, 2015, 5:22 PM
 */

#include <cstdlib>
#include<iostream>
#include<stdio.h>
#define MAX 7

using namespace std;

/*
 * 
 */

int process(int a[], int l, int h)
{   
    int m=a[h];
    for(;l!=h;)
    {   
        //test
//        cout<<endl;
//        for(int i=0;i<MAX;i++)
//        cout<<"  "<<a[i];
//        printf("\nh=%d l=%d m=%d \n",h,l,m);
//        //       
        while(a[l]<=m&&l<h)
             l++;
        a[h]=a[l];
        a[l]=m;
        while(a[h]>=m&&l<h)
            h--;
        a[l]=a[h];
        a[h]=m;
    }
//    printf("\nh=%d l=%d m=%d \n",h,l,m);
    return h;
}

void qsort(int a[],int l, int h)
{
   if(l>=h)
        return;
    int m=0;
   m= process(a,l,h);
    qsort(a,m,h);
    qsort(a,l,m-1);
    //cout<<endl<<"m"<<m<<endl;
    return;
     }
    



int main(int argc, char** argv) {

    int a[MAX];
    cout<<"Enter "<<MAX<<" elements :"<<endl;
    for(int i=0;i<MAX;i++)
    {cout<<"Element"<<i<<":";
    cin>>a[i];}
    cout<<endl<<endl;
    for(int i=0;i<MAX;i++)
        cout<<"  "<<a[i];
    
  //   int op=process(a,0,MAX-1);
  // qsort(a,0,MAX-1);
 // cout<<endl<<"op"<<op<<endl;
   
   
  qsort(a,0,MAX-1);
   
    cout<<endl<<endl<<"After sorting"<<endl;
    for(int i=0;i<MAX;i++)
        cout<<"  "<<a[i];
    cout<<endl<<endl;
    return 0;
}
