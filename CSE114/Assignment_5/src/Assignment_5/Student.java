package Assignment_5;

//Name: Inuk Baik
//SBU ID: 112493042
//email: inuk.baik@stonybrook.edu

public class Student {
	private String firstName;
	private String lastName;
	private int studentId;
	private int quizScores[] = new int[8];
	private int assignmentScores[] = new int[8];
	private int examScores[] = new int[4];
	private int labScores[] = new int[8];
	private int weights[] = new int[4];
	
	//constructor initializes the values 
	//and set the value of each element in 4 score arrays to -1.
	public Student(String firstName, String lastName, int studentId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		
		for (int i = 0; i < quizScores.length; i++) {
			quizScores[i] = -1;
		}
		for (int i = 0; i < assignmentScores.length; i++) {
			assignmentScores[i] = -1;
		}
		for (int i = 0; i < examScores.length; i++) {
			examScores[i] = -1;
		}
		for (int i = 0 ; i < labScores.length; i++) {
			labScores[i] = -1;
		}
	}
	
	//getter methods
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public int[] getQuizScores() {
		return quizScores;
	}
	public int[] getAssignmentScores() {
		return assignmentScores;
	}
	public int[] getExamScores() {
		return examScores;
	}
	public int[] getLabScores() {
		return labScores;
	}
	
	//setter methods
	public void addQuizGrade (int score) {
		for (int i = 0; i < quizScores.length; i++) {
			if (quizScores[i] == -1) {
				quizScores[i] = score;
				break;
			}
		}
	}
	public void removeQuizGrade (int score) {
		for (int i = 0; i < quizScores.length; i++) {
			if (quizScores[i] == score) {
				quizScores[i] = -1;
				break;
			}
		}
	}
	public void addAssignmentGrade (int score) {
		for (int i = 0; i < assignmentScores.length; i++) {
			if (assignmentScores[i] == -1) {
				assignmentScores[i] = score;
				break;
			}
		}
	}
	public void removeAssignmentGrade (int score) {
		for (int i = 0; i < assignmentScores.length; i++) {
			if (assignmentScores[i] == score) {
				assignmentScores[i] = -1;
				break;
			}
		}
	}
	public void addExamGrade (int score) {
		for (int i = 0; i < examScores.length; i++) {
			if (examScores[i] == -1) {
				examScores[i] = score;
				break;
			}
		}
	}
	public void removeExamGrade (int score) {
		for (int i = 0; i < examScores.length; i++) {
			if (examScores[i] == score) {
				examScores[i] = -1;
				break;
			}
		}
	}
	public void addLabGrade (int score) {
		for (int i = 0; i < labScores.length; i++) {
			if (labScores[i] == -1) {
				labScores[i] = score;
				break;
			}
		}
	}
	public void removeLabGrade (int score) {
		for (int i = 0; i < labScores.length; i++) {
			if (labScores[i] == score) {
				labScores[i] = -1;
			}
		}
	}
	public void setWeights (int[] weights) {
		int sum = 0;
        for(int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        	if (sum == 100) {
        		this.weights = weights;
        }
	}
	
	//Class Aggregation Methods
	public double averageQuizScore() {
        double sumQuizScore = 0.0;
        double count = 0.0;
        for(int i = 0; i < quizScores.length; i++) {
            if(quizScores[i] != -1) {
                sumQuizScore += quizScores[i];
                 count++;
            }
        }
        return sumQuizScore / count;
    }
	public double averageAssignmentScore() {
        double sumAssignmentScore = 0.0;
        double count = 0.0;
        for(int i = 0; i < assignmentScores.length; i++) {
            if(assignmentScores[i] != -1) {
                sumAssignmentScore+= assignmentScores[i];
                 count++;
            }
        }
        return sumAssignmentScore / count;
    }
	public double averageExamScore() {
        double sumExamScore = 0.0;
        double count = 0.0;
        for(int i = 0; i < examScores.length; i++) {
            if(examScores[i] != -1) {
                sumExamScore += examScores[i];
                 count++;
            }
        }
        return  sumExamScore / count;
    }
	public double averageLabScore() {
        double sumLabScore = 0.0;
        double count = 0.0;
        for(int i = 0; i < labScores.length; i++) {
            if(labScores[i] != -1) {
                sumLabScore += labScores[i];
                 count++;
            }
        }
        return sumLabScore / count;
    }
	
	//weighted average method which calls the average methods & computes
	public double calculateGrade() {
        double [] cumulativeScore = new double[4];
        double totalGrade = 0.0;
        for(int i = 0; i < cumulativeScore.length; i++){
        	if (i == 0) {
        		cumulativeScore[0] = (weights[0] * 0.01) * averageQuizScore();
        	} else if (i == 1) {
        		cumulativeScore[1] = (weights[1] * 0.01) * averageAssignmentScore();
        	} else if (i == 2) {
        		cumulativeScore[2] = (weights[2] * 0.01) * averageExamScore();
        	} else if (i == 3) {
        		cumulativeScore[3] = (weights[3] * 0.01) * averageLabScore();
        	}
        }
        for(int i = 0; i < cumulativeScore.length; i++){
            totalGrade += cumulativeScore[i];
        }
        return totalGrade;
    }

}
