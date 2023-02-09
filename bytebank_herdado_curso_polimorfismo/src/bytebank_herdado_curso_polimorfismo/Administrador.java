package bytebank_herdado_curso_polimorfismo;

public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		return 50;
	}

}
