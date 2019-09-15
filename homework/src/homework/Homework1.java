package homework;

import java.util.Scanner; // behövs om man vill ha input

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner input = new Scanner(System.in); // behövs om man vill ha input			
			
			System.out.println("Vad är ditt namn: "); // skriver ut ett meddelande
			
			String namn = input.nextLine(); // läser in ett namn från konsolen

			System.out.println("Hur gammal är du? ");
			
			String ålder = input.nextLine();
			
			System.out.println("Vad är din hemadress? ");
			
			String adress = input.nextLine();
			
			System.out.println("Vad är ditt postnummer? ");
			
			String postnummer = input.nextLine();
			
			System.out.println("Vilken stad bor du i?? ");
			
			String stad = input.nextLine();
			
			System.out.println("Vad är ditt telefonnummer? ");
			
			String telefonnummer = input.nextLine();
			
			System.out.println("Information:");
			System.out.println("Namn:" + "\t" + "\t" + namn + "\n" + "Ålder:" + "\t" + "\t" + ålder + "\n" + "Adress:" + "\t" + "\t" + adress +
					"\n" + "\t" + "\t" + postnummer  + " " + stad + "\n" + "Telefon:" + "\t" + telefonnummer);
			
			
			
		
		
		
		}

	}