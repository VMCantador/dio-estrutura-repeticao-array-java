package labs;

import java.util.Scanner;

/*
Faça um programa que leia 5 números, 
e informe o maior 
e a media desses números 
*/


public class MaiorMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		int count = 0;	
		
		do {
			System.out.println("Digite o número:");
			numero = scan.nextInt();
			soma = soma + numero;
			if (numero > maior)maior = numero;
			
			count = count + 1;
		} while(count < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + (soma / count));

	}

}
