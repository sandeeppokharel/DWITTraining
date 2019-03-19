public class LoopDemo{
	public static void printForLoopData(){
		System.out.println("CALLING FOR LOOP");
		for (int i=0;i<=5;i++){
			System.out.println(i);
		}

	}


	public static void printWhileLoopData(){
		System.out.println("CALLING WHILE LOOP");
		int num =1;
		while(true){
/*		while(num<=5){
	
}
FOR FALSE 
		boolean isTrue = false;
		while(isTrue){}

*/

			System.out.println(num);
			num++;
		}
	}

	public static void printDoWhileLoopData(){
		System.out.println("CALLING DO.... WHILE LOOP");
		int num =1;
		do{
			System.out.println(num);
			num++;
		}while(num <=5);

/*BOOLEAN

		boolean isTrue = false;
		int num =1;
		do{
			System.out.println(num);
			num++;
			}while(isTrue);
		}
*/
	}

	public static void main(String args[]){
		LoopDemo.printForLoopData();
		LoopDemo.printWhileLoopData();
		LoopDemo.printDoWhileLoopData();

	}
}
	