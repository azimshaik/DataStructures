package com.data.structures;

import java.util.ArrayList;
import java.util.Scanner;


public class ScannerTest {
	public static void main(String[] args){
		int[] a = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}


//ScannerTest