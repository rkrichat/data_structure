package recursion;

import java.util.Random;

/**
 * This class is example to use recursion 
 * @author rkritchat
 * @since Apr 7, 2017
 */
public class Recursion {
	private static Random gen = new Random();
	public static void main(String[] args){
		recursive(0);
		//System.out.println("Sum : " + factorial(5,0));
	}
	
	/**
	 * recursive
	 * @param round
	 */
	private static void recursive(int round){
		round++;
		System.out.println("Round : " + round);
		int result = gen.nextInt(10);
		if(result == 9){
			System.out.println("--- Found ---" );
		}else{
			recursive(round);
		}
		System.out.println("Answer in ["+round+"] : " + result);
	}
	
	/**
	 * This method for make factorial with recursive
	 * @param target
	 * @param round
	 * @return
	 */
	private static int factorial(int target,int round){
		System.out.println("Round  : " + ++round);
		if(target == 0 || target == 1){
			return 1;
		}else{
			return target * factorial(target-1,round);
		}
	}
}
