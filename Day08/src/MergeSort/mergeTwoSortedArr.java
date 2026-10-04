package MergeSort;

public class mergeTwoSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,3,5};
		int arr2[] = {2,4,6};
		
		int arr1len = arr1.length;
		int arr2len = arr2.length;
		
		int mergeArr[] = new int[arr1len+arr2len];
		int i=0,j=0,k = 0;
		while(i<arr1len && j< arr2len) {
			if(arr1[i] < arr2[j]) {
				mergeArr[k] = arr1[i];
				i++;
				k++;
			}else {
				mergeArr[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1len) {
			mergeArr[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2len) {
			mergeArr[k] = arr2[j];
			k++;
			j++;
		}

		for(int p=0;p<mergeArr.length;p++) {
			System.out.print(mergeArr[p] + " ");
		}
		
	}

}
