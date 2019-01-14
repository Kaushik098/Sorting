package sorting;

import java.util.*;

public class MergeSort {
	
	private void merge(int[] a, int l, int m, int r) {
	
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0; i<n1; i++)
			 L[i] = a[l+i];
		
	   for(int j=0; j<n2; j++)
		     R[j] = a[m+1+j];
	   
	   int i=0, j=0;
	   
	   int k = l;
	   
	   while(i<n1 && j<n2)
	   {
		   if(L[i] <= R[j])
		   {
			   a[k] = L[i];
			   i++;
		   }
		   else
		   {
			   a[k] = R[j];
			   j++;
		   }
		 k++;   
	   }
	   
	  //copy 
	   while(i< n1){
		   a[k] = L[i];
		   i++;
		   k++;
	   }
	   
	   //copy 2
	   while(j<n2){
		   a[k] = R[j];
		   j++;
		   k++;
	   }
	}
	
	private void sort(int[] a, int l, int r) {
     
		if(l<r)
		{
			int m = (l+r)/2;
			
			//Sort 1st and 2nd values
			sort(a, l, m);
			sort(a, m+1, r);
			
			merge (a,l, m, r);
		}
	}

	

	private static void printArray(int[] a) {

		 int n =a.length;
		 
		 for(int i=0;i<n;i++)
			   System.out.print(a[i]+" ");
		 System.out.println();
	}

    public static void main(String args[]){
        
    	
    	int a[] = {88,99,77,66,100,102};
        System.out.println("Given array");        
        
        printArray(a);
        
    	MergeSort mergeob = new MergeSort();
    	mergeob.sort(a, 0, a.length-1);
    	
    	System.out.println("After sorting");
    	printArray(a);
    }

	

	
}
