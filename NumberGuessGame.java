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
