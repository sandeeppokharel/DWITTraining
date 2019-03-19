import java.util.Scanner;
public class SwitchDemo{


	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the week day value");
	int day =scan.nextInt();
	/*
	String dayName = SwitchDemo.getDayName(day);
	System.out.println();
	*/

	System.out.println(SwitchDemo.getDayName(day));
}


	public static String getDayName(int day){
		String dayName ="";

		switch(day){

			 case 1:
			 dayName = "SUNDAY";
			 break;
			 case 2:
			 dayName = "MONDAY";
			 case 3:
			 dayName ="TUESDAY";
			 break;
			 case 4:
			 dayName ="WEDNESDAY";
			 break;
			 case 5:
			 dayName ="THURSDAY";
			 break;
			 case 6:
			 dayName ="FRIDAY";
			 break;
			 case 7:
			 dayName ="SATURDAY";
			 break;
			 default:
			 dayName = "Please Enter valid Range";
		}
		return dayName;
	}
}