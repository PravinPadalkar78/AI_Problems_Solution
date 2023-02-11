import java.util.Scanner;

class jugProblem {
    static int m,n,d,k,Pcount,Ncount;
    static int x=0,y=0;
    static int gcd(int a, int b)
    {
        int i;
        if (a < b)
            i = a;
        else
            i = b;

        for (i = i; i > 1; i--)
        {
            if (a % i == 0 && b % i == 0)
                return i;
            
        }
         return -1;
 }
    static void solve()
    {
        k=0;
        while(true)
        {
        	k=k+m;
        	Pcount++;
        	if(x+m>m)
        	{
        		y=y+m;
        		x=x-m;
        	}
        	x= x+m;
        	System.out.println(x+" "+y);
        	
        	if(k>n || k==d)
        	{
        		k=k-n;
        		Ncount++;
        		if(y-n<0)
        		{
        			y=y-(n-x);
        			x=n;
        		}
        		y=y-n;
        		System.out.println(x+" "+y);
        	}
        	if(k==d)
        	{
        		System.out.println(x+" "+y);
        		break;
        		
        	}
        	System.out.println(x+" "+y);
        }
//        System.out.println(Pcount +" -"+Ncount);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
       System.out.println("Enter The Capacity of small jug m");
        m= sc.nextInt();
        System.out.println("Enter The Capacity of Big jug n");
        n= sc.nextInt();
        System.out.println("Enter The required ");
        d= sc.nextInt();
        int temp =gcd(m,n);
        
        if(d%temp==0)
        {
        	System.out.println(x+" "+y);
             solve();
        }
        else
        {
            System.out.println("Solution Not Possible");
        }
        
    }
}