import java.util.Scanner;


public class W4Q5 {

	public static String reverse(String input) {
		Stack stack = new ArrayStack(input.length());
		for (int i=0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		String output = "";
		while (!stack.isEmpty()) {
			output += stack.pop();
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a string: ");
		String input = scanner.next();
		
		System.out.print("Reverse is: " + reverse(input));
		scanner.close();
	}

}
