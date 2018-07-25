package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

//Exemplo de herança
public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar" + " um valor negativo");
		} else if (saldo <= valor) {
			throw new SaldoInsuficienteException(saldo);
		} else{
			this.saldo -= (valor + 0.10);
		}
	}
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.1;
	}
	

}