package anotherAccessSpecifier;

import AccessSpecifiers.PrivateUse;

public class testing extends PrivateUse{

	public static void main(String[] args) {

	PrivateUse p=new PrivateUse();
	p.test4();   //calling public method
	
	
	testing t=new testing();
	t.test3();  //calling protected method from another class
	t.test4();  //calling public method from another class
		
	}

}
