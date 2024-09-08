// Task 1
// To Create Number Guess Game
package codsoft.com;
import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		double random =Math.random()*(100-1+1)+1;
		int randm = (int)random;
		int guess = 0; 
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println(" Enter the number of Attempts");
		char option;
		int attempts = s.nextInt();
		int limit =0;
		int score = 0;
		
		
		 while(guess!= randm)
		 {
			 System.out.println("Enter the no:");
			 guess = s.nextInt ();
			 
			 if( guess == randm)
			 {
				 System.out.println("Congratulation!.....Your guess is correct");
				  score ++;
				   random =  Math.random()*100;
				   
				   randm = (int)random;
				   
			 } 
			 
			 else if (guess>=randm) 
			 {
				 System.out.println("Too High");
				 limit ++;
				 
			}else {
				System.out.println("Too Low");
				limit ++;
			}
			 if(limit >=attempts)
			 {
				 System.out.println(" Do you  want to play again? yes/No");
				 option = s.next().charAt(0);
				 
				 if(option =='y') {
					 
					 attempts ++;
					 
				}
				 else if (option =='n')
				 {
					 break;
					 
				 }
				 
			 }
		
		 }
		 attempts = attempts-1;
		 System.out.println("You Won" + " 1"+ score);
		 System.out.println("Your Attempts"+ " "+ attempts);
		 System.out.println("Congratulation!.....Your guess is correct");
	}

}


//Task 2
// STUDENTS GARADE CALCULATOR

package codesoft.com.task2;
import java.util.Scanner;



public class StudentMarksCalculator {

    public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
           System.out.println("Enter the number of subjects: ");
		   int numberOfSubjects = scanner.nextInt();
           int[] marks = new int[numberOfSubjects];

			        
			        for (int i = 0; i < numberOfSubjects; i++) {
			            System.out.println("Ente the mark subject " + (i + 1) + ": ");
			            marks[i] = scanner.nextInt();
			        }

			        // total marks
			        int totalMarks = 0;
			        for (int mark : marks) {
			            totalMarks += mark;
			        }

			       // Average
			        float averagePercentage = (float) totalMarks / numberOfSubjects;
                    String grade;
			        if (averagePercentage >= 90) {
			            grade = "A";
			        } else if (averagePercentage >= 80) {
			            grade = "B";
			        } else if (averagePercentage >= 70) {
			            grade = "C";
			        } else if (averagePercentage >= 60) {
			            grade = "D";
			        } else {
			            grade = "F";
			        }

			        // Display  results
			        System.out.println("Total marks: " + totalMarks+"/"+(numberOfSubjects*100));
			        System.out.println("Average percentage: " + averagePercentage);
			        System.out.println("Grade: " + grade);
			        scanner.close();
			    }
			}

		


