package br.com.caelum.contas.exception;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(double valor){
		super("Saldo insuficente para sacar o valor de: " + valor);
	}
}
