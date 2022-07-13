package MethodStudy;

public class UniversityResult {

	public static void main(String[] args) {

		UniversityResult ur = new UniversityResult();
		ur.StudentInfo();
		
		ur.studentInfo1("Manu", 101, 'A', 100.20f);
		ur.studentInfo1("Dhanu", 102, 'B', 500.20f);
		ur.studentInfo1("Shreeyu", 103, 'C', 800.20f);
		ur.studentInfo1("Saisha", 104, 'D', 700.20f);
		ur.studentInfo1("Niyati", 105, 'E', 900.20f);

		
	}
	
	public void StudentInfo() {      //without parameter
		
		//name,roll_no,grade,total_marks
		
		String studentName = "Velocity";
		int RollNo = 100;
		char grade = 'A';
		float totalMarks = 500.25f;
		
		System.out.println("        Student Infromation        ");
		System.out.println("============================================");
		System.out.println("Student Name is: "+ studentName);
		System.out.println("Student RollNo is: "+RollNo);
		System.out.println("Student grade is: "+grade);
		System.out.println("Student TotalMarks: "+totalMarks);
		System.out.println("============================================");
	}
	
	public void studentInfo1(String studentName,int RollNo, char grade,float totalMarks) {
		
		System.out.println("        Student Infromation        ");
		System.out.println("============================================");
		System.out.println("Student Name is: "+ studentName);
		System.out.println("Student RollNo is: "+RollNo);
		System.out.println("Student grade is: "+grade);
		System.out.println("Student TotalMarks: "+totalMarks);
		System.out.println("============================================");
		
	}
}
