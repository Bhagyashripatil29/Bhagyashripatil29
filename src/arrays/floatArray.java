package arrays;

public class floatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Array declaration
		float height[]=new float[3];
		
		//2. Array initialization
		height[0]=5.5f;
		height[1]=5.8f;
		height[2]=6.1f;
		
		//3.usage
		System.out.println(height[0]);
		System.out.println(height[1]);
		System.out.println(height[2]);
		System.out.println("================");
		
		//1.Static for loop
		for(int i=0;i<=height.length-1;i++) {
			System.out.println(height[i]);
		}
		
		System.out.println("===================");
		
		//2.Dynamic for loop
		for(int i=height.length-1;i>=0;i--) {
			System.out.println(height[i]);
		}
		

	}

}
