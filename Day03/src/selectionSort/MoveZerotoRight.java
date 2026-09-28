package selectionSort;

import java.util.Arrays;

public class MoveZerotoRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int arr[] = {2,0,3,0,4};
		int n = arr.length;
		int s = 0;
		int e = n -1;
		int i =0;
		while(s<e) {
			 while (s < e && arr[s] != 0) s++;    
	         while (s < e && arr[e] == 0) e--;  
			int zero = 0;
			if(s<e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
			}
			s++;
			e--;
			
//			i++;
		}
		
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.println(Arrays.toString(arr));
	}

}
