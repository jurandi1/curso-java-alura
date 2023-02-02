
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 98765);
		
		System.out.println(conta.getNumero());
		
		Cliente junior = new Cliente();
		//cliente.titular = junior;
		junior.setNome("Jurandi Junior");
		
		conta.setTitular(junior);
		
		System.out.println(conta.getTitular().getNome());
		
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(junior);
		System.out.println(conta.getTitular());
	}
}
