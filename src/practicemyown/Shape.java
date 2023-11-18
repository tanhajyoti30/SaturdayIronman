package practicemyown;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daimond(5);
	}
	
	
	public static void daimond(int n) {
		
		for (int i=1; i<=n; i++) 
		{
			
			for (int j = 0; j<n-i; j++) 
			{
			System.out.print(" ");
				
			}
			 for (int j=0; j<i; j++ ) 			//inner loop for number of columns
	            { 
	                System.out.print("* "); 			//print star
	            } 
			 
			 System.out.println(); 
		}
		
		for (int i=1;i<=n-1;i++) {
			
			for(int j=0; j<i;j++) {
				System.out.print(" ");
			}
			
			
			for (int k=n;k>i;k--) {
				 System.out.print("* "); 
				
			}
			 System.out.println(); 
		}
	}

}
