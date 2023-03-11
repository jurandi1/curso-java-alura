package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções", "Jurandi Junior");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

		Aluno a1 = new Aluno("Jurandi Junior", 12345);
		Aluno a2 = new Aluno("Amanda Oliveira", 54321);
		Aluno a3 = new Aluno("Glauciane Nobre", 54321);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
//		Vector<Aluno> vector = new Vector<>();
		
//		for (Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		System.out.println("O aluno " + a1 + " está matrículado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno junior =  new Aluno("Jurandi Junior", 12345);
		System.out.println("E esse Junior, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(junior));
		
		
		System.out.println("O aluno a1 é equals ao Junior?");
		System.out.println(a1.equals(junior));
		
		//obrigatoriamente o seguinte é true:
		System.out.println("Testando o hashCode: ");
		System.out.println(a1.hashCode() == junior.hashCode());
		
	}

}
