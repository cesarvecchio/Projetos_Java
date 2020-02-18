package aula2_nivelamento_java;

import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Double valorProduto;
		Integer codigoDesconto;
		
		System.out.println("Digite o valor do produto");
		valorProduto = leitor.nextDouble();
		
		
		System.out.println("Digite o código de desconto");
		System.out.println("______________________________");
		System.out.println("| Código Desconto | Desconto |");
		System.out.println("|____________________________|");
		System.out.println("|       1         |    5%    |");
		System.out.println("|____________________________|");
		System.out.println("|       2         |    10%   |");
		System.out.println("|____________________________|");
		System.out.println("|       3         |    20%   |");
		System.out.println("|____________________________|");
		System.out.println("|       4         |    50%   |");
		System.out.println("|____________________________|");
		
		
		codigoDesconto = leitor.nextInt();		
		
		
		switch(codigoDesconto) {
		
		case 1: System.out.println("Valor original do produto: "+ valorProduto
				+". Valor com desconto: "+ valorProduto * 0.05);
			break;
			
		case 2: System.out.println("Valor original do produto: "+ valorProduto
				+". Valor com desconto: "+ valorProduto * 0.1);
			break;
		
		case 3: System.out.println("Valor original do produto: "+ valorProduto
				+". Valor com desconto: "+ valorProduto * 0.2);
			break;
		
		case 4: System.out.println("Valor original do produto: "+ valorProduto
				+". Valor com desconto: "+ valorProduto * 0.5);
			break;
		
		default: System.out.println("Codigo inválido");
			break;
			
		}
		
		leitor.close();
	}

}
