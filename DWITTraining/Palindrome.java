import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){

		Scanner Sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num = Sc.nextInt();

		int sum=0;
		int org =num;

		while(num>0){
			int rem = num%10;
			sum = sum*10+rem;
			num = num/10; 
		}

		if (sum == org){
			System.out.println("ENTERED NUMBER IS PALINDROME");

		}
		else {
			System.out.println("ENTERED NUMBER IS NOT PALINDROME");
		}
	}
}