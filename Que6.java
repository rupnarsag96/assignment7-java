


package Assignment7;

class Calculator {
	protected double num1;
	protected double num2;

	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double add() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Negative numbers are not allowed for addition");
		}
		return num1 + num2;
	}

	public double subtract() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Negative numbers are not allowed for substraction");
		}
		return num1 - num2;
	}

	public double multiply() {
		if (num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Numbers less than zero are not allowed for multiplication");
		}
		return num1 * num2;
	}

	public double divide() {
		if (num2 == 0) {
			throw new ArithmeticException("Numbers less than zero are not allowed for division");
		}
		return num1 / num2;
	}

	public class Que6 {

		public static void main(String[] args) {

			try {
				Calculator calc = new Calculator(3, 4);
				System.out.println("addition:" + (calc.add()));

				Calculator calc1 = new Calculator(5, 10);
				System.out.println("substraction:" + (calc1.subtract()));

				Calculator calc2 = new Calculator(5, 10);
				System.out.println("substraction:" + (calc2.multiply()));

				Calculator calc3 = new Calculator(5, 10);
				System.out.println("substraction:" + (calc3.divide()));

			} catch (ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			}catch (NumberFormatException e) {
	            System.out.println("Error: Invalid input. Please enter valid numbers.");
	        }

		}

	}

}
