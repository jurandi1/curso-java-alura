package bytebank_herdado_curso_polimorfismo;
//Trabalhando com polimorfismo
public class ControleBonificacao {
	
	private double soma;
	
//	public void registra(Gerente g) {
//		double boni = g.getBonificacao();
//		this.soma = this.soma + boni;	
//	}
	
	public void registra(Funcionario f) { //Mesmo usando uma referência genérica ao executar o código sempre será chamado um método específico
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;	
	}
	
//	public void registra(EditorVideo ev) {
//		double boni = ev.getBonificacao();
//		this.soma = this.soma + boni;	
//	}
	
	public double getSoma() {
		return soma;
	}

}
