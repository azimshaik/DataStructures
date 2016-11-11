package com.data.structures;

public class Pair<A, B> {
	A first;
	B second;
	public Pair(A a, B b) {
		super();
		this.first = a;
		this.second = b;
	}
	public A getFirst(){
		return first;
	}
	public B getSecond(){
		return second;
	}
	
	public static void main(String[] arg){
		Pair<String, Double> bid ;
		bid = new Pair<String, Double>("ORCL",32.07);
		String stock = bid.getFirst();
		double price = bid.getSecond();
		System.out.println(stock);
		System.out.println(price);
	}
}
