package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		System.out.println();
		int idade = 22;
		int quantidadePerssoas = 3;
		boolean acompanhado = quantidadePerssoas >= 2;
		
		// Os símbolos || se lê OU
		// Os símbolos && se lê E
		// Os símbolos || se lê OU
		// Os símbolos || se lê OU
		
		System.out.println("Valor de acompanhado = " + quantidadePerssoas);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}	
	}

}
