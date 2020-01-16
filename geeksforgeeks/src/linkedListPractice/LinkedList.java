package linkedListPractice;

import java.util.Scanner;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void insertSorted(int d) {
		Node temp = new Node(d);
		Node curr = this.head;
		if (curr.data > d) {
			temp.next = curr;
			this.head = temp;
			return;
		}
		Node prev = null;
		while (curr.data < d && curr.next != null) {
			prev = curr;
			curr = curr.next;
		}
		if (curr.next != null) {
			prev.next = temp;
			temp.next = curr;
		} else {
			curr.next = temp;
		}
	}

	void append(int d) {
		Node curr = this.head;
		while (curr.next != null) {
			curr = curr.next;
		}
		Node temp = new Node(d);
		curr.next = temp;
	}

	void printList() {
		Node current = this.head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedList rajani = new LinkedList();

		Node head = new Node(6);
		Node second = new Node(8);
		Node third = new Node(12);
		rajani.head = head;
		head.next = second;
		second.next = third;
		rajani.append(16);
		rajani.append(20);
		rajani.printList();
		
		System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();
        rajani.insertSorted(num);
		rajani.printList();

        sc.close();
	}

}
