package com.trees;

public class Pre_in_post_order {
	public static class TreeNode
	{
		 int val;
		 TreeNode left;
		 TreeNode right;
		 
		 TreeNode(int val)
		 {
			 this.val=val;
		 }
	}
	
	TreeNode root;

	public void preorder(TreeNode root)
	{
		if (root != null)
		{
			
			System.out.println(root.val);
			preorder(root.left);
			preorder(root.right); 
		}
		
	}
	public void inorder(TreeNode root)
	{
		if (root != null)
		{
			inorder(root.left);
			System.out.println(root.val);
			inorder(root.right);
		}
		
		
	}
	public void postorder(TreeNode root)
	{
		if (root != null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.val);
			
		}
		
		
	}
	
	public TreeNode insertRec(TreeNode root, char key) {
		 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.val)
            root.left = insertRec(root.left, key);
        else if (key > root.val)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
	
	public TreeNode createBinaryTree()
	
	{
		  /*root = insertRec(root, 50);  
		  root = insertRec(root, 30);
		  root = insertRec(root, 20);
		  root = insertRec(root, 40);
		  root = insertRec(root, 70);
		  root = insertRec(root, 60);
		  root = insertRec(root, 80);*/
		
		root = insertRec(root, 'C');
		root = insertRec(root, 'E');
		root = insertRec(root, 'R');
		root = insertRec(root, 'N');
		root = insertRec(root, 'E');
		root = insertRec(root, 'R');
		//root node: 40
		//TreeNode rootNode = new TreeNode(40);  
		 /* TreeNode node20 = new TreeNode(20);  
		  TreeNode node10 = new TreeNode(10);  
		  TreeNode node30 = new TreeNode(30);  
		  TreeNode node60 = new TreeNode(60);  
		  TreeNode node50 = new TreeNode(50);  
		  TreeNode node70 = new TreeNode(70);  */
		
		  
		 /* rootNode.left=node20;  
		  rootNode.right=node60;  
		    
		  node20.left=node10;  
		  node20.right=node30;  
		    
		  node60.left=node50;  
		  node60.right=node70;  
		    
		  return rootNode;  */
		  return root;

			
		
	}
	
	public static void main(String args[])
	{	
		Pre_in_post_order  binarytree = new Pre_in_post_order(); 
		TreeNode rootNode = binarytree.createBinaryTree();  
		
		/*------preorder-------*/
		System.out.println("\nPreorder:");
		binarytree.preorder(rootNode);
		
		/*------inorder-------*/
		System.out.println("\nInorder:");
		binarytree.inorder(rootNode);
		/*------postorder-------*/
		System.out.println("\nPostorder:");
		binarytree.postorder(rootNode);
		
	}

}
