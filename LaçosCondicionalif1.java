package PacoteJava;

import java.util.Scanner;

public class LaçosCondicionalif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a; // seria a farinha
		int b; // seria o ovo
		int soma; // bolo pronto
		Scanner ler = new Scanner (System.in); // resultado final, o bolo na mesa
		
		System.out.println("\nEntre com o valor de A: ");
		a = ler.nextInt(); // ele vai te perguntar o que seria o proximo passo
		
		System.out.println("\nEntre com o valor de b: ");
		b = ler.nextInt();
		
		
		soma = a + b; // soma da farinha e o ovo que seria o bolo

		
		if (soma > 5) {
			System.out.println("O valor da soma entre A e B é maior que o valor c 6 .");
		} 
		
		
		else if (soma == 6 ) {	
			System.out.println("O valor da soma entre A e B é igual que o valor C 6 .");
		} 
		
		
		else {
			System.out.println("O valor da soma entre A e B é menor que o valor C 6 .");
		}
			
			
			
			
		}
		

	}


