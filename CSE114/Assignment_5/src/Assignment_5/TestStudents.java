package Assignment_5;

public class TestStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("John", "Doe", 123456);
		Student s2 = new Student("Jane", "Doe", 123457);
		Student s3 = new Student("Zoey", "Deschenal", 123458);
		Student s4 = new Student("Joseph", "Cool", 123459);
		Student s5 = new Student("Andy", "Mountains", 123460);
		Student s6 = new Student("Rose", "Tyler", 123461);
//		Student s7 = new Student("Ronald", "McDonald", 123462);
//		Student s8 = new Student("Sandy", "Shores", 123463);
		int[] weights = {10, 40, 20, 30};
		int[] weights2 = {45, 5, 45, 5};
		Student[] registered = {s1, s2, s3, s4};
		Roster cse114Roster = new Roster("CSE114", registered);
		
		
		s1.addAssignmentGrade(99);
		s1.addAssignmentGrade(99);
		s1.addAssignmentGrade(97);
		s1.addQuizGrade(75);
		s1.addQuizGrade(60);
		s1.addQuizGrade(60);
		s1.addExamGrade(50);
		s1.addExamGrade(65);
		s1.addLabGrade(90);
		s1.addLabGrade(92);
		s1.addLabGrade(87);
		s1.addLabGrade(99);
		s1.addLabGrade(99);
		
		System.out.println("\nStudent 1, standard weights:");
		s1.setWeights(weights);
		double s1grade = s1.calculateGrade();
		
		System.out.println("\n   Grade for s1: " + s1grade);
		
		System.out.println("\nStudent 1, modified weights:");
		s1.setWeights(weights2);
		double s1grade2 = s1.calculateGrade();
		
		System.out.println("\n   Grade for s1 (2): " + s1grade2);
		
		s2.addAssignmentGrade(80);
		s2.addAssignmentGrade(70);
		s2.addAssignmentGrade(90);
		s2.addQuizGrade(60);
		s2.addQuizGrade(-1);
		s2.addQuizGrade(75);
		s2.addExamGrade(80);
		s2.addExamGrade(-1);
		s2.addLabGrade(20);
		s2.addLabGrade(17);
		s2.addLabGrade(90);
		s2.addLabGrade(95);
		s2.addLabGrade(80);
		
		System.out.println("\nStudent 2, standard weights:");
		s2.setWeights(weights);
		double s2grade = s2.calculateGrade();
		
		System.out.println("\n   Grade for s2: " + s2grade);
		
		System.out.println("\nStudent 2, modified weights:");
		s2.setWeights(weights2);
		double s2grade2 = s2.calculateGrade();
		
		System.out.println("\n   Grade for s2 (2): " + s2grade2);
		
		
		s3.addAssignmentGrade(80);
		s3.addAssignmentGrade(70);
		s3.addAssignmentGrade(90);
		s3.addQuizGrade(10);
		s3.addQuizGrade(30);
		s3.addQuizGrade(75);
		s3.addExamGrade(90);
		s3.addExamGrade(90);
		s3.addLabGrade(80);
		s3.addLabGrade(40);
		s3.addLabGrade(90);
		s3.addLabGrade(95);
		s3.addLabGrade(80);
		
		System.out.println("\nStudent 3, standard weights:");
		s3.setWeights(weights);
		double s3grade = s3.calculateGrade();
		
		System.out.println("\n   Grade for s3: " + s3grade);
		
		System.out.println("\nStudent 3, modified weights:");

		s3.setWeights(weights2);
		double s3grade2 = s3.calculateGrade();
		
		System.out.println("\n   Grade for s3 (2): " + s3grade2);
		

		
		s4.addAssignmentGrade(80);
		s4.addAssignmentGrade(70);
		s4.addAssignmentGrade(90);
		s4.addQuizGrade(10);
		s4.addQuizGrade(20);
		s4.addQuizGrade(75);
		s4.addExamGrade(80);
		s4.addExamGrade(90);
		s4.addLabGrade(10);
		s4.addLabGrade(17);
		s4.addLabGrade(95);
		s4.addLabGrade(75);
		s4.addLabGrade(87);
		
		System.out.println("\nStudent 4, standard weights:");
		s4.setWeights(weights);
		double s4grade = s4.calculateGrade();
		
		System.out.println("\n   Grade for s4: " + s4grade);
		
		System.out.println("\nStudent 4, modified weights:");
		s4.setWeights(weights2);
		double s4grade2 = s4.calculateGrade();
		
		System.out.println("\n   Grade for s4 (2): " + s4grade2);

		
		s5.addAssignmentGrade(80);
		s5.addAssignmentGrade(80);
		s5.addAssignmentGrade(90);
		s5.addQuizGrade(100);
		s5.addQuizGrade(100);
		s5.addQuizGrade(100);
		s5.addExamGrade(100);
		s5.addExamGrade(100);
		s5.addLabGrade(100);
		s5.addLabGrade(100);
		s5.addLabGrade(100);
		s5.addLabGrade(100);
		s5.addLabGrade(100);
		
		System.out.println("\nStudent 5, standard weights:");
		s5.setWeights(weights);
		double s5grade = s5.calculateGrade();
		
		System.out.println("\n   Grade for s5: " + s5grade);
		
		System.out.println("\nStudent 5, modified weights:");
		s5.setWeights(weights2);
		double s5grade2 = s5.calculateGrade();
		
		System.out.println("\n   Grade for s5 (2): " + s5grade2);
		
		System.out.println("\nClass Average: Quizzes: ");

		System.out.print("\n   Average Quiz 1: ");
		System.out.println(cse114Roster.quizAverage(1));

		System.out.print("\n   Average Quiz 2: ");
		System.out.println(cse114Roster.quizAverage(2));
		
		System.out.print("\n   Average Quiz 3: ");
		System.out.println(cse114Roster.quizAverage(3));
		
		System.out.print("\n   Average Quiz 4: ");
		System.out.println(cse114Roster.quizAverage(4));
		
		System.out.println("Students in class: ");
		Student[] slist1 = cse114Roster.getAllStudents();
		for (int i = 0; i < slist1.length; i++) {
			if (slist1[i] == null) {
				break;
			}
			System.out.println("Name: " + slist1[i].getFirstName() + " " + slist1[i].getLastName() + " Id: " + slist1[i].getStudentId());			
		}
		System.out.println("\nClass Average: Assignments: ");

		System.out.print("\n   Average Assignment 1: ");
		System.out.println(cse114Roster.assignmentAverage(1));

		System.out.print("\n   Average Assignment 2: ");
		System.out.println(cse114Roster.assignmentAverage(2));

		System.out.println("\nClass Average: Exams: ");
		
		System.out.print("\n   Average Exam 1: ");
		System.out.println(cse114Roster.examAverage(1));

		System.out.print("\n   Average Exam 2: ");
		System.out.println(cse114Roster.examAverage(2));
		
		System.out.println("Removing student 3.");
		cse114Roster.removeStudent(123458);
		System.out.println("Adding student 5.");
		cse114Roster.addStudent(s5);
		
		System.out.println("Students in class: ");
		slist1 = cse114Roster.getAllStudents();
		for (int i = 0; i < slist1.length; i++) {
			if (slist1[i] == null) {
				break;
			}
			System.out.println("Name: " + slist1[i].getFirstName() + " " + slist1[i].getLastName() + " Id: " + slist1[i].getStudentId());			
		}
		System.out.println("\nClass Average: Quizzes: ");

		System.out.print("\n   Average Quiz 1: ");
		System.out.println(cse114Roster.quizAverage(1));

		System.out.print("\n   Average Quiz 2: ");
		System.out.println(cse114Roster.quizAverage(2));
		
		System.out.print("\n   Average Quiz 3: ");
		System.out.println(cse114Roster.quizAverage(3));
		
		System.out.print("\n   Average Quiz 4: ");
		System.out.println(cse114Roster.quizAverage(4));
		
		System.out.println("\nClass Average: Assignments: ");

		System.out.print("\n   Average Assignment 1: ");
		System.out.println(cse114Roster.assignmentAverage(1));

		System.out.print("\n   Average Assignment 2: ");
		System.out.println(cse114Roster.assignmentAverage(2));

		System.out.println("\nClass Average: Exams: ");
		
		System.out.print("\n   Average Exam 1: ");
		System.out.println(cse114Roster.examAverage(1));

		System.out.print("\n   Average Exam 2: ");
		System.out.println(cse114Roster.examAverage(2));
		
	}

}
