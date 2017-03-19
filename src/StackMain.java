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
	private static Stack<String> createdStack(String word){
		Stack<String> stack = new Stack<String>();
		for(int index=0;index<word.length();index++){
			stack.push(String.valueOf(word.charAt(index)));
		}
		return stack;
	}
	
	/**
	 * This method for show data from stack
	 * @param results
	 */
	private static void showStack(Stack<String> results){
		while(!results.isEmpty()){
			System.out.print(results.pop().toUpperCase());
		}
	}
}
