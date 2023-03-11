package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções", "Jurandi Junior");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

		Aluno a1 = new Aluno("Jurandi Junior", 12345);
		Aluno a2 = new Aluno("Amanda Oliveira", 54321);
		Aluno a3 = new Aluno("Glauciane Nobre", 98765);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
//		System.out.println(javaColecoes.getAlunos());
		
		System.out.println("Quem é o aluno com matrícula 54321?");
		Aluno aluno = javaColecoes.buscaMatriculado(54321);
		System.out.println(aluno);
	}

}
