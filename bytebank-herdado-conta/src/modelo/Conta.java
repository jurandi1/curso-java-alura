package modelo;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	//static faz com que a declaração vire da class: é um atributo da class
	private static int total;
	
	//Contrutor padrão
	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		this.saldo = 100;
//		System.out.println("Criando conta " + this.numero);
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor ) throws SaldoInsulficienteException{
		if(this.saldo < valor) {
			throw new SaldoInsulficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}
		
	public void transfere(double valor, Conta destino) throws SaldoInsulficienteException {
		this.saca(valor);
		destino.deposita(valor);	
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0.");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor igual a 0.");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}