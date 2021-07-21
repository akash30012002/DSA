package DSA;

import java.util.Arrays;

public class Sorting {

//	Sort an array containing only 0,1 & 2.
	public static void sortSpecialArray(int[] arr){
        int start=0, end=arr.length-1;
        int count=0;
        while (count <= end){
            if (arr[count]==0){
                int temp = arr[count];
                arr[count] = arr[start];
                arr[start] = temp;
                start++;
                count++;
            }
            else if (arr[count]==2){
                int temp = arr[count];
                arr[count] = arr[end];
                arr[end] = temp;
                end--;
            }
            else count++;
        }
    }
	
//	Minimum swaps required to sort an array with distinct numbers.
	public static int minSwaps(int arr[]) {
		
		int sorted_arr[] = arr.clone();
		int indexes[] = new int[arr.length];
		Arrays.sort(sorted_arr);
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				if (arr[i] == sorted_arr[j]) {
					indexes[i] = j;
				}
			}
		}
//		System.out.println(Arrays.toString(indexes));
		String s = "";
		int count = 0;
		for (int i:indexes){
			if (s.contains(i+"")) continue;
			s += i;
			int temp = indexes[i];
			while (temp != i) {
				s += temp;
				temp = indexes[temp];
				count++;
			}
		}
//		System.out.println(s);
		return count;
	}
	
}
