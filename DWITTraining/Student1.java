public class Student1{


	int id;
	static int staticId;
	String name;
public void printData(){

	
	++id;
	++staticId;
	System.out.println("Instance variable"+id);
	System.out.println("Static variable"+staticId);
  }	
}