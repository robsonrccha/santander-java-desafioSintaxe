package robsonrccha.com.github;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Integer numero = 1021;
		String agencia = "067-8";
		String nomeCliente = "Mario Andrade";
		Double saldo = 237.48;
		
		System.out.println("Por favor digite o numero da agencia e digito: ");
		agencia = sc.next(); 
		
		System.out.println("\nPor favor digite o numero da conta: ");
		numero = sc.nextInt();
		
		System.out.println("\nPor favor digite seu nome e sobrenome: ");
		nomeCliente = sc.next();
		
		System.out.println("\nEscolha um valor para abrir a conta - minimo de R$ 200.00: ");
		saldo = sc.nextDouble();
		
		System.out.println("/nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + agencia + ", numero da conta " + numero + " e seu "
						+ "saldo de " + saldo + " já está disponível para saque.");
		
		
		sc.close();

	}

}
