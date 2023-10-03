package LearnJavaClassMethods;

public class Learn_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = new int[3]
		//int a[]= new int[3]; //Declaration and Creation of array
		
		//Assigning values
		//a[0]= 9;
		//[1]=5;
		//a[2]=7;
		
		//another way of declaring and assigning and create
		
		int a[]= {9,5,7,5,6,5,2,3,1,8};
		//For Loop
		for(int i =0 ; i<a.length;i++) {			
			
			System.out.println(a[i]);
		}
		
		//For Each Loop specifically for array
		for(int j:a) {
			if (j==6) {
				break;
			}
			System.out.println(j);
		}
		//Accessing
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		//Size of the array
		System.out.println(a.length);
		
	}

}
