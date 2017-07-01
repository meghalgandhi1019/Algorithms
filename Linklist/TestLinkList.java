package com.linklist;



public  class TestLinkList {
	public static class Node {
		int key; 
		int data;
		 Node next;
		 
		 	Node(int key, int data) {
		 		this.key = key;
		 		this.data = data;
		 		
		 	}
		 }
	static Node head = null;
	
	public static int lengthList()
	{
	   int length = 0;
	   Node current;
		
	   for(current = head; current != null; current = current.next)
		{
	      length++;
	   }
		
	   return length;
	}
	
	//Insert at first place
	public static void insertFirstNode(int key, int data){
		Node node = new Node(key, data);
		node.next = head;
		head = node;
	}
	
	//Insert node at last
	public static void insertNode(int key, int data){
		Node current = head;
		
		if(head == null){
			head = new Node(key, data);
			return;
		}
		
		while(current.next != null){
			current = current.next;	
		}
		current.next = new Node(key, data);
		
	}
	
	//Delete the node on 1st place
	public static Node deleteFirst(){
		Node temp = head;
		head = head.next;
		return temp;
	}
	
	//Check if list is empty or not
	public static boolean isEmptyNode(){
		return head == null;
	}
	
	//Find the list element by key
	public static Node findByKey(int key){
		Node current = head;
		
		if(head == null)
		{
	      return null;
	   }
		while(current.key != key){
			if(current.next == null){
		         return null;
		      }else{
			current = current.next;
		      }
		}
		
		return current;
	}
	
	//delete node with given key
	public static Node deleteNode(int key){
		Node current = head;
		Node previous = null;
		if(head == null){
			return null;
		}
		
		while(current.key != key){
			if(current.next == null){
				return null;
			}else{
				//store reference to current link
				previous = current;
				
				 //move to next link
				current = current.next;
			}
		}
		
		if(current == head){
			head = head.next;
		}else{
			//bypass the current link
		      previous.next = current.next;
		}
		return current;
	}
	
	public static void sortList(){
		int size = lengthList();
	    int i,j, k, tempData, tempKey;
	    k = size;
	    Node current;
	    Node nextNode; 
	    
	     System.out.println("Length :"+size);
	    // System.out.println("head data: "+ head.data + " Key: "+head.key);
	     
	    for(i = 0; i<size; i++, k-- ){
	    	current = head;
	    	nextNode = current.next;
	    	for(j = 1; j<k; j++){
	    		if(current.data > nextNode.data){
	    			tempData = current.data;
	    			current.data = nextNode.data;
	    			nextNode.data = tempData;
	    			
	    			tempKey = current.key;
	    			current.key = nextNode.key;
	    			nextNode.key = tempKey;
	    		}
	    		current = current.next;
		    	nextNode = nextNode.next;
		    
	    	}
	    }
	}
	
	//Print the linklist elements. 
	public static void printList(){
		System.out.println("List: (key, data)");
		for (Node ptr = head; ptr!= null; ptr = ptr.next) {
			System.out.println("("+ ptr.key+","+ptr.data+")");
		}
	}
	
	/*
	  Insert Node at a given position in a linked list 
	  head can be NULL 
	  First element in the linked list is at position 0
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	    
/*
	Node InsertNth(Node head, int data, int position) {
	   // This is a "method-only" submission. 
	    // You only need to complete this method. 
	    Node newNode = new Node();
	    newNode.data = data;
	    newNode.next = null;
	   // System.out.println("Newnode data before "+ newNode.data);
	    
	    Node tmp;
	    if(head == null && position != 0){
	       // System.out.println("Newnode data added "+ newNode.data);
	        return head;
	    }
	    
	    if(head == null && position == 0){
	        head = newNode;
	       // System.out.println("Newnode data at head"+ newNode.data);
	        return head;
	    }
	    
	    if(position == 0){
	        newNode.next = head;
	        head = newNode;
	       // System.out.println("Newnode data added"+ newNode.data);
	        return head;
	    }
	    
	        int tempPosition = 0; 
	        Node current  = head;
	        Node previous = null;
	       
	        while(tempPosition < position){
	            if(current.next == null){//for position beyond the list add to the end of list
	                previous = current;
	                current = current.next;
	                
	                previous.next = newNode;
	                newNode.next = current;
	                return head;
	            }else{
	                previous = current;
	                current = current.next;
	                tempPosition = tempPosition + 1;
	            }  
	        }
	        
	        previous.next = newNode;
	        newNode.next = current;
	        //previous.next = current;
	        
	       // System.out.println("Newnode data added"+ newNode.data);
	    
	    
	    return head;
	}
*/
	
	public static void main(String[] args) {
		
		 insertFirstNode(6,56);
		 insertNode(5,40);
		 insertNode(3,30);
		 insertNode(2, 20);
		 insertNode(4,1);
		 insertNode(1, 10);
		
	     printList();
		
		while(!isEmptyNode()){
			Node dltNode = deleteFirst();
			System.out.println("Deleted Node: " + "(" + dltNode.key +","+ dltNode.data +")" + "\n");
			
		}
		 insertFirstNode(6,56);
		 insertNode(5,40);
		 insertNode(4,1);
		 insertNode(3,30);
	     insertNode(2, 20);
	     insertNode(1, 10);
		
		System.out.println("\nRestored List: ");  
	    printList();
	    
	    int findKey = 4;// find the node with the key = 4
	    Node fndNode = findByKey(findKey);
	    if(fndNode != null){
	    	System.out.println("\nNode with key: "+findKey+" found");
		   	System.out.println("Found node : (" + fndNode.key + "," + fndNode.data + ")" );
	    	
	    }else{
	    	System.out.println("\nNode with key: "+findKey+" not found");
	    }
		   
	   /* deleteNode(2);
	    deleteNode(5);
	    System.out.println("After Deleted");
	    printList();*/
	    
	    System.out.println("\nAfter Sorted");
	    sortList();
	    printList();
		   
	}

}

