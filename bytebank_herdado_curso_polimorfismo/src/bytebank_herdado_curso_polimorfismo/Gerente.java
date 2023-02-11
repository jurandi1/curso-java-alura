package bytebank_herdado_curso_polimorfismo;

//Gerente e um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel, e um autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente!");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
