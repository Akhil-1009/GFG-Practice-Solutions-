//{ Driver Code Starts
import java.util.*;

class TwoStack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		while(T>0)
		{
			twoStacks g = new twoStacks();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();
				
				
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					if(stack_no == 1)
					 g.push1(a);
					else if(stack_no ==2)
					 g.push2(a);
				}else if(QueryType == 2)
				{
					if(stack_no==1)
					System.out.print(g.pop1()+" ");
					else if(stack_no==2)
					System.out.print(g.pop2()+" ");
				}
			
				Q--;
			}
				System.out.println();
		  T--;
		}
	}
}


// } Driver Code Ends



class twoStacks
{   int top1;
    int top2;
    int size1;
    int size2;
    int arr[];
    twoStacks()
    { arr=new int[200];
        top1=-1;
        top2=200;
        size1=0;
        size2=0;
        
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
      arr[++top1]=x;
      size1++;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {   top2--;
       arr[top2]=x;
       size2++;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(size1==0)
            return -1;
        int temp=arr[top1];
        top1--;
        size1--;
        return temp;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(size2==0)
            return -1;
        int temp=arr[top2];
        top2++;
        size2--;
        return temp;
    }
}

