
package com.linklist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteOddNode{
	
	public static class LinkListNode{
		int key;
		int value;
		LinkListNode next;
		
		LinkListNode(int key, int value){
			this.key = key;
			this.value = value;
		}
	}
	
	static LinkListNode head = null;
	
	public static void insertAtFirst( int key, int val){
		LinkListNode node = new LinkListNode(key, val);
		node.next = head; //old head will be now 2nd
		head = node; //new head
	}
	
	public static void insertNode(int key, int val){
		LinkListNode current = head;
		
		if(head ==  null){
			current = new LinkListNode(key, val);
			head=current;
			return;
		}
		while(current.next != null){
			current = current.next;
		}
		current.next = new LinkListNode(key, val); 
	}
	
	public static void deleteOddNode( ){
		LinkListNode current = head;
		LinkListNode previous = current;
		
		while(current != null ){
			
			if(current.value % 2 == 1){
				
				previous.next = current.next;
				//previous=current;
				System.out.println("curr " + current.value + " " + "pre " + previous.value);
				
			}else{
			previous = previous.next;
			}
			current = current.next;
		}
		
	}
	
	public static void printList(){
		for(LinkListNode node= head; node != null ;node = node.next){
			System.out.println(  node.value);
			//System.out.println();
		}
	}
	
	//O(2n) two passes, one for first for loop, second for toArray method
    public static Integer[] uniqueHashElement(Integer[] startArray)
    {
        //CAN'T DO Set<integer> set = new Set because it's abstract
        Set<Integer> set = new HashSet<Integer>();
       // int numItemsFound = 0;

        for (int i = 0; i < startArray.length; i++)
        {
            set.add(startArray[i]);

        }
        Integer[] result = new Integer[set.size()];
        return set.toArray(result);

    }

	public static void main (String args[]){
		
		//insertAtFirst(8, 3);
		insertNode(8, 10);
		insertNode(1,6);
		insertNode(2,7);
		insertNode(3,4);
		insertNode(4,5);
		insertNode(9,2);
		insertNode(7,9);
		System.out.println("before");
		printList();
		
		deleteOddNode();
		System.out.println("after");
		
		printList();
		
			}
	
}