package com.data.structures;

import java.util.ArrayList;
import java.util.Iterator;

public class Stud {
	public String name;
	public int age;
	public int phone;
	public Stud(String name, int age, int phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public static void main(String[] args){
		ArrayList<Stud> list = new ArrayList<Stud>();
		Stud s1 = new Stud("azim",25,2549);
		Stud s2 = new Stud("abid",30,2456);
		Stud s3 = new Stud("ameem",25,3456);
		Stud s4 = new Stud("aleem",25,8989);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		int count = 0;
		
		for(Stud stu:list){
			if(stu.age<26){
				count++;
				System.out.println(stu.name);
			}
		}
//		Iterator iter = list.iterator();
//		while(iter.hasNext()){
//			Stud stu = (Stud)iter.next();
//			if(stu.age<26){
//				count++;
//				System.out.println(stu.name);
//			}
//		}
		System.out.println("These is/are  " + count+" candidates eligible");
		
	}
}
