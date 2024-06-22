//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int ans[] = ob.sumClosest(arr, x);
            System.out.print(ans[0]+" "+ans[1]);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int x) {
        // code here 
        int i=0,j=arr.length-1;
        int first=arr[0],second=arr[arr.length-1];
        int mindiff=Integer.MAX_VALUE;
        while(i<j)
        {   int value=Math.abs((arr[i]+arr[j])-x);
            if(value<mindiff)
            {
                mindiff=value;
                first=arr[i];
                second=arr[j];
            }
            else if(value==mindiff)
            {
                if(Math.abs(arr[i]-arr[j])>Math.abs(first-second))
                {
                    first=arr[i];
                    second=arr[j];
                }
            }
            if(arr[i]+arr[j]>x)
            {
                j--;
            }
            else if(arr[i]+arr[j]<x)
            {
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        int ar[]=new int[2];
        ar[0]=first;
        ar[1]=second;
        return ar;
    }
}