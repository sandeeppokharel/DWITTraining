public class Operation{
	
	public float add (float a, float b){
		return a+ b;
		//System.out.println("result for multipication is"+(a+b) );
	}

	public float sub(float a, float b){
		return a-b;

	}
	public float mul(float a, float b){
		return a*b;
	}
	public float div(float a, float b){
		return a/b;
	}
	public float mod(float a, float b){
		return a%b;
	}
	public void printResult(String resultType, float r){
		System.out.println("REQUIRED VALUES ARE :"+resultType+ " "+r);
	}
}