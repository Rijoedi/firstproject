package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

//exemplo de array MUITO IMPORTANTE ESSA PORCARIA.
public class TestaArrays {
	public static void main(String[] args) {
		Conta [] contas = new Conta[10];
		
		double soma =0;
		for(int i = 0; i < contas.length; i++){
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;
			System.out.println(contas[i].getSaldo());
			soma = soma +  contas[i].getSaldo();
		}
		System.out.println(soma / contas.length);
	}
}
