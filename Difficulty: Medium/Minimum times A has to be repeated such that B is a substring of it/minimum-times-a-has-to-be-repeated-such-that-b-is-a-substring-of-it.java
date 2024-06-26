//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.minRepeats(A,B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

 class Solution {
    static int minRepeats(String A, String B) {
       int count=1;
       String rep=A;
       while(rep.length() < B.length()) 
       {
           rep=rep+A;
           count++;
       } 
       if(rep.contains(B)){
           return count;
       } 
       rep=rep+A;
       if(rep.contains(B)){
           return count+1;
       } 
       return -1;
    }
}

