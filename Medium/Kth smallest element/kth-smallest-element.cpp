//{ Driver Code Starts
//Initial function template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

 //User function template for C++
#include<cstdlib>
class Solution{
    public:
    // arr : given array
    // l : starting index of the array i.e 0
    // r : ending index of the array i.e size-1
     
    int partition(int arr[],int l,int r,int k)
    {    int m=l+rand()%(r-l+1);
         int q=arr[m];
         arr[m]=arr[r];
         arr[r]=q;
           int pivot=r;
        int count=0;
        for(int i=l;i<=r;i++)
        {
            if(arr[i]<arr[pivot])
            {
                count++;
            }
        }
        int index=l+count;
        int temp=arr[index];
        arr[index]=arr[pivot];
        arr[pivot]=temp;
        int i=l,j=index+1;
        while(i<=index-1&&j<=r)
        {
            if(arr[i]<arr[index])
            {
                i++;
            }
            else if(arr[j]>arr[index])
            {
                j++;
            }
            else 
               {
                   int p=arr[i];
                   arr[i]=arr[j];
                   arr[j]=p;
               }
            
        }
        return index;
    }
    int helper(int arr[],int l,int r,int k)
{
    int pivot=partition(arr,l,r,k);
    if(pivot>k)
    {
        return helper(arr,l,pivot-1,k);
    }
    else if(pivot<k)
    {
        return helper(arr,pivot+1,r,k);
    }
    else
       {
           return arr[k];
       }
}
    int kthSmallest(int arr[], int l, int r, int k) {
        //code here
        
    
        return helper(arr,l,r,k-1);
    
    }
};

//{ Driver Code Starts.
 
int main()
{
    int test_case;
    cin>>test_case;
    while(test_case--)
    {
        int number_of_elements;
        cin>>number_of_elements;
        int a[number_of_elements];
        
        for(int i=0;i<number_of_elements;i++)
            cin>>a[i];
            
        int k;
        cin>>k;
        Solution ob;
        cout<<ob.kthSmallest(a, 0, number_of_elements-1, k)<<endl;
    }
    return 0;
}
// } Driver Code Ends