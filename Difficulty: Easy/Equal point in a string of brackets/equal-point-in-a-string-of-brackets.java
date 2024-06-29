//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.countSub(str));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

 class Solution {
    public long countSub(String str) {
        // Your code goes here 
        
        long cnt  =0;
         for(int i =0;i<str.length();i++){
       if(str.charAt(i)==')'){
           cnt++;
       }  
       
         }
         return cnt;
    }
}