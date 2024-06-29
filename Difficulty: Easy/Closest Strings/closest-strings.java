//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

 class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int max=Integer.MAX_VALUE;
        int in=-1;
        int in2=-1;
        for(int i=0;i<s.size();i++){
            
            String c=s.get(i);
            if(c.equals(word1))in=i;
             if(c.equals(word2))in2=i;
            
            if(in!=-1 && in2 !=-1){
                int d=Math.abs(in-in2);
                max=Math.min(max,d);
            }
        }
        return max; 
    }
};

