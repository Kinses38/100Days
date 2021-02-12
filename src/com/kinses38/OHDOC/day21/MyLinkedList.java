package com.kinses38.OHDOC.day21;

public class MyLinkedList {
	static class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	private Node head;
	private int size = 0;
	public MyLinkedList() {

	}

	public void insert(int data) {
		Node newNode = new Node(data);
		Node tmp = null;
		if (this.head == null) {
			this.head = newNode;
			incSize();
		} else {
			tmp = this.head;
			while (tmp.next != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(newNode);
			incSize();
		}
	}

	public boolean insert(int data, int index){
		Node tmp = new Node(data);
		Node current = head;
		if(index < 0 || index > this.getSize()){
			return false;
		}

		if(current != null){
			for(int i = 0; i < index && current.getNext() != null; i++){
				current = current.getNext();
			}

			tmp.setNext(current.getNext());
			current.setNext(tmp);
			incSize();
		}
		return true;
	}

	public int getSize() {
		return size;
	}

	private void decSize(){
		this.size--;
	}

	private void incSize(){
		this.size++;
	}

	public static void main(String[] args) {
		MyLinkedList myLL = new MyLinkedList();
		myLL.insert(1);
		myLL.insert(2);
		myLL.insert(3);

		myLL.insert(4, 1);
	

	}
}
