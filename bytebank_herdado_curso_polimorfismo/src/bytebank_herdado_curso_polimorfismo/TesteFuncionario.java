package bytebank_herdado_curso_polimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {
		
//		Cliente cliente = new Cliente();
		
		Gerente junior = new Gerente();
		junior.setNome("Jurandi Junior");
		junior.setCpf("111.111.111-04");
		junior.setSalario(2600.00);
		
		System.out.println(junior.getNome());
		System.out.println(junior.getBonificacao());

	}

}
