package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class Teste {
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		System.out.println(c);
		System.out.println(c2);
	}
}
