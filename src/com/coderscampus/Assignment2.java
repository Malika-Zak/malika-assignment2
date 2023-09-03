package com.coderscampus;

import java.util.Scanner;
import java.util.Random;
public class Assignment2 {

	public static void main(String[] args) {
		Random random = new Random();
		int numberToGuess = random.nextInt((100 - 1) +1);
		int numberOfGuesses = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 100");

		boolean win = false;
		
		
		while (win == false) {
			int guess = scanner.nextInt();
			if (numberOfGuesses > 6 && guess!= numberToGuess ) {
				System.out.println("You lose!");
				System.out.println("The number to guess was: " + numberToGuess);
				break;}
			numberOfGuesses+=1;
		
			if (guess == numberToGuess) {
				win = true;
				System.out.println("You Win!");
				System.out.println("The number to guess was: " + numberToGuess);
			}
			else if (guess>100 || guess<1) {
				System.out.println("Your guess is not between 1 and 100, please try again!");
				numberOfGuesses-=1;

			}
			else if (guess < numberToGuess) {
				System.out.println("Please pick a higher number");
				numberOfGuesses+=1;

			}
			else if (guess > numberToGuess) {
				System.out.println("Please pick a lower number");
				numberOfGuesses+=1;

			}
			
			
		}
	}
}
