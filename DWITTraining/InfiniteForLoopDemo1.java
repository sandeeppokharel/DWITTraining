public class InfiniteForLoopDemo1{
	
	public static void main(String[]args){
	for(int i=0; true ;i++){

		if (i > 1000){
			break;
		}


	System.out.print(+i+",");
	}
	}
}