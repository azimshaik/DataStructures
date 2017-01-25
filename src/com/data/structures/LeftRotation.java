package com.data.structures;
import java.util.Scanner;
public class LeftRotation {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] A = new int[n];
		//System.out.println(n+"_"+d);
		for(int i=0;i<n;i++){
			A[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			//System.out.print(A[i]+" ");
		}
		for(int i=0;i<d;i++){
			int m =n;
			int j =i;
			int temp = A[j-i];
			while(m>1){
				A[j-i] = A[j-i+1];
				j++;
				m--;
			}
			A[n-1] = temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(A[i]+" ");
	}
}
