package Recursion;

public class Binary_Search {

	public static int binary_search(int arr[],int s,int e,int target) {
		int mid = (s + e) /2;
		
		if(arr[mid] == target) {
			return mid;
		}
		else if(target > arr[mid]) {
			return binary_search(arr,s = mid + 1,e,target);
			
		}
		else if(target < arr[mid]){
			return binary_search(arr,s,e=mid - 1,target);
		}
		else {
			return -1;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,2,3,4,5};
        int target = 3;
        int s = 0;
        int e = arr.length-1;
       int ans= binary_search(arr,s,e,target);
        System.out.println(ans);
	}

}
