package Inheritence;

class Teacher {
	String Designation = "Teacher";
	String Salary = "35000";

	void does() {
		System.out.println("Teaching");
	}
}

class JavaTeacher extends Teacher {
	String MainSubject = "Java";

	public static void main(String[] args) {
		JavaTeacher obj = new JavaTeacher();
		System.out.println(obj.Designation);
		System.out.println(obj.Salary);
		System.out.println(obj.MainSubject);
	}
}


