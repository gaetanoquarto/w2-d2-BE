package Esercizio_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Scanner in = new Scanner(System.in);


	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		
		System.out.println("Inserisci il numero di elementi da inserire: ");
		int nInserito = in.nextInt();
		in.nextLine();
		int counter = 0;
		for(int i = 0; i < nInserito; i++) {
			counter++;
			System.out.println("Inserisci la parola " + counter + ":");
			String parola = in.nextLine();
			l1.add(parola);
		}
		HashSet<String> setL1 = new HashSet<>();
		for(int i = 0; i < l1.size(); i++) {
			String elemento = l1.get(i);
			if(!setL1.add(elemento) ) {
				System.out.println("parola inserita più di una volta: " + elemento);
				l1.remove(i);
				i--;
			}
			
		}
		System.out.println("Il numero di parole distinte e' di: " + l1.size());
		System.out.println("Stampo la lista delle parole distinte...");
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

	}

}
