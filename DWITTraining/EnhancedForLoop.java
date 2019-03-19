public class EnhancedForLoop{
	public static void main(String[]args){
		int a[]={1,3,4,5,6,8};
		int temp;
		int n=6;
		for (int i :a){
			System.out.print(i+",");
				// System.out.println(a);
		}
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
            System.out.println("Ascending Order:"+a[i]);
        }
    }
}
        /*System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
		}
	}
	*/