package casting;

public class UpCasting {

	public static void main(String[] args) {

		Father f = new Father();
		Son s = new Son();
		
		f.car();
		f.bike();
		
		s.bike();
		s.car();
		
		Father f1 =new Son();
		System.out.println("==========");
		f1.bike();
		f1.car();
		//f1.education();This property only son so subclass are not eligible for upcasting...its only own property
	}

}
