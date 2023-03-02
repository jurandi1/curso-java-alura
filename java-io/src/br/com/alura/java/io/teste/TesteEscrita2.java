package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo

//		OutputStream fos = new FileOutputStream("loren2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		BufferedWriter bw = new BufferedWriter(new FileWriter("loren2.txt"));
		
		bw.write("A expressão Lorem ipsum em design gráfico e editoração é um texto padrão em latim");
		bw.newLine();
		bw.newLine();
		bw.write("dfasf fas fasdf asf asdf asd a");
		
		
		bw.close();
	}

}
