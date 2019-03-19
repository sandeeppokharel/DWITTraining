public class BreakExample{
	public static void main(String[] args){

	breakMessage();
	}


	public static void breakMessage(){

	 for (int i=1 ;i <= 10; i++){

	 	if (i==5){
	 	continue;
	 	//break;  
	 	}

	 	System.out.println("the values are:"+ i);
	 }

	}
}