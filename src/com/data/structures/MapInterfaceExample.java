package com.data.structures;
import java.util.*;

public class MapInterfaceExample {
	public static void main(String[] args){
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Azim");
		map.put(102, "Azim");
		for(HashMap.Entry m:map.entrySet()){
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
