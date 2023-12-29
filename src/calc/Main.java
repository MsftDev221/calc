package calc;
import java.util.Scanner;
import calc.Evaluator;

public class Main {
	// 	####### v0.1 ####### //
	// 	TODO Prompt the user for an operation
	// 		- Add (addition)
	//		- Sub (subtraction)
	//		- Div (division)
	//		- Mul (multiply)
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What operation do you want to evaluate?");
		
		Evaluator eval = new Evaluator();
		
		eval.SetOperand(scanner.nextLine());
		
		System.out.println("What's the first operand?");		
		double number1 = Double.parseDouble(scanner.nextLine());

		System.out.println("What's the second operand?");
		double number2 = Double.parseDouble(scanner.nextLine());
		
		
		System.out.print("This operation evaluates to: ");
		System.out.println(eval.Evaluate(number1, number2));
		
		scanner.close();
	}

}
