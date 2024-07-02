//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            

            Solution ob = new Solution();
            
            System.out.println(ob.lookandsay(n));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
     static String lookandsay(int n) {
        //your code here
        String num ="1";
        n--;
        while(n!=0){
            int i=0;
            String news ="";
            while(i<num.length()){
                int count=0;
                int j=i;
                while(j<num.length() && num.charAt(j) == num.charAt(i)){
                    count++;
                    j++;
                }
                news+= String.valueOf(count)+num.charAt(i);
                i=j;
            }
            num=news;
            n--;
        }
        return num;
    }
}
