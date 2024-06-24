//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    List<String> l=new ArrayList<String>();
    HashMap<String,Integer> map=new HashMap();
    public void helper(String S,String p)
    {
        if(S.length()==0)
        {   if(map.containsKey(p))
            {
                return;
            }
            l.add(p);
            map.put(p,1);
            return;
        }
        for(int i=0;i<S.length();i++)
        {
            
            helper(S.substring(0,i)+S.substring(i+1),p+S.charAt(i));
        }
    }
    public List<String> find_permutation(String S) {
        // Code here
        String p="";
        helper(S,p);
        Collections.sort(l);
        return l;
    }
}