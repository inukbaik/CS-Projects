package Fall_Demos;

public class TestEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolAssociate sa = new SchoolAssociate("Joe Cool", "123 Hemming way, Georgetown, Va.", "111-1111", "jcool@school.edu");
		Employee e = new Employee("Dan der", "456 B st, London, Eng", "123-4567", "dder@school.edu", "B401");
		Faculty f = new Faculty ("Tom Thumb", "789 C road, New York, New York", "456-7890", "tthumb@school.edu", "CS", "Lecturer");
		
		System.out.println("SchoolAssociate: " + sa);
		System.out.println("Emplyee: " + e);
		System.out.println("Faculty: " + f);
	}

}
