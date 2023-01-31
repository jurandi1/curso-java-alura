package sintaxe_variaveis_e_fluxo;

public class TesteIR2 {

	    public static void main(String[] args) {

	        double salario = 2300.0;

	        if(salario >= 1900.0 && salario <= 2800.0) {
	        	System.out.println("O seu sálário está entre 1900.0 até 2800.0 e o IR é de 7.5%");
	        	System.out.println("Pode deduzir o valor de R$ 142.");
	        } else if (salario >= 2800.01 && salario <= 3751.0) {
	        	System.out.println("O seu sálário está entre 2800.01 até 3751.0 e o IR é de 15%");
	        	System.out.println("Pode deduzir o valor de R$ 350.");
	        } else if (salario >= 3751.01 && salario <= 4664.00) {
	        	System.out.println("O seu sálário está entre 3751.01 até 4664.00 e o IR é de 22.5%");
	        	System.out.println("Pode deduzir o valor de R$ 350.");
	        }
	    }

}
