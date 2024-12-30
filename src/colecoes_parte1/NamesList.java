package colecoes_parte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NamesList {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	
	ArrayList<String> nomes = new ArrayList<>();
	
	System.out.println("Insira os nomes para cadastro. Digite 'fim' para encerrar:");
	
	while (true) {
		String nome = scanner.nextLine();
		if (nome.equalsIgnoreCase("fim")) {
			break;
		}
	    nomes.add(nome);

		}	
	
	 Collections.sort(nomes);

     System.out.println("\nNomes em ordem alfabética:");
     
     for (String nome : nomes) {
         System.out.println(nome);
     }
    }
}