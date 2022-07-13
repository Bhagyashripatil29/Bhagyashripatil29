package Inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {

		singleLevelMother m=new singleLevelMother();
		
		singleLevelChild c= new singleLevelChild();
		
		m.nature();
		singleLevelMother.care();
		
		c.mobile();
		singleLevelChild.Laptop();
		
		c.nature();
		singleLevelChild.care();
		
	}

}
