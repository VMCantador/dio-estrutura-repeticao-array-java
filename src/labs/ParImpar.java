package labs;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantNumeros;
		int numero;
		int quantPares = 0;
		int quantImpares = 0;
		
		System.out.println("Digite a quantidade de números: ");
		quantNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) {
				quantPares++;
			} else {
				quantImpares++;
			}
			
			count++;
		}while(count < quantNumeros);
		
		System.out.println("Quantidade de Pares: " + quantPares);
		System.out.println("Quantidade de Impares: " + quantImpares);

	}

}
