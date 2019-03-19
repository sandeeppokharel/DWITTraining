 
public class ArmNumbers {

    public static void main(String[] args) {
        System.out.println("Armstrong Numbers 1 to 10000 >>");
        for (int i = 1; i <= 10000; i++) {
            if (Armstrong(i) == true) {
                System.out.print(i + " ");
            }
        }
 public static boolean Armstrong(int num) {
        int num1 = num;
        /* Converting Integer to String. It'll help to find number of
        digits in the Integer by using length() */
        String str = Integer.toString(num);
        int rem;
        int result = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            result = result + ((int) Math.pow(rem, str.length()));
        }
        if (result == num1) {
            return true;
        } else {
            return false;
        }
    }