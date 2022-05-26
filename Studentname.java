package week4.day3;

public class Studentname extends Department {
	
		
		public void studentName() {
			System.out.println("Gukan");
		}
		public void studentDept() {
			System.out.println("CSE");
		}
		public void studentId() {
			System.out.println("7598704010");
		}
		public static void main(String[] args) {
			Studentname obj3=new Studentname();
			obj3.studentId();
			obj3.studentName();
			
			Department objj=new Department();
			objj.deptName();
			
			College obj=new College();
			obj.collegeCode();
			obj.collegeName();
			obj.collegeRank();
		}
		

}
