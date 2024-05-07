package org.generation.italy;

import java.util.Scanner; //importa dal package java.util

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // inizializzazione oggetto scanner, legge dati dal canale System.in
												// (tastiera)
		boolean conferma;
		int big = 8; // big sta per biglietto

		do {
			System.out.print("Inserisci Età: ");
			int età = sc.nextInt(); // "Età:" Legge un intero dalla tastiera assegnato all'età
			sc.nextLine(); // forzo l'invio altrimenti salta la lettura successiva

			System.out.print("Inserisci Giorno: ");
			String giorno = sc.nextLine(); // "Inserisci la data di prenotazione:" Legge una stringa assegnata al gg

			if (età < 10)
				System.out.println("Il biglietto è Gratis!");
			else {
				if (età >= 10 && età <= 14) // tra i 10 e i 14 si ha lo sconto di 2e
					big = big - 2;
				if (giorno.equals("mercoledì")) // mercoledì il prezzo è ridotto di 2e
					big = big - 2;
				System.out.println("Il prezzo è " + big + "€");
			}
			System.out.println("Effettuare un altro biglietto?");
			conferma = sc.nextBoolean();
		} while (conferma == true);
		sc.close();
	}
}