
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoJunior = new Conta();
		contaDoJunior.saldo = 100;
		contaDoJunior.deposita(50);
		System.out.println(contaDoJunior.saldo);
		
		boolean conseguiuRetirar = contaDoJunior.saca(20);
		contaDoJunior.saca(20);
		System.out.println(contaDoJunior.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaAmanda = new Conta();
		contaDaAmanda.deposita(1000);
		
		boolean sucessoTransferencia = 
				contaDaAmanda.transfere(3000, contaDoJunior);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso!");
		} else {
			System.out.println("Faltou dinheiro.");
		}
		
		System.out.println(contaDaAmanda.saldo);
		System.out.println(contaDoJunior.saldo);
		
		contaDoJunior.titular = "Jurandi Junior";
		System.out.println(contaDoJunior.titular);
		
		
		
		
		
	}

}
