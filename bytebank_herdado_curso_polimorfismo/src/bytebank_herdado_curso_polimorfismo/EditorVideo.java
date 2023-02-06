package bytebank_herdado_curso_polimorfismo;

public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Editor de video");
		return super.getBonificacao() + 100;
	}
}
