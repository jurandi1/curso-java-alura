package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Carlos Junior");
		alunos.add("Jurandi Carlos");
		alunos.add("Maria Aparecida");
		alunos.add("Amanda Oliveira");
		alunos.add("Glauciane Nobre");
		alunos.add("Pedro Nobre");
		alunos.add("Pedro Nobre");
		
		boolean jurandiEstaMatriculado = alunos.contains("Jurandi Carlos");
		alunos.remove("Amanda Oliveira");
		
		System.out.println(jurandiEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		//List<String> alunosEmLista =  new ArrayList<>(alunos);
		
	}

}
