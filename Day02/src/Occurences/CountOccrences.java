package Occurences;

public class CountOccrences {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 int []arr = {2,5,5,5,8,25};
//		 int n = arr.length;
		 
		 int target = 5;
		 int index = findele(arr,target);
//		 System.out.print("hiii.....Khushii");		 
		 System.out.print(index);
				 
		 
	}
	
	public static int findele(int []arr,int target) {
		
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		int count = 0;
		while(s<=e) {
			int mid = s+(e-s)/2;
			if(arr[mid] == target) {
//				ans = mid;
				count++;
//				s = mid + 1;
//				e = mid - 1;
			}
		    if(arr[mid] > target) {
				e = mid - 1;
			}
		    else if(arr[mid] < target){
		      	s = mid + 1;	
			}
		}
		
		return count;
	}

}
