package com.data.structures;
//www.geeksforgeeks.org/searching-for-patterns-set-1-naive-pattern-searching/
import java.util.Scanner;
public class StringMatching {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ss = sc.next();
		int s_len = s.length();
		int ss_len = ss.length();
		System.out.println(s_len+" "+ss_len);
		//helloworldjavaworld
		//world
		for(int i=0; i<ss_len;i++){
			for(int j=0;j<s_len-ss_len;j++){
				if(ss.toCharArray()[i] == s.toCharArray()[j]){
					i++;
				}
			}
		}
	}
}
//world
//helloworldjavaworld
//0 0,0 1,0 2, 0 3, 0 4, 0 5-true
//


