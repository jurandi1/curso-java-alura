
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1234, 98765);
		
		System.out.println(conta.getAgencia());
		
		//Conta conta2 = new Conta(1234, 56789);
		//Conta conta3 = new Conta(2112, 16549);
		
		System.out.println(Conta.getTotal());
	}

}