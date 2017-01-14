package com.data.structures;
import java.util.*;
public class ArList {
	
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("azim@kent.edu");
		list.add("abid@uncc.edu");
		list.add("ameem@unc.edu");
		list.add("aleem@jntu.edu");
		Iterator iter = list.iterator();
		for(String item:list){
			System.out.println(iter.next()+"\t");
			
		}
		if(list.contains("azim@kent.edu")){
			System.out.println("We found you! We got you covered ! follow the link ");
		}
		else{
			System.out.println("May be you didnot hit the submit buttom last time when you were here!");
		}
	}

}
