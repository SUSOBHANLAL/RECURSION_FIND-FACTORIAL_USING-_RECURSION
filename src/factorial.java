
public class factorial {
	
	public static long fact(int n) {
		if(n>0) {
			
			return n*(fact(n-1));
			
			
		}
		
		
		
		else 
		{
			return 1;
		}
	}
	
	
	
	
	public static void main(String [] args) {
		int n= 0;
		System.out.print(fact(n)+" ");
	}

}
