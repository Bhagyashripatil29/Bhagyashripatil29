package Constructor;
//This is UserDefined Constructor
public class CC {

	String name;
	int RollNo, age;
	char blood_group;
	float percent;

	public CC(String n, int no, int a, char bg, float p) {  //user defined with multiple parameter constructor

		name = n;
		RollNo = no;
		age = a;
		blood_group = bg;
		percent = p;

	}

	public CC(String n, char bg) {  // user defined with two parameter constructor

		name = n;
		blood_group = bg;

	}

	public void display() {

		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("Name is: " + name);
		System.out.println("Roll No is:" + RollNo);
		System.out.println("Age is: " + age);
		System.out.println("Blood Group: " + blood_group);
		System.out.println("Percent is: " + percent);
		System.out.println("++++++++++++++++++++++++++++++++++++");
	}

	public static void main(String[] args) {

		CC c1 = new CC("Shreeyu", 101, 24, 'O', 75.83f);
		c1.display();

		CC c2 = new CC("Ashwiryaa", 'B');
		c2.display();

	}

}
