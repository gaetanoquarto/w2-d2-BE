package Esercizio_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeneratoreNumeri {
	static Scanner in = new Scanner(System.in);
	static Random numR = new Random();
	static List<Integer> l1 = new ArrayList<>();
	boolean isEven = false;
	
	public void generaNumeri() {
		System.out.println("Inserisci quanti numeri vuoi generare: ");
		int quantita = in.nextInt();
		for(int i = 0; i < quantita; i++) {
			int casuale = numR.nextInt(0,101);
			l1.add(casuale);
		}
		System.out.println("Stampo i numeri generati...");
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
	}
	
	public void ordineInverso() {
		List<Integer> l2 = new ArrayList<>(l1);
		System.out.println("Stampo nuova lista con ordine inverso...");
		for(int i = l2.size() - 1; i >= 0; i--) {
			System.out.println(l2.get(i));
		}
	}
	
	public void pariDispari() {
		if(isEven) {
			System.out.println("stampo numeri nelle posizioni pari: ");
		} else {
			System.out.println("stampo numeri nelle posizioni dispari: ");
		}
		
		for(int i = 0; i < l1.size(); i++) {
			if(isEven && i % 2 == 0) {
				System.out.println(l1.get(i) + " ");
			} else if (!isEven && i % 2 == 0) {
				System.out.println(l1.get(i) + " ");
			}
		}
	}
	
	}


