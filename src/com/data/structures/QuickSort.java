package com.data.structures;

public class QuickSort {
	public static void quickSort(int[] a,int start, int end){
		if(start<end){
			int pIndex = partition(a,start,end);
			quickSort(a,start,pIndex-1);
			quickSort(a,pIndex+1,end);
		}
	}
	public static int partition(int[] a, int p, int r){
		 int i = p-1; //partition index
		 int x = a[r],temp; // pivot
		 for(int j=p;j<r;j++){
			 if(a[j]<=x){
				 i++;
				 //swap a[i] and a[j]
				 temp = a[i];
				 a[i] = a[j];
				 a[j] = temp;
			 }
		 }
		 
		 temp = a[i+1];
		 a[i+1]=a[r];
		 a[r]= temp;
		 
		 return i+1;
	}
	public static void main(String[] args){
		int[] a = {454,6,23,80,10000,6767,-800000000,-9989,98,90,97,7,56,-8,-6,-6};
		quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}
}
