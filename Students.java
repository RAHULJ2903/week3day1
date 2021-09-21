package week3day1;

public class Students {
	public void getStudentsInfo(int collegeid) {
		System.out.println("COLLEGE ID ="+collegeid);
	}
	public void getStudentInfo(int a , String b) {
		System.out.println("STUDENT ID ="+a);
		System.out.println("STUDENT NAME ="+b);
	}
	public void getStudentsInfo(String string , int B) {
		System.out.println("STUDENT EMAIL ="+string);
		System.out.println("STUDENT PHONE NUMBER ="+B);
	}

	public static void main(String[] args) {
		Students a = new Students();
		a.getStudentsInfo(2451546);
		a.getStudentInfo(121544, "Rahul");
		a.getStudentsInfo("rahul@gmail.com", 959842352);

	}

}
