import java.util.Scanner;
public class Calc{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the value of first no");
	float a = scan.nextFloat();
	System.out.println("Enter the value of second no");
	float b = scan.nextFloat();


	Operation op = new Operation();

	float addResult= op.add(a,b);

	float subResult = op.sub(a,b);

	float mulResult = op.mul(a,b);
	// System.out.println("result for multipication is"+mulResult);

	float divResult = op.div(a,b);
	//System.out.println("result for division is"+divResult);

	float modResult = op.mod(a,b);
	//System.out.println("result for modulo :"+modResult);

	op.printResult("ADDITION->" ,addResult);
	op.printResult("SUBTRACTION->" ,subResult);
	op.printResult("PRODUCT->", mulResult);
	op.printResult("DIVISOR->", divResult);
	op.printResult("REMAINDER->", modResult);

	
	
	}
}