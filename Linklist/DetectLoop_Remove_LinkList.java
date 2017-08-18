package com.leetcode.trees;


public class DetectLoop_Remove_LinkList {

	static Node head;
	
	static class Node {
	int data;
	Node next;
	
	Node (int d){
		data = d;
		next =  null;
		}
	}
	
	void detectLoopRemoveLoop (Node node){
		
		if (node != null || node.next != null) {
			return;
		}
		
		Node slow = node;
		Node fast = node;
		
		while(fast != null && fast.next !=  null){
			if (slow == fast)
				break;
			
			slow = slow.next;
			fast = fast.next.next;
			
		}
		
		slow=head;
		
		/* since fast->next is the looping point. make it null to remove loop */
		while (slow.next != fast.next){
			slow = slow.next;
			fast = fast.next;
		}
		
		fast.next = null;
		
		
	}
	
	//for printing
	void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	public static void main(String[] args) {
		DetectLoop_Remove_LinkList list = new DetectLoop_Remove_LinkList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
 
        // Creating a loop for testing 
        head.next.next.next.next.next = head.next.next;
        list.detectLoopRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }
	
}
