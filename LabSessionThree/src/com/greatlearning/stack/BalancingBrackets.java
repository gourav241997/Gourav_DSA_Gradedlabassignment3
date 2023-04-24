package com.greatlearning.stack;

import java.util.Stack;

public class BalancingBrackets {

	public static void main(String[] args) {
		String bracketExpression ="{[][]()}";
		if(isBracketsBalanced(bracketExpression))
		{
			System.out.println("Brackets are balanced");
		}else
		{
			System.out.println("Brackets are not balanced");
			
		}

	}

	private static boolean isBracketsBalanced(String bracketExpression) {
		
		Stack<Character> stackData = new Stack<Character>();
		for(char ch : bracketExpression.toCharArray())
		{
			if(ch == '(' || ch == '{'  || ch == '[')
			{
				stackData.push(ch);
				continue;
			}
			if(stackData.isEmpty())
			{
				return false;
			}
			switch(ch)
			{
			case '}' :
				 if(stackData.pop() !='{')
				 {
					 return false;
				 }
				 break;
			case ')' :
				if(stackData.pop() !='(')
				{
					return false;
				}
				break;
			case ']' :
				if(stackData.pop() !='[')
				{
					return false;
				}
				break;
			default :
				System.out.println("Invalid character in bracket expression");
				return false;
			}
		}
		return stackData.isEmpty();
	}
	
}
