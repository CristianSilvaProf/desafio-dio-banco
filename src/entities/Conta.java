package entities;

public abstract class Conta implements lConta {
	
	protected static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected float cpf;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.cpf = cpf;
	}

	
	public int getAgencia() {
		return agencia;
	}


	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}


	@Override
	public void depositar(double valor) {
		saldo += valor;
	}


	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
	System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
	System.out.println(String.format("Agência: %d", this.agencia));
	System.out.println(String.format("Número: %d", this.numero));
	System.out.println(String.format("Saldo: %.2f", this.saldo));
}
	
	

}

