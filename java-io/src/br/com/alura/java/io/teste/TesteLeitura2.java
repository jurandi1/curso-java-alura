package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("contas.csv"));
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			//System.out.println(linha);
			
			Scanner linhaSc = new Scanner(linha); 	
			linhaSc.useDelimiter(",");
			linhaSc.useLocale(Locale.US);
			
			String tipoConta = linhaSc.next();
			int  agencia = linhaSc.nextInt();
			int  numero = linhaSc.nextInt();
			String  titular = linhaSc.next();
			double saldo = linhaSc.nextDouble();
			
			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f %n", 
					tipoConta, agencia, numero, titular, saldo);
			
			linhaSc.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		sc.close();
	}

}
