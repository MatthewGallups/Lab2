package Lab2;

import java.util.Stack;

public class mystery{
		public static String mystery (int num, int b){
		String digitChar ="0123456789ABCDEF";
		Stack<Character> stack = new Stack<Character>();
		String answer = "";
		do {
			stack.push(digitChar.charAt(num % b));
			num = num / b;
		}
		while (num != 0);{
			while (!stack.isEmpty()){
				answer += stack.pop();
			}
		}
		return answer;
	}
	public static void main(String[] args){
			System.out.println(mystery(31, 7));
			System.out.println(mystery(20, 2));
			System.out.println(mystery(173,16));
	}
}
