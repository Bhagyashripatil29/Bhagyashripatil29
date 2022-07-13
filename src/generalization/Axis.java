package generalization;

public class Axis implements RBI {

	@Override
	public void savingAccount() {
		System.out.println("Axis Saving Account interest Rate is 9%");
		
	}

	@Override
	public void FD() {
		System.out.println("Axis FD Account interest Rate is 11%");
		
	}

	@Override
	public void loan() {
		System.out.println("Axis loan Account interest Rate is 11.99%");
		
	}
	
	public void cashDepositeMachine() {
		System.out.println("Axis CDM Machine");

	}

}
