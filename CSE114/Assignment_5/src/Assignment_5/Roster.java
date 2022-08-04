package Assignment_5;

//Name: Inuk Baik
//SBU ID: 112493042
//email: inuk.baik@stonybrook.edu

public class Roster {
	private String courseId;
	private Student students[] = new Student[30];
	private int nextStudent = 0;
	
	//constructor adds the individual Student objects from the array
	//into it's own array of Student objects.
	//it sets nextStudent to the number of student objects added.
	public Roster(String courseId, Student students[]) {
		this.courseId = courseId;
		for(int i = 0; i < students.length; i++) {
            this.students[i] = students[i];
        }
        this.nextStudent = students.length;
    }
	//constructor sets the first element of the Student arrya to that object.
	//sets nextStudent to 1.
	public Roster(String courseId, Student student) {
		this.courseId = courseId;
		this.students[0] = student;
		this.nextStudent = 1;
	}
	
	//getter methods
	public Student getStudent(int studentId) {
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStudentId() == studentId) {
				return students[i];
			}
		}
		return null;
	}
	public Student[] getAllStudents() {
		return students;
	}
	
	//setter methods
	public void addStudent(Student student) {
		this.students[this.nextStudent] = student;
        this.nextStudent++;
	}
	public void removeStudent(int studentId) {
        int saveStudent = -1;
        for(int i = 0; i < students.length; i++) {
            if(students[i].getStudentId() == studentId) {
               saveStudent = i;
                break;
            }
        }
        for(int i = saveStudent; i < students.length; i++){
            if(i == 29){
                break;
            }
            students[i] = students[i + 1];
        }
        this.nextStudent--;
    }
	
	//Class Aggregation Methods
	public double quizAverage(int quizNum) {
        double quizSum = 0.0;
        double count = 0.0;
        for(int i = 0; i < nextStudent; i++){
            if(students[i].getQuizScores()[quizNum - 1] != -1) {
               quizSum += students[i].getQuizScores()[quizNum - 1];
                count++;
            }
        }
        if(count == 0){
            return -1.0;
        }

        return quizSum / count;
    }
	public double assignmentAverage(int assignmentNum) {
        double assignmentSum = 0.0;
        double count = 0.0;
        for(int i = 0; i < nextStudent; i++){
            if(students[i].getAssignmentScores()[assignmentNum - 1] != -1) {
               assignmentSum += students[i].getAssignmentScores()[assignmentNum - 1];
                count++;
            }
        }
        return assignmentSum / count;
    }
	public double labAverage(int labNum) {
        double labSum = 0.0;
        double count = 0.0;
        for(int i = 0; i < nextStudent; i++){
            if(students[i].getLabScores()[labNum - 1] != -1) {
               labSum += students[i].getLabScores()[labNum - 1];
                count++;
            }
        }
        return labSum / count;
    }
	public double examAverage(int examNum) {
        double examSum = 0.0;
        double count = 0.0;
        for(int i = 0; i < nextStudent; i++){
            if(students[i].getExamScores()[examNum - 1] != -1) {
               examSum += students[i].getExamScores()[examNum - 1];
                count++;
            }
        }
        return  examSum / count;
    }
}
