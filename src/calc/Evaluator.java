package calc;

public class Evaluator {
	public Evaluator() { }
	
	String[] possibleOperations = new String[] {"add", "sub", "mul", "div"};
	
	
	String operand = "";
	public void SetOperand(String operand) {
		this.operand = operand;
	}
	
	public double Evaluate(double num1, double num2) {
		// Performs the correct operation and returns the result
		switch (operand.trim().toLowerCase()) {
			case "add":
				return num1 + num2;
			case "sub":
				return num1 - num2;
			case "div":
				return num1 / num2;
			case "mul":
				return num1 * num2;
			default:
				System.out.println("Something went wrong. Try again.");
				return 0.0;
		}
	}
}
