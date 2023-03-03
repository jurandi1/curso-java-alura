package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo

//		OutputStream fos = new FileOutputStream("loren2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("loren2.txt"));
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("A expressão Lorem ipsum em design gráfico e editoração é um texto padrão em latim");
		ps.println();
		ps.println();
		ps.println();
		ps.println("dfasf fas fasdf asf asdf asd a");
		
		ps.close();
	}

}
