package exerVetor;

import java.util.Scanner;

public class exerVetor2 {

	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String[] nomes = new String[10];
		
		for(int i=0; i<nomes.length; i++) {
			System.out.println("digite um nome");
			nomes[i] = leitor.nextLine();
		}
		String nome = "Não tem esse nome";
		System.out.println("Digite um nome ");
		nome = leitor.nextLine();
		
		for(int i =0;i<nomes.length;i++) {
			if(nomes[i].contains(nome)) {
				nome = "Esse nome tem na lista";
			}
		}
		System.out.println(nome);
		
	}
}
