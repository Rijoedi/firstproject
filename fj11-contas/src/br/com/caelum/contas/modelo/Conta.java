package br.com.caelum.contas.modelo;

/**
 * 
 * @author Ed
 *
 */
// abstract 
//se eu criar uma classe abstract eu nao consigo instanciar mais a classe generica
public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public void deposita(double valor) {
		if(valor < 0){
			throw new IllegalArgumentException("Você tentou depositar" + "um valor negativo");
		}else{
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getInfo() {
		return "Agência: " + this.agencia + "\nTitular: " + this.titular + "\nNúmero: " + this.numero + "\nSaldo: "
				+ this.saldo;
	}

	public abstract String getTipo();
	//{
	//	return "Conta";
	//}

	public void transfere(double valor, Conta conta) {
		if(saldo >= valor){
			this.saca(valor);
			conta.deposita(valor);
		}
	}
	@Override
	public String toString(){
		return "Titular: " + titular.toUpperCase() + " Conta: " + numero + " Agência: " + agencia;
	}
	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}
	
	public int compareTo(Conta outraConta){
		return this.titular.compareTo(outraConta.titular);
	}
}
