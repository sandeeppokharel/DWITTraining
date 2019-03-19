import java.util.Scanner;
public class IfExample{
	
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	double m;

	System.out.println("Enter the marks of the student");
	m = scan.nextDouble();

	if(m>=80 && m<100){
		System.out.println("CONGRATULATIONS !! PASSED WITH DISTINCTIO");
	}
		else if(m>=60 && m<80){
		System.out.println("CONGRATULATIONS PASSED WITH 1ST DIV");	

		}

		else if(m>100){
			System.out.println("PLEASE ENTER THE VALID RANGE OF 0 TO 100");

		}
		else {
			System.out.println("TRY AGAIIN NEXT TIME");
		}
	}
	}
