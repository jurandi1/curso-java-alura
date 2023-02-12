package br.com.bytebank.banco.modelo;

public class SaldoInsulficienteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsulficienteException(String s) {
		super(s);
	}
}
