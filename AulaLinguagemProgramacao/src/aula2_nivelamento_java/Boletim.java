package aula2_nivelamento_java;

import java.util.Scanner;

public class Boletim {
	
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		Double nota1, nota2, nota3, media;
		
		System.out.println("Digite a sua primeira nota");
		nota1 = leitor.nextDouble();
		
		System.out.println("Digite a sua segunda nota");
		nota2 = leitor.nextDouble();
		
		System.out.println("Digite a sua terceira nota");
		nota3 = leitor.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 7) {
			System.out.println("Passou direto");
		
		} else if(media >= 5 && media < 7) {
			System.out.println("T�m direito de fazer uma prova de recupera��o");
			
		} else {
			System.out.println("Reprovado direto");
			
		}
		
		leitor.close();
	}

}
