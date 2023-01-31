package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		System.out.println();
		
		int idade = 22;
		int quantidadePerssoas = 3;
	
		
		//boolean acompanhado = quantidadePerssoas >= 2;
		
		boolean acompanhado;
		
		if(quantidadePerssoas >= 2) {
			//Se a variável for declarada aqui só será válida aqui entre as chaves {}, dentro do escopo. 
			acompanhado = true;
		} else {
			 acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}	
	}

}
