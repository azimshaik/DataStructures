package com.data.structures;
//www.geeksforgeeks.org/searching-for-patterns-set-1-naive-pattern-searching/
import java.util.Scanner;
public class StringMatching {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String pat = sc.next();
		int n = text.length();
		int m = pat.length();
		//helloworldjavaworld
		//world
		for(int i=0; i<=n-m; i++){
			System.out.println(text.substring(i,i+m));
			if(pat.equals(text.substring(i,i+m))){
				System.out.println("Match found at"+i);
			
			}
		}
	}
}
//world
//helloworldjavaworld
//0 0,0 1,0 2, 0 3, 0 4, 0 5-true
//


