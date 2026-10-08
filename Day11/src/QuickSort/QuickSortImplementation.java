package QuickSort;

public class QuickSortImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {7,2,1,6,8,5,3,4};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i] + " ");
        }
	} 
	
	public static int findPart(int arr[],int low,int high) {
		int pivot = arr[high];
		int fence = low - 1;
		for(int j=low;j<high;j++) {
			if(arr[j] < pivot) {
				fence = fence + 1;
				swap(arr,fence,j);
			}
		}
		swap(arr,fence + 1,high);
		return fence + 1;
	}

	private static void swap(int arr[],int index1,int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void quicksort(int arr[],int low,int high) {
		if(low < high) {
			int findpart= findPart(arr,low,high);
			quicksort(arr,low,findpart - 1);
			quicksort(arr,findpart + 1,high);
		}
	}
}
