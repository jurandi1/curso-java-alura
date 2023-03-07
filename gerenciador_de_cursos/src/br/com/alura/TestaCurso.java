package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções", "Jurandi Junior");
		
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getAulas());
	}
}
