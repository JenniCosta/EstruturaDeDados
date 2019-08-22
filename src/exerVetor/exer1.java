package exerVetor;

import java.util.Scanner;

public class exer1 {
	
	public static void ExibeVetor(int[] v) {
		for(int i=0; i<v.length; i++) {
			System.out.print(v[i] + "\t");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
			
		int[] vetor = new int[7];
		
		for(int i=0; i< vetor.length; i++) {
			System.out.println("Digite um número");
			vetor[i] = leitor.nextInt();
		}
		
		for(int i=vetor.length -1; i>=0; i--) {
			System.out.print(vetor[i] + "\t");
			//vetor[i] = leitor.nextInt();
			
		}
		
		ExibeVetor(vetor);
	}
	
	
}
