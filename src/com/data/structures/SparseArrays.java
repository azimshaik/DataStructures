package com.data.structures;
import java.util.Arrays;
//Sparse Arrays
//There are strings. Each string's length is no more than characters. There are also queries. For each query, you are given a string, and you need to find out how many times this string occurred previously. 
import java.util.Scanner;
public class SparseArrays {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[] A = new String[N];
		for(int i=0; i<N; i++){
			A[i] = sc.next();
		}
//		for(int i=0; i<N; i++){
//			System.out.print(" "+A[i]);
//		}
		//Queries
		int q = sc.nextInt();
		String[] Q = new String[q];
//		for(int i =0; i<q ; i++){
//			Q[i] = sc.next();
//		}
		
		for(int i=0;i<q;i++){
			int count =0;
			for(int j=0;j<N;j++){
				//System.out.println(Q[i]+" "+A[j]);
				//String comparison :( 
				//Q[i] == A[j]
				//Q[i].toString() == A[j].toString()
				//Arrays.equals(Q[i].toCharArray(), A[j].toCharArray())
				if(Arrays.equals(Q[i].toCharArray(), A[j].toCharArray())){
					//System.out.println(Q[i]+" "+A[j]);
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
