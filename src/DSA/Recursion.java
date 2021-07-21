package DSA;

public class Recursion {

	public static void printNoConsecutiveOnes(int n, String stringSoFar){
	        
        if (n==0) {
        	System.out.println(stringSoFar);
        	return;
        }
        
        printNoConsecutiveOnes(n-1, stringSoFar + 0);

        if (stringSoFar == "" || stringSoFar.charAt(stringSoFar.length()-1) != '1' ){
            printNoConsecutiveOnes(n-1, stringSoFar + 1);          
        }
	}
	
}
