//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
class GFG {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    		String str1=sc.next();
    		String str2=sc.next();
    		int k=sc.nextInt();
            Solution ob = new Solution();
    		if (ob.areKAnagrams(str1, str2, k) == true)
    			System.out.println("1");
    		else
    			System.out.println("0");
    	}
    }
}
// } Driver Code Ends


//User function template for JAVA

 class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length()!=s2.length())return false;
        ArrayList<Character>ll=new ArrayList();
       for(int i=0;i<s1.length();i++){
           ll.add(s2.charAt(i));
       }
       
        int counter=0;
        for(int i=0;i<s1.length();i++){
             char c = s1.charAt(i);
           if(ll.contains(c))ll.remove(Character.valueOf(c));
           else counter++;
        }
        if(counter>k)return false;
        else return true;
    }
}