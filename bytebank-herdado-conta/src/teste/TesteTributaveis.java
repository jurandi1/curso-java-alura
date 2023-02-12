package teste;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		modelo.ContaCorrente cc = new modelo.ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		modelo.SeguroDeVida seguro = new modelo.SeguroDeVida();
		
		modelo.CalculadorDeImposto calc = new modelo.CalculadorDeImposto();
		calc.registro(cc);
		calc.registro(seguro);
		
		System.out.println(calc.getTotalImposto());
	}

}
