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
		for(int j=0;j<s_len-ss_len+1;j++){
			int count =0;
			int k = j;
			for(int i=0;i<ss_len;i++ ){
				if(ss.toCharArray()[i+j]==s.toCharArray()[j]){
					System.out.println(ss.toCharArray()[k-i]+" "+s.toCharArray()[j]);
					if(count==ss_len-1){
						System.out.println(j-count);
						//i=0;
						//break;
					}
					count++;
					k++;
				}
			}
		}
	}
}
