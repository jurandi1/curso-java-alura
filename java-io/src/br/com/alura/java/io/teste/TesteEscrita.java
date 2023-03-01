package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo

		OutputStream fos = new FileOutputStream("loren2.txt");
		Writer isr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(isr);

		bw.write("A expressão Lorem ipsum em design gráfico e editoração é um texto padrão em latim");
		bw.newLine();
		bw.newLine();
		bw.write("dfasf fas fasdf asf asdf asd a");
		
		
		bw.close();
	}

}
