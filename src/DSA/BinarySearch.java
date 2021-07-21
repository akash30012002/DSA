package DSA;

public class BinarySearch {

	// Find the smallest missing whole number in the array. Array will not contain duplicates.
	public static int findMissing(int[] arr) {
    	int start = 0, end = arr.length;
    	while (arr[start] == start + 1) {
    		int mid = (start+end)/2;
    		if (arr[mid] - mid == 1) start = mid+1;
    		else end = mid;
    	}
    	return start + 1;
    }
	
//  Frequency of number in a sorted array
	public static int countFreq(int[] arr, int key) {


		int start = 0, end = arr.length-1;
		int first, last;
//		finding the first occurrence
		if (arr[start] != key) {
			start++ ;
			while (true) {
				if (arr[start]== key && arr[start-1]!= key) break;
				if (start == end) return 0;
				int mid = (start + end)/2;
				if (arr[mid] >= key) end = mid;
				else start = mid+1;
			}
		}
		first = start;
		
//		finding the last occurrence
		start = 0; end = arr.length-1;
		if (arr[end] != key) {
			end-- ;
			while (true) {
				if (arr[end]== key && arr[end+1]!= key) break;
				int mid = (start + end)/2 + 1;
				if (arr[mid] <= key) start = mid;
				else end = mid-1;
			}
		}
		last = end;
		return last-first+1;
	}
	
//	Search an element in an array rotated by k times.
	public static int searchRotated(int[] arr, int start, int end, int key){
	        
	        if (start > end){
	            return 999;
	        }
	        int mid = (start + end)/2;
	        if (arr[mid] == key){
	            return mid;
	        }
	        if ((arr[mid] >= arr[end] && arr[end] >= key) || (arr[mid] < key && arr[end] >= key)) {
	            return searchRotated(arr, mid+1, end, key);
	        }
	        else return searchRotated(arr, start, mid, key);
	    }

}
