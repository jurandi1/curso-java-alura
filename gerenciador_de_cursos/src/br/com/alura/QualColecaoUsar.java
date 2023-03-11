package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

public class QualColecaoUsar {

	public static void main(String[] args) {

//		Qual vamos usar? Depende da necessidade de cada um.
//
//		Para demonstrar que varia para cada caso. Para representar as aulas da Alura, fazia 
//		sentido usarmos uma lista para termos uma ordem, saber qual viria antes ou depois. 
//		Já para os alunos, não precisaremos saber qual virá antes ou depois, e nem poderemos 
//		ter elementos repetidos, então utilizamos um conjunto, um Set.
//
//		Mas se você ainda não sabe qual collection utilizar, pode-se declarar o atributo como 
//		Collection.

		// Declaração de atributos utilizando a interface Collection
		Collection<Aluno> alunos = new ArrayList<>();
		alunos.size();
	}

}
