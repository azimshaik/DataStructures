package com.data.structures;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i<N;i++){
			A[i] = sc.nextInt();
		}
		for(int i = A.length-1;i>=0;i--){
			System.out.print(A[i]+" ");
		}
	}
}
