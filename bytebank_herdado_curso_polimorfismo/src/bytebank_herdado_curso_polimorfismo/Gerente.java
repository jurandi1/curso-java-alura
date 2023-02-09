package bytebank_herdado_curso_polimorfismo;
//Gerente e um FuncionarioAutenticavel, Gerente herda da class FuncionarioAutenticavel 
public class Gerente extends FuncionarioAutenticavel {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente!");
		return super.getSalario();
	}
	
}
