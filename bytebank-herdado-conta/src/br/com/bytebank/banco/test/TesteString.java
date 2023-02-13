package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Jurandi"; //object literal
//		String outro = new String("Jurandi");
//		String outro = nome.replace("J", "j");
		String outro = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(outro);
		
	}
	
}
