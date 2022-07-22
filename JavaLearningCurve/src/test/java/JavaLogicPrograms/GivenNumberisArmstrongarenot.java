package JavaLogicPrograms;

public class GivenNumberisArmstrongarenot {

	public static void main(String[] args) {
		
		
		int n = 20000;
		int armstrongornot = 0;
		int j =1;
		//int r[] = null;
		while(j<=n) 
		{
			
			String b = String.valueOf(j);
			int length = b.length();
			for(int i=0;i<=length-1;i++) 
			{
				
				int y = (int) Math.pow(Integer.parseInt(String.valueOf(b.charAt(i))), length);
				
				//System.out.println("y="+y);
				
				armstrongornot += y;
			
			}
			
			//System.out.println("armstrongornot="+armstrongornot);
			
			if(j==armstrongornot) {
				
//				r[j]=j;
				System.out.println("Given number is Armstrong number: "+j);
				
			}else {
//				System.out.println("Given number is NOT Armstrong number: "+j);
			}
			armstrongornot = 0;
			j++;
		}
		
	// System.out.println("Range of Armstrong number from 1 to 1000" +r);

	}

}
