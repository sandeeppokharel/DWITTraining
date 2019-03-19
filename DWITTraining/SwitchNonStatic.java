import java.util.Scanner;
public class SwitchNonStatic{


	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the week day value");
	int day =scan.nextInt();
	SwitchNonStatic st = new SwitchNonStatic();
	System.out.println(st.getDayName(day));
	/*
	String dayName = SwitchDemo.getDayName(day);
	System.out.println();
	*/
}
	public  String getDayName(int day){
		String dayName ="";

		switch(day){

			 case 1:
			 dayName = "SUNDAY";
			 //break;
			 case 2:
			 dayName = "MONDAY";
			 //break;
			 case 3:
			 dayName ="TUESDAY";
			 //break;
			 case 4:
			 dayName ="WEDNESDAY";
			// break;
			 case 5:
			 dayName ="THURSDAY";
			// break;
			 case 6:
			 dayName ="FRIDAY";
			// break;
			 case 7:
			 dayName ="SATURDAY";
			 //break;
			 default:
			 dayName = "Please Enter valid Range";
		}
		return dayName;
	}
}