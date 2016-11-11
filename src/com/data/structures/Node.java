package com.data.structures;

public class Node {
	//Node has a item and reference to next node
	public int item;
	public Node next;
	public Node(int i, Node n){
		item = i;
		next = n;
	}
	public Node(int i){
		this(i,null);
	}
	public Node(){
		
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
