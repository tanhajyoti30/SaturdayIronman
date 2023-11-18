package practicemyown;

public class pyramid {
	 
	    public static void pyramidPattern(int n) 
	    
	    
	    {  
	    	
	    for (int r=0; r<=n-1; r++) {
	    	
	    	for (int c=0; c< r+1; c++) {
	    		
	    		 System.out.print(" *");
	    	}
	    	 System.out.println(""); 
	    	
	    	}
	    	
	    	
	    	
	        for (int i=0; i<n; i++) 				//outer loop for number of rows(n) 
		{ 
		  for (int j=1; j<n-i; j++)				//inner loop for spaces
	            { 
	                System.out.print(" *"); 			//print space
	            } 
//		  for (int k=n; k<=n-1;k--) {
//			 
//		  System.out.print(" ");
//		  
//	  }
	            
	            System.out.println(" "); 			//ending line after each row
	        } 
	        
	        
	    } 
	  
	    public static void main(String args[]) 		//driver function
	    { 
	        int n = 5; 
	        pyramidPattern(n); 
	    } 
	}

