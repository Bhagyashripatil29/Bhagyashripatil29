package generalization;

public class SBI implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("SBI Saving Account interest Rate is 7%");
		
	}

	@Override
	public void FD() {
		System.out.println("SBI FD interest Rate is 10%");
		
	}

	@Override
	public void loan() {
		System.out.println("SBI loan Account interest Rate is 8.9%");

		
	}
	public void yono() {
		System.out.println("SBI YONO mobile banking app");

	}

}
