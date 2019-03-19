import java.util.Scanner;
import java.lang.Math;

public class ArmStrongTest{
    public static void main(String args[])
    {
        int num, temp,digits = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if it is an Armstrong number");
        num = in.nextInt();

        temp = num;

        while (temp != 0) {
            digits++;
            temp = temp/10;
        }

        temp = num;
        
        String str = Integer.toString(num);
        int rem;
        int result = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            result = result + ((int) Math.pow(rem, str.length()));
        }
        if (result == temp) {
            System.out.print(temp + "IS A ARMSTRONG NO ");
            } 
        else {
            System.out.println(temp + "   IS NOT an Armstrong number.");
            }
    }
}