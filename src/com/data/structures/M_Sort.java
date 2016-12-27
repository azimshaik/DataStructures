package com.data.structures;

public class M_Sort {
	public static void merge_sort(int[] a){
		//merge_sort recusrive method def 
		merge_sort(a,0,a.length-1);
	}
	public static void merge_sort(int[] a, int low, int high){
		if(low>=high){//edge condition
			return;
		}else{
			int mid = low/2 + high/2; //extra check(low+high)/2 will only work if the sum (low+high) fall under integer range
			merge_sort(a,low,mid);
			merge_sort(a,mid+1,high);
		}
	}
	public static void main(String[] args){
		int[] a = {12, 34};
		merge_sort(a);
	}

}
