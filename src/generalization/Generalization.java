package generalization;

public class Generalization {

	public static void main(String[] args) {

		SBI s= new SBI();
		Axis a= new Axis();
		
		System.out.println("================");
		s.savingAccount();
		s.FD();
		s.loan();
		s.yono();
		
		System.out.println("===============");
		a.savingAccount();
		a.FD();
		a.loan();
		a.cashDepositeMachine();
		System.out.println("===============");

		
		
	}

}
