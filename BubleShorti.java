package BubleShorting;
public class BubleShorti {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
// time complexity is o(n) for the worst TC
//	Outer loop runs n time
//	inner loops runs first n, second n-1, third n-3 and.. 
//	then the time Complexity o(n^2)
	public static void main(String[] args) {
		 int arr[] = {7, 8, 1, 3, 2};
	       //bubble sort
	       for(int i=0;i<arr.length-1; i++) {
	    	   for(int j=0;j<arr.length-i-1;j++) {
	    		   if(arr[j] > arr[j+1]) {
//	    			   swap
	    			   int temp = arr[j];
	    			   arr[j] = arr[j+1];
	    			   arr[j+1] = temp;
	    		   }
	    	   }
	       }
		printArray(arr);
	}

}
