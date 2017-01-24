package com.data.structures;
//https://www.hackerrank.com/challenges/2d-array
import java.util.Random;
import java.util.Scanner;


public class hourglass {
	
	public static void hourglasssum(int[][] A,int indexi, int indexj){
		int sum=0;
		int flag=0;
		for(int i=indexi;i<3;i++){
			for (int j=indexj;j<3;j++){	
				if(!(flag==3|flag==5)){
				sum = sum+A[i][j];
				//System.out.println(flag);
				flag++;
				}else{
					flag++;
				}
			}
		}
		
		System.out.println("Sum:"+sum);	
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int N =6;
		int M =6;
		int[][] A = new int[M][N];
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				A[i][j] = rand.nextInt(3); 
			}
		}
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(int i=0;i<M-2;i++){
			for(int j=0;j<N-2;j++){
				hourglasssum(A,i,j);
			}
		}
		
		//hourglass sum logic working only for first 3x3 matrix :(
		
		
	}
	
}
//
//i=>1 to 3, 2 to 4, 3 to 5, 4 to 6
//j=>1 to 3, 2 to 4, 3 to 5, 4 to 6
//00 01 02 03
//10 11 12 13
//20 21 22 23
//eleminate 10 and 12 in every three by three matrix