//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



 
class Solution {
    void rearrange(int arr[], int n) {
        // code here
        List<Integer> pos=new ArrayList<Integer>();
        List<Integer> neg=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
         int i=0,j=0;
         int post=0,negt=1;
         while(i<pos.size()&&j<neg.size())
         {
             arr[post]=pos.get(i);
             arr[negt]=neg.get(j);
             post+=2;
             negt+=2;
             i++;
             j++;
         }
          if(pos.size()==0)
           negt=0;
          if(i==pos.size()) negt=post;
         while(i<pos.size())
         {  
             arr[post]=pos.get(i);
             i++;
             post++;
         }
         
         while(j<neg.size())
         {   
             arr[negt]=neg.get(j);
             j++;
             negt++;
         }
    }
}