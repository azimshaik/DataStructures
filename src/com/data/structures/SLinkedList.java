package com.data.structures;

public class SLinkedList {
	public Node head;
	public Node tail= null;
	public int length;
	public SLinkedList(){
		head = new Node();
		length = 0;
	}
	public void insert(int ele){
		if(ele!=0){
		Node temp = new Node(ele);
		Node current = head;
		head = temp;
		temp.next = current;
		length++;
		//head = head.getNext();
		}
		//System.out.println(head.item);
	}
	//get the item at an index 
	public int get(int index){
		System.out.println("The length of the linked list is: "+length);
		Node current = head;
		//System.out.println(current.item);
		for(int i=0; i<index;i++){
			current = current.getNext();
		}

		return current.item;
	}
	//print all the values in the list
	public int allitems(){
		Node current = head;
		System.out.print("All items in the linked list are: ");
		while(current.next != null){
			System.out.print(current.item+",");
			current = current.getNext();
		}
		return  0;
	}
	//find the duplicates in the Linked list
	public void findDupes(){
		Node current = head;
		while(current !=null && current.next != null){
			
		}
		
	}
	public static void main(String[] args){
		
		SLinkedList l1 = new SLinkedList();
		l1.insert(4);
		l1.insert(6);
		l1.insert(7);
		l1.insert(8);
		l1.insert(9);
		l1.insert(6);
		int val = l1.get(1);
		l1.allitems();
		l1.findDupes();
		System.out.println("\n The  value of LList at index 1 is : " +val);
	}

}
