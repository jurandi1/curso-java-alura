package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("contas.csv"));
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);
			
			Scanner linhaSc = new Scanner(linha); 	
			linhaSc.useDelimiter(",");
			linhaSc.useLocale(Locale.US);
			
			String  valor1 = linhaSc.next();
			int  valor2 = linhaSc.nextInt();
			int  valor3 = linhaSc.nextInt();
			String  valor4 = linhaSc.next();
			double valor5 = linhaSc.nextDouble();
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			linhaSc.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		sc.close();
	}

}
