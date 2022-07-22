package JavaLogicPrograms;

public class Patterns {

	public static void main(String[] args) {
		
		//Right Triangle Star Pattern
		int n =5;
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=i-1; j++) 
			{
				
				System.out.print("*");			
				}
			System.out.println(" ");
			
		}
		System.out.println("_____________________ ");
		
		//pyramidPattern
		int e =8;
		for(int i=1; i<=e; i++)
		{
			for(int k=0; k<e-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) 
			{
				
				System.out.print(" *");			
				}
			System.out.println(" ");
			
		}
		System.out.println("_____________________ ");
		
		//Left Triangle Star Pattern
		
				int n1 =5;
				for(int i=1; i<=n1; i++)
				{
					
					for(int k=1;k<=n1-i; k++) {
						System.out.print(" ");
					}
					
					
					for(int j=1; j<=i; j++) 
					{
						System.out.print("*");		
						}
					
					System.out.println(" ");
					
				}
		
				System.out.println("_____________________ ");
			
				//Downward Triangle Star Pattern
				int t = 8;
				for(int i=1;i<=t;i++) 
				 {
					
					for(int j=1;j<=t-i;j++)
					 {
						System.out.print("*");
					}
					
				
					System.out.println(" ");
				  }
				
				System.out.println("_____________________ ");
				int t1 = 5;
				for(int row=1;row<=2*t1;row++) 
				 {
					int c = row >t1 ? 2*t1 -row : row;
					
					for(int col=1;col<=c;col++)
					 {
						System.out.print("*");
					}
					
				
					System.out.println(" ");
				  }
				
				System.out.println("_____________________ ");
				
				//Diamond Shape Pattern
				int e1 =5;
				for(int row=1; row<2*e1; row++)
				{
					int c = row > e1 ? 2*e1 -row : row;
					
					
					int spaces = e1- c;
					for(int s=0; s<spaces;s++) {
						System.out.print(" ");
					}
					
					for(int col=1; col<c; col++) 
					{
						
						System.out.print(" *");			
						}
					System.out.println(" ");
					
				}
				System.out.println("_____________________ ");
				int u= 5;
				for(int row=1; row<=u; row++) {
					
					int spaces = u-row;
					for(int k=1; k<=spaces; k++)
					{
						System.out.print(" ");
					}
					
					for(int col=row; col>=1; col--)
					{
						System.out.print(col);
					}
					
					for(int col=2; col<=row; col++)
					{
						System.out.print(col);
					}
					
					System.out.println();
				}
				
				
				System.out.println("_____________________ ");
				int u1= 5;
				for(int row=1; row<=2*u1; row++) {
					int c = row > u1 ? 2*u1 -row : row;
					
					for(int k=1; k<=u1-c; k++)
					{
						System.out.print(" ");
					}
					
					for(int col=c; col>=1; col--)
					{
						System.out.print(col);
					}
					
					for(int col=2; col<=c; col++)
					{
						System.out.print(col);
					}
					
					System.out.println();
				}
				
				System.out.println("_____________________ ");	
				
				int q=5;
				int n12 = 2*q;
				for(int row=1;row<=n12-1;row++) 
				{
					int col=1;
					for(; col<=n12-1;col++) {
						int printvalue = q-  Math.min(Math.min(row, col), Math.min(n12-row, n12-col));

						System.out.print(printvalue+" ");
					}
					System.out.println(" ");
				}
				
				
}
}
