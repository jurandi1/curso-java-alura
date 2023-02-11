package bytebank_herdado_curso_polimorfismo;

// Contrato autenticavel
	//quem assina esse contrato precisa implementar
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
}
