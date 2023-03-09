package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções", "Jurandi Junior");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		List<Aula> aulas =  new ArrayList<>(aulasImutaveis);
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		
		
		
	}
}
