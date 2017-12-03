package classes;

import java.util.Arrays;

public class SortedArrayMerge {

	public SortedArrayMerge() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a1[] ={1,9,12,23,37};
		int a2[] ={1,2,13,24,29};
		int a3[] = new int[a1.length+a2.length];
		int i= 0;
		int j =0;
		int k=0;
		while(i< a1.length && j <a2.length) {
			if(a1[i] < a2[j]) {
				a3[k] = a1[i];
				i++;
			} else {
				a3[k] = a2[j];
				j++;
			}
			k++;
		}
		while (i < a1.length)
	    {
	        a3[k] = a1[i];
	        i++;
	        k++;
	    }

	    while (j < a2.length)
	    {
	        a3[k] = a2[j];
	        j++;
	        k++;
	    }

		System.out.println(Arrays.toString(a3));
	}
	

}
