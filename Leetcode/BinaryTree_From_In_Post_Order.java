package com.trees;

/**
 * 
 * 
Given inorder and postorder traversal of a tree, construct the binary tree.
Note:
You may assume that duplicates do not exist in the tree.
 * @author meghalgandhi
 *
 */
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class BinaryTree_From_In_Post_Order {

	public TreeNode buildTree(int[] inorder, int[] postorder){
		
		int inStart = 0;
		int inEnd = inorder.length - 1;
		int postStart = 0;
		int postEnd = postorder.length - 1;
		
		return buildTree(inorder, inStart, inEnd, postorder, postStart, postEnd);
		
	}
	
	public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
		
		
		int rootValue = postorder[postEnd];
		TreeNode root = new TreeNode (rootValue);
		int k=0;
		
		for(int i=0; i<inorder.length - 1; i++){
			if(inorder[i] == rootValue){
				k=i;
				break;
			}
		}
		
		root.left = buildTree(inorder, inStart, k-1, postorder, postStart, postStart + k - (inStart + 1));
		root.right = buildTree(inorder, k+1, inEnd, postorder, postStart + k - inStart,postEnd - 1);
		return root;
		
	}
	
}
