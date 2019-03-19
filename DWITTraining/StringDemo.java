public class StringDemo{
	public static void main(String[] args){

	int a[]= {1,3,4,5,6,8};

	try{
	System.out.println(a[2]);
	System.out.print(a[8]);
		}
	catch(ArrayIndexOutOfBoundsException e){


		System.out.println("The index you have entered is invalid");
         System.out.println("Please enter an index number between 0 and 6");

	}	

	}
}