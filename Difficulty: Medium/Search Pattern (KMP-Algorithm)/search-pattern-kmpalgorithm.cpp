//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
       
    vector<int> z_function (string const& str) {
        int N = str.size();
        vector<int> z(N);

        for (int i = 1, l = 0, r = 0; i < N; i++) {
            if (i < r)
                z[i] = min (r - i, z[i-l]);
                
            while (i + z[i] < N && str[z[i]] == str[i + z[i]]) {
                z[i]++;
            }
            
            if (i + z[i] > r) {
                l = i;
                r = i + z[i];
            }
        }

        return z;
    }

    public:
        vector <int> search(string pat, string txt)
        {
            string str = pat + '$' + txt;
            auto z = z_function (str);
            
            vector<int> ans;
            
            for (int i = pat.size() + 1; i < str.size(); i++) {
                if (z[i] == pat.size())
                    ans.push_back(i - pat.size());
            }
            
            return ans;
        }

};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string S, pat;
        cin >> S >> pat;
        Solution ob;
        vector <int> res = ob.search(pat, S);
        if (res.size()==0)
            cout<<-1<<endl;
        else {
            for (int i : res) cout << i << " ";
            cout << endl;
        }
    }
    return 0;
}

// Contributed By: Pranay Bansal

// } Driver Code Ends