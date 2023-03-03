package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo

//		OutputStream fos = new FileOutputStream("loren2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		long ini = System.currentTimeMillis();

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("A expressão Lorem ipsum em design gráfico e editoração é um texto padrão em latim");
		bw.newLine();
		bw.newLine();
		bw.write("dfasf fas fasdf asf asdf asd a");
		
		
		bw.close();
		
		long fim = System.currentTimeMillis();
		
        System.out.println("Passaram " + (fim - ini) + " milissegundos");

	}

}
