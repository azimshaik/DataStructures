package com.data.structures;
import java.util.Scanner;
public class StringMatching {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ss = sc.next();
		int s_len = s.length();
		int ss_len = ss.length();
		System.out.println(s_len+" "+ss_len);
		//helloworldjava
		//world
		for(int i=0;i<ss_len;i++){
			int count =0;
			int k = i;
			for(int j=0;j<s_len-ss_len+1;j++){
				if(ss.toCharArray()[k]==s.toCharArray()[j] & count<ss_len){
					System.out.println(ss.toCharArray()[k]+" "+s.toCharArray()[j]);
					count++;
					k++;
				}
			}
		}
	}
}
