//{ Driver Code Starts
import java.util.*;
import java.io.*;


// } Driver Code Ends


    //Function to find the smallest positive number missing from the array.
     
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]>arr.length||arr[i]<1||arr[i]==i+1)
                {
                    i++;
                }
            else{
                
                int index=arr[i]-1;
                if(arr[index]==index+1)
                {
                    arr[i]=-1;
                    i++;
                    continue;
                }
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
                return j+1;
        }
        return arr.length+1;
    }
}



//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) throws IOException
    {

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		
        //taking testcases
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    
		    //input number n
			int n=Integer.parseInt(in.readLine().trim());
			int[] arr=new int[n];
			String s[]=in.readLine().trim().split(" ");
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(s[i]);
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			out.println(missing);
		}
		out.close();
    }
}


// } Driver Code Ends