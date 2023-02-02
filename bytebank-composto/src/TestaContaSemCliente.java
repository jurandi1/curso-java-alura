public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta  contaDaAmanda = new Conta();
		System.out.println(contaDaAmanda.getSaldo());
		
		contaDaAmanda.titular = new Cliente();
		System.out.println(contaDaAmanda.titular);
		
		contaDaAmanda.titular.nome = "Amanda";
		System.out.println(contaDaAmanda.titular.nome);
		

	}

}
