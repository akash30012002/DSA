package DSA;

public class Strings {

//	baseString = "Realize that excellent marks qualify everybody for jumps in wages";
//  encodedMsg = "1-1,6-7,6-7,5-6@10-3,1-3,5-2,4-4";
	
	public static String decode1(String baseString, String encodedMsg) {
	    //Write your code here
	    String[] words = baseString.split("\\s");
	    String[] chars = encodedMsg.split(",");
	    int len = chars.length;
	    String ans = "";
	    for (int i=0;i<len;i++){
	        if (chars[i].contains("@")){
	            String s1[] = chars[i].split("@");
	            String s2[] = s1[0].split("-");
	            String s3[] = s1[1].split("-");
	            int a = Integer.parseInt(s2[0]);
	            int b = Integer.parseInt(s2[1]);
	            ans += words[a-1].charAt(b-1);
	            ans += " ";
	            int c = Integer.parseInt(s3[0]);
	            int d = Integer.parseInt(s3[1]);
	            ans += words[c-1].charAt(d-1);   
	        }
	        else{
	        	String[] s = chars[i].split("-");
	            int a = Integer.parseInt(s[0]);
	            int b = Integer.parseInt(s[1]);
	            ans += words[a-1].charAt(b-1);
	        }
	    }
	    return ans;
	  }
	
	public static String decode(String baseString, String encodedMsg) {
			
		String[] words = baseString.split(" ");
		String[] nums = new String[2];
		String ans = "", code = "";
		int num1, num2;
		for (char c:encodedMsg.toCharArray()) {
			if (c==',' || c=='@') {
				nums = code.split("-");
				num1 = Integer.parseInt(nums[0]);
				num2 = Integer.parseInt(nums[1]);
				ans += words[num1-1].charAt(num2-1);
				if (c == '@') ans += " ";
				code = "";
			}
			else code += c;
		}
		nums = code.split("-");
		num1 = Integer.parseInt(nums[0]);
		num2 = Integer.parseInt(nums[1]);
		ans += words[num1-1].charAt(num2-1);
		return ans;
	}
	
//	reverse a string without using for loop and string.reverse()
	public static String reverse(String str, int index) {
	    	
    	if (index == str.length()) return "";
    	
    	char c = str.charAt(index);
    	String rev = reverse(str, index+1);
    	return rev + c;
    }
}
