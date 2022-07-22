package JavaLogicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String abc = "RavikiranReddy" ;
		String reverse= "" ;
		for(int i= abc.length()-1; i>=0; i--) 
		 {
			
			reverse +=  abc.charAt(i);
			
		}
		System.out.println("Reversed String:- "+reverse);
		
		

	}

}
