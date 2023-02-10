package bytebank_herdado_curso_polimorfismo;

public class Administrador extends Funcionario {

	@Override
	public double getBonificacao() {
		return 50;
	}

}
