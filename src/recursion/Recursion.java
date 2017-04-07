package recursion;

import java.util.Random;

public class Recursion {
	public static void main(String[] args){
		recursive(0);
	}
	
	private static void recursive(int round){
		round++;
		System.out.println("Round : " + round);
		Random gen = new Random();
		int result = gen.nextInt(10);
		if(result == 9){
			System.out.println("--- Found ---" );
		}else{
			recursive(round);
		}
		System.out.println("Answer in ["+round+"] : " + result);
	}
}
