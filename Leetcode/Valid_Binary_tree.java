package leetcode;

import java.util.List;

 
public class Valid_Binary_tree{
	
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		
		TreeNode(int val){
			this.val = val;
		}
	}
		// TreeNode root;// Root node
		
		public void insertRecord(TreeNode root, int val){
			
			if(val < root.val){
				
				if(root.left != null){
					insertRecord(root.left, val);
				}else{
					System.out.println("Inserted value " + val + " to the left of "+ root.val );
					root.left = new TreeNode(val);
				}
				
			}else if(val > root.val){
				
				if(root.right != null){
					insertRecord(root.right, val);
				}else{
					System.out.println("Inserted value " + val + " to the right of "+ root.val );
					root.right = new TreeNode(val);
				}
				
			}
			
		}
		
		public void inOrderTraversal(TreeNode root){
			if(root != null){
				inOrderTraversal(root.left);
				System.out.println(root.val);
				inOrderTraversal(root.right);
			}
		}
		
		TreeNode prev;
		
		public boolean isValidBST(TreeNode root){
			return isMonotonicIncreasing(root);
			//return isMonotonicIncreasingNew(root);

		} 
		
		public boolean isMonotonicIncreasing(TreeNode p){
			if(p==null)return true;
			
			if(isMonotonicIncreasing(p.left)){
				if(prev != null && p.val <= prev.val) return false;
				prev = p;
				return isMonotonicIncreasing(p.right);
			}
			return false;
		}
		
		public static void main(String args[]){
			Valid_Binary_tree binaryTree = new Valid_Binary_tree();
			TreeNode root = new TreeNode(5);//Root of the tree. Have to create first
			
			binaryTree.insertRecord(root, 1);
			binaryTree.insertRecord(root, 3);
			binaryTree.insertRecord(root, 6);
			binaryTree.insertRecord(root, 8);
			binaryTree.insertRecord(root, 9);
		
			System.out.println("Inorder Traversal");
			binaryTree.inOrderTraversal(root);
			System.out.println();
			System.out.println("Validation binary tree: "+ binaryTree.isValidBST(root));
				
		}
	}
