package com.leetcode.trees;

/**
 * 
 * 
Given inorder and pretorder traversal of a tree, construct the binary tree.
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

public class BinaryTree_From_In_Pre_Order {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
        int inStart = 0;
        int inEnd = inorder.length - 1;
        int preStart = 0;
        
        return buildTree(inorder, inStart, inEnd, preorder, preStart);
    }
    
    public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart) {
        
        if(preStart > preorder.length-1 || inStart > inEnd){
            return null;
        }
        
        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);
        int k = 0;
        
        for(int i=inStart; i<=inEnd; i++){
            if(inorder[i] == rootValue){
                k = i;
                break;
                
            }
        }
        
        root.left = buildTree(inorder, inStart, k-1, preorder, preStart + 1);
        root.right = buildTree(inorder, k+1, inEnd, preorder, preStart + k - inStart + 1);
        
        return root;
    }
}
