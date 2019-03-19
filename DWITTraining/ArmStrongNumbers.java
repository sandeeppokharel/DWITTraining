import java.util.Scanner;
import java.lang.Math;

public class ArmStrongNumbers {
    public static void main(String args[])
    {
        long n, sum = 0, temp, remainder, digits = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if it is an Armstrong number");
        n = in.nextLong();

        temp = n;

        // Count number of digits

        while (temp != 0) {
            digits++;
            temp = temp/10;
        }

        temp = n;

        while (temp != 0) {
            remainder = temp%10;
            sum = sum + ((int) Math.pow(remainder, digits));
            temp = temp/10;
        }

        if (n == sum)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " isn't an Armstrong number.");
    }
}