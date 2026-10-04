package MergeSort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {39,23,234,21,1,43,5};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void mergeSort(int arr[],int left,int right) {
		if(left<right) {
			
		int mid = left + (right - left)/2;
		mergeSort(arr,left,mid);
		mergeSort(arr,mid+1,right);
		mergeArr(arr,left,mid,right);
		}
	}
	public static void mergeArr(int []arr,int left,int mid,int right) {
		
		int n1 = mid -left + 1;
		int n2 = right - mid;
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		for(int i=0;i<n1;i++) {
			arr1[i] = arr[left + i];
		}
		for(int i=0;i<n2;i++) {
			arr2[i] = arr[mid + 1 + i];
		}
		int i=0,j=0,k=left;
		while(i < arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				k++;
				i++;
			}else {
				arr[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		while(i<arr1.length) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
}
