package classes;

import java.util.Arrays;

public class ArrayRotation {

	public ArrayRotation() {
		// TODO Auto-generated constructor stub
	}

	

	// Driver program to test above functions
	public static void main(String[] args) 
	{
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int n =3;
		int j =0;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			temp = arr[0];
			for (j = 1; j < arr.length; j++) {
				arr[j-1] = arr[j];
			}
			arr[j-1] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
