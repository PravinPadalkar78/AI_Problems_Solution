import java.util.Scanner;

public class jugProblemPuzzle {
	static int x ,y;
    void Action1()
	{
    	//fill 3G Jug completely
    	if(y<3)
    	{
    		y=3;
    	}
		
	}
    void Action2()
	{
    	//fill 4G Jug completely
    	if(x<4)
    	{
    		x=4;
    	}
    	
		
	}
    void Action3()
	{
    	//Transfer all water from 3G to 4G
    	if(x+y<=4 && x>0 )
    	{
    		x=x+y;
    		y=0;
    	}
		
	}
    void Action4()
	{
    	//Transfer all water from 4G to 3G
    	if(x+y<=3 && y>0)
    	{
    		x=0;
    		y=y+x;
    	}
		
	}
    void Action5()
  	{
      	//Empty 4G Jug
      	if(x>0)
      	{
      		x=0;
      	}
  		
  	}
    void Action6()
  	{
      	//Empty 3G Jug
      	if(y>0)
      	{
      		y=0;
      	}
  		
  	}
    void Action7()
  	{
      	//Transfer some water from 4G to 3G until 3G is Full
      	if(y<3 && x+y>=3)
      	{
      		x= x-3+y;
      		y=3;
      	}
  		
  	}
    void Action8()
  	{
      	//Transfer some water from 3G to 4G until 4G is Full
      	if(x<4 && x+y>=4)
      	{
      		x= 4;
      		y=y-4+x;
      	}
  		
  	}
	public static void main(String[] args) {
		 int c=0;
		Scanner sc= new Scanner(System.in);
	
		jugProblemPuzzle GP = new jugProblemPuzzle();
		System.out.println("Please Enter Initial state x,y");
		x= sc.nextInt();
		y = sc.nextInt();
		System.out.println("Intital State :- "  + "(" +GP.x+"," + GP.y+")" );
		while(c!=7)
		{
			System.out.println("Enter The Choice");
			System.out.println("1-fill 3G Jug completely\n"
					+ "2-fill 4G Jug completely\n"
					+ "3-Transfer all water from 3G to 4G\n"
					+ "4-Transfer all water from 4G to 3G\n"
					+ "5-Empty 4G Jug\n"
					+ "6-Empty 3G Jug\n"
					+ "7-EXIT");
			c= sc.nextInt();
			
			switch(c){
			case 1:
				GP.Action1();
				System.out.println("("+GP.x+"," + GP.y+")");
				break;
			
			case 2:
				GP.Action2();
				System.out.println("("+GP.x+"," + GP.y+")");
				break;
				
			case 3:
				GP.Action3();
				System.out.println("("+GP.x+"," + GP.y+")");
				break;		
			
			case 4:
				GP.Action4();
				System.out.println("("+GP.x+"," + GP.y+")");
				break;
				
			case 5:
				GP.Action5();
				System.out.println("("+GP.x+"," + GP.y+")");
				break;
				
			case 6:
				GP.Action6();
				System.out.println("("+GP.x+"," + GP.y+")");
				break;
		}

			
		};
		
		
	}

}
