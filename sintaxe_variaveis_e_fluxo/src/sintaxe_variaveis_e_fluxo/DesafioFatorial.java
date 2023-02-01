package sintaxe_variaveis_e_fluxo;

public class DesafioFatorial {

	public static void main(String[] args) {
		
		int fatorial = 1;
		
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("O fatorial de " + i + " = " + fatorial);
        }
	}

}
