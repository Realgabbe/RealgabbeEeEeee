package homework;

import java.util.Scanner; // beh�vs om man vill ha input

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner input = new Scanner(System.in); // beh�vs om man vill ha input			
			
			System.out.println("Vad �r ditt namn: "); // skriver ut ett meddelande
			
			String namn = input.nextLine(); // l�ser in ett namn fr�n konsolen

			System.out.println("Hur gammal �r du? ");
			
			String �lder = input.nextLine();
			
			System.out.println("Vad �r din hemadress? ");
			
			String adress = input.nextLine();
			
			System.out.println("Vad �r ditt postnummer? ");
			
			String postnummer = input.nextLine();
			
			System.out.println("Vilken stad bor du i?? ");
			
			String stad = input.nextLine();
			
			System.out.println("Vad �r ditt telefonnummer? ");
			
			String telefonnummer = input.nextLine();
			
			System.out.println("Information:");
			System.out.println("Namn:" + "\t" + "\t" + namn + "\n" + "�lder:" + "\t" + "\t" + �lder + "\n" + "Adress:" + "\t" + "\t" + adress +
					"\n" + "\t" + "\t" + postnummer  + " " + stad + "\n" + "Telefon:" + "\t" + telefonnummer);
			
			
			
		
		
		
		}

	}