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
			merge(a,low,mid,high);
		}
	}
	public static void merge(int[] a, int low, int mid, int high){
		int[] temp = new int[high-low+1];
		int left = low;
		int right = mid+1;
		int k = 0;// index for temp array
		while(left<=mid && right<=high){//checks theedge condition while merging
			if(a[left]<a[right]){
				temp[k] = a[left];
				left++;
			}else{
				temp[k] = a[right];
				right++;
			}
			k++;
		}//element(s) copied into temp array
		
		//copy leftover elements into temp, they mush be greater than the elements in temp
		if(left<=mid){
			while(left<=mid){
				temp[k] = a[left];//copy leftovers from left sub array (if any) into temp
				left++;
				k++;
			}
		}else if(right<=high){
			while(right<=high){
				temp[k] = a[right];//copy leftovers from right sub array (if any) into temp
				right++;
				k++;
			}
		}//at this point after all the iterations the temp should have all the elements sorted.
		for(int m=0; m<temp.length; m++){
			a[low+m] = temp[m];// Note: &&&***IMPORTANT***&&& a[low+m] coz new insertions will have to happend after most recent insertion in earlier iteration 
		}
	}
	public static void main(String[] args){
		int[] a = {12, 34,0,-9,100};
		merge_sort(a);
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
	}

}
