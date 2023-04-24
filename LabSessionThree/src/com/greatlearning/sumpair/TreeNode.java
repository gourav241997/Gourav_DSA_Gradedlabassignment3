 package com.greatlearning.sumpair;

 public class TreeNode 
{
  int data;
  TreeNode left,right;
  
  TreeNode(int data)
  {
	  this.data =data;
	  left = right =null;
  }
  public TreeNode insertData(int data, TreeNode root)
  {
	  if(root == null)
	  {
		  return new TreeNode(data);
	  }
	  if(data < root.data)
	  {
		  root.left = insertData(data , root.left);
	  }
	  else if(data > root.data)
	  {
		root.right = insertData(data , root.right);  
	  }
	  else
	  {
		  System.out.println("Given data is already present in BST");
	  }
	  return root;
  }
}
