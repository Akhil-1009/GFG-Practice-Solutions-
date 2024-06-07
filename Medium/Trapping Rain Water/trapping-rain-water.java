//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int dp[]=new int[n];
        dp[n-1]=0;
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            dp[i]=max;
            if(arr[i]>max)
                max=arr[i];
        }
        int rightmax=0;
        long water=0;
        for(int i=0;i<arr.length;i++)
        {
            water+=Math.max(Math.min(rightmax,dp[i])-arr[i],0);
            if(arr[i]>rightmax)
                rightmax=arr[i];
        }
        return water;
    } 
}


