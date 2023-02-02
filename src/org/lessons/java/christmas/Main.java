//	Creare una classe Main con metodo main, in cui implementare il seguente programma:
//	creare una nuova ArrayList dove salvare la lista dei desideri
//	continuare a chiedere all’utente di inserire un nuovo desiderio nella lista, fino a che l’utente sceglie di fermarsi
//	ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare
//	ad ogni iterazione aggiungere il desiderio alla lista
//	al termine dell’inserimento ordinare la lista
//	stampare a video la lista ordinata

package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	ArrayList<String> wishList = new ArrayList<>();
	String wish;
	
	Scanner wl = new Scanner(System.in);
	
		do {
			System.out.println("Inserisci un desiderio alla lista o solo invio per fermarti.");
			wish = wl.nextLine();
			wishList.add(wish);
			System.out.println("La lista contiene: ");
			for (int i = 0; i < wishList.size(); i++) {
				System.out.println(wishList.get(i));
			}			
		}
		while (!wish.equals(""));
		System.out.println("Ecco la lista finale: ");
        Collections.sort(wishList);
        for(String str: wishList) System.out.print(" "+str);		  
//		List<String> sortedList = wishList.stream().sorted().collect(Collectors.toList());     
//		sortedList.forEach(System.out::println); 
		wl.close();
}
}
