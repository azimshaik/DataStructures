package com.data.structures;

public class M_Sort {
	public static void merge_sort(int[] a){
		//merge_sort recusrive method def 
		merge_sort(a,0,a.length-1);
	}
	public static void merge_sort(int[] a, int low, int high){
		if(low>=high){//edge condition
			return;
		}
	}
	public static void main(String[] args){
		int[] a = {12, 34};
		merge_sort(a);
	}

}
