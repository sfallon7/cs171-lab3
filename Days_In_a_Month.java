//Sean Fallon
//COMP-171
//Fall-19
//Lab 3

import java.util.Scanner;

public class Days_In_a_Month {

	public static void main(String[] args ) {
		
		Scanner input = new Scanner(System.in);
		
		int month = 0;
		int year;
		
		boolean isLeapYear;
		
		System.out.print("Enter the month (1-12): ");
		month = input.nextInt();
		
		System.out.print("Enter the year (yyyy): ");
		year = input.nextInt();
		
		isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		if (isLeapYear == true)
			switch (month) {
			  case 1: System.out.println("January " + year + " had 31 days"); break;
			  case 2: System.out.println("February " + year + " had 29 days"); break;
			  case 3: System.out.println("March " + year + " had 31 days"); break;
			  case 4: System.out.println("April " + year + " had 30 days"); break;
			  case 5: System.out.println("May " + year + " had 31 days"); break;
			  case 6: System.out.println("June " + year + " had 30 days"); break;
			  case 7: System.out.println("July " + year + " had 31 days"); break;
			  case 8: System.out.println("August " + year + " had 31 days"); break;
			  case 9: System.out.println("September " + year + " had 30 days"); break;
			  case 10: System.out.println("October " + year + " had 31 days"); break;
			  case 11: System.out.println("November " + year + " had 30 days"); break;
			  case 12: System.out.println("Decemebr " + year + " had 31 days"); break;
			}
		
		else
			switch (month) {
			  case 1: System.out.println("January " + year + " had 31 days"); break;
			  case 2: System.out.println("February " + year + " had 28 days"); break;
			  case 3: System.out.println("March " + year + " had 31 days"); break;
			  case 4: System.out.println("April " + year + " had 30 days"); break;
			  case 5: System.out.println("May " + year + " had 31 days"); break;
			  case 6: System.out.println("June " + year + " had 30 days"); break;
			  case 7: System.out.println("July " + year + " had 31 days"); break;
			  case 8: System.out.println("August " + year + " had 31 days"); break;
			  case 9: System.out.println("September " + year + " had 30 days"); break;
			  case 10: System.out.println("October " + year + " had 31 days"); break;
			  case 11: System.out.println("November " + year + " had 30 days"); break;
			  case 12: System.out.println("Decemebr " + year + " had 31 days"); break;
			}
		
	}
}
