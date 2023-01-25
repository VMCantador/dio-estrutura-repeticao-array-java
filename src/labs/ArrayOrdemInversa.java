package labs;

/*
Crie um vetor de 6 numeros inteiros
e mostre-os na ordem inversa.
*/

public class ArrayOrdemInversa {

	public static void main(String[] args) {

		int [] vetor = {5, 10, 15, 20, 25, 30};
		
		System.out.println("vetor");
		int count = 0;
		while(count < (vetor.length)) {
			System.out.println(vetor[count]);
			count++;
		}
		
		for(int i = (vetor.length -1); i >= 0; i--) {
			System.out.println(vetor[i] + " ");
		}
			
			
		
	}

}
