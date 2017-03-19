package stack;

import java.util.Stack;

/**
 * This class for revert word using with stack 19/03/2017
 * @author rkritchat
 *
 */
public class StackMain {
	public static void main(String[] args){
		Stack<String> results = createdStack("KRITCHAT");
		showStack(results);
	}
	
	/**
	 * This method for create stack and push the word to stack
	 * @param Strig
	 * @return Stack<String>
	 */
	private static Stack<String> createdStack(String words){
		Stack<String> stack = new Stack<String>();
		if(!"".equals(words)){
			stack = new Stack<String>();
			for(int index=0;index<words.length();index++){
				stack.push(String.valueOf(words.charAt(index)));
			}
		}
		return stack;
	}
	
	/**
	 * This method for show data from stack
	 * @param results
	 */
	private static void showStack(Stack<String> results){
		if(results.isEmpty()){
			System.out.println("Not found word");
			return;
		}
		while(!results.isEmpty()){
			System.out.print(results.pop().toUpperCase());
		}
	}
}
