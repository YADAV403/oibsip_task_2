package com.Task_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {

		int minValue = 1;
		int maxValue = 100;
		int maxChances = 5;
		int score = 0;
		int rNumber;
		int gNumber;

		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		System.out.println();
		System.out.println("Lets Start the Number Guessing Game");
		System.out.println("---------------------------------------------");
		System.out.println("Here are the rules");
		System.out.println("-----------------------------------");
		System.out.println("1.You will have Five chances to the guess the Number\n2.Scores will be displayed");
		System.out.println("---------------------------------------------");

		rNumber = r.nextInt(maxValue);
		
		int usedChances = 0;
		while(usedChances < maxChances) {
			System.out.println("Guess the Number:");
			gNumber = scan.nextInt();

			if(gNumber > maxValue || gNumber < minValue) {
				System.out.println("Please guess the number between the given range");
				System.out.println("---------------------------------------------");
			}

			else if (rNumber == gNumber) {
				System.out.println("Woooh, you have guessed the correct number");
				System.out.println("---------------------------------------------");
				score += 5;
				break;
			}

			else if(rNumber < gNumber) {
				System.out.println("Guessed number is high");
				System.out.println("---------------------------------------------");
			}

			else {
				System.out.println("Guessed number is low");
				System.out.println("---------------------------------------------");
			}
			usedChances++;
			System.out.println("You have " + (maxChances-usedChances) + " more chances left");
		}
		
		if(usedChances == maxChances) {
			System.out.println("Correct Number= " + rNumber);
			System.out.println("---------------------------------------------");
		}
		
		System.out.println("Total score= " + score);
		System.out.println("---------------------------------------------");
	}
}
