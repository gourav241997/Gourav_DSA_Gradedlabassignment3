package com.greatlearning.sumpair;

import java.util.HashSet;
import java.util.Set;

public class SumPair {

	public static void main(String[] args) {
		TreeNode root =new TreeNode(40);
		root.insertData(20, root);
		root.insertData(60, root);
		root.insertData(10, root);
		root.insertData(30, root);
		root.insertData(50, root);
		root.insertData(70, root);
		int sum =100;
		Set<Integer> data =new HashSet<Integer>();
		if(!findSumPair(root , sum ,data))
		{
			System.out.println("Pair does not exists for given sum");
		}
     }

	private static boolean findSumPair(TreeNode root, int sum , Set<Integer> data) {
       if(root == null)
       {
    	   return false;
       }
       
       if(findSumPair(root.left ,sum ,data)) {
    	   return true;
       }
       int remainder =sum - root.data;
       if(data.contains(remainder))
       {
    	   System.out.println("The pair("+root.data+","+remainder+") can form the given sum");
    	   return true;
       }else
       {
    	   data.add(root.data);
       }
       return findSumPair(root.right,sum,data);
	}

}
