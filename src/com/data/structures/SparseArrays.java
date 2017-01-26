package com.data.structures;
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
		for(int i=0; i<N; i++){
			System.out.print(" "+A[i]);
		}
		//Queries
		int q = sc.nextInt();
		String[] Q = new String[q];
		for(int i =0; i<q ; i++){
			Q[i] = sc.next();
		}
		int count =0;
		for(int i=0;i<q;i++){
			for(int j=0;j<N;j++){
				if(A[i]==Q[j]){
					count++;
				}
			}
			System.out.println(count);
		}
		System.out.println("Lengthinpiut"+N);
		System.out.println("LengthiOut"+q);
	}

}
