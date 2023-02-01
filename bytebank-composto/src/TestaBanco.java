
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente junior = new Cliente();
		junior.nome = "Jurandi Junior";
		junior.cpf = "111.111.111-11";
		junior.profissao = "Programador";
		
		
		Conta contaDoJunior = new Conta();
		contaDoJunior.deposita(100);
		
		contaDoJunior.titular = junior;
		
		System.out.println(contaDoJunior.titular.nome);
		System.out.println(contaDoJunior.titular);
		System.out.println(junior);
		
	}
}
