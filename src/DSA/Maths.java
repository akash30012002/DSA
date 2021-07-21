package DSA;

public class Maths {

	// Find if a number can be expressed in the form power(x,y), x>0, y>1;
	static boolean powerOfTwoNumbers(int n) {
        // Write your code here
        if (n<1) return false;
        if (n==1) return true;
        int sq = (int)Math.sqrt(n);
        for (int i=2; i<=sq; i++){
        	if (n%i!=0) continue;
            long pow = i;
            int count = 1;
            while (pow<n) {
            	pow = pow*i;
            	count ++;
            }
            if (pow == n) {
                System.out.println(i + "^" + count);
                return true;
            }
        }
        return false;
      }
	
	// Find two numbers that occur odd number of times in the array.
	static void findOddOccurrence(int[] arr) {
		
		int xor=0;
		for (int i:arr) xor ^= i;
		
		// number with the first significant bit in xor variable.
		int num = (xor&(xor-1))^xor;
		
		int num1=0, num2=0;
		for (int i:arr) {
			if ((i&num) == 0) num1 ^= i;
			else num2 ^= i;
		}
		
		if (num1 < num2) System.out.println(num1 + " " + num2);
		else System.out.println(num2 + " " + num1);
	}

	// Multiply two numbers without using *
	static int multiply(int x, int y) {
		int prod = 0;
		while (x>0) {
			if (x%2 == 1) {
				prod = prod + y;
			}
			x /= 2;
			y += y;
		}
		return prod;
	}

	static void fib(int n) {
		
		int a=0,b=1;
		if (n<0) return;
		if (n>0) System.out.print(a + " ");
		if (n>1) System.out.print(b + " ");

		int count=2;
		while (count++ < n) {
			int temp = a+b;
			System.out.print(temp + " ");
			a = b;
			b = temp;
		}
	}

	public static boolean isPalindrome(int num) {
	    	
    	int reverse=0;
    	int original = num;
    	while(num !=0 ) {
    		int digit = num%10;
    		reverse = reverse*10 + digit;
    		num /= 10;
    	}
    	return reverse == original;
    }
	
	public static int max_contiguous_subarray(int[] arr) {
		int n = arr.length;
		if (n==0) return 0;
	    if (n==1) return arr[0];
	    int max = Integer.MIN_VALUE, cur_sum=arr[0];
	    for (int i=1; i<n; i++){
	    	if(cur_sum >= 0){
	           cur_sum += arr[i];
	        }
	        else{
	            cur_sum = arr[i];
	        }
	        if (cur_sum > max) max = cur_sum;
	    }
	    return max;
	}
}
