package labs;

import java.util.Random;

/*
Faça um programa que leia 20 numeros inteiros aleatórios
(entre 0 e 100), armazeneos em um vetor.
Ao final mostre os números e seus sucessores.
*/

public class ArrayNumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int [] numerosAleatorios = new int [20];
		
		for(int i = 0; i < numerosAleatorios.length; i++){
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("Numeros Aleatorios: ");
		for(int numero : numerosAleatorios) {
			System.out.println(numero + " ");
		}
		
		System.out.println("\nSucessores dos Numeros Aleatorios: ");
		for(int numero : numerosAleatorios) {
			System.out.println((numero+1) +  " ");
		}
	}

}
