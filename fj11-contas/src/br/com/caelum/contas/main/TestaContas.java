package br.com.caelum.contas.main;

import br.com.caelum.javafx.api.main.SistemaBancario;
import br.com.caelum.javafx.api.main.TelaDeContas;

public class TestaContas {
	public static void main(String[] args) {
		//tela cadastra cliente
		SistemaBancario.mostraTela(true);
		//tela de contas
		TelaDeContas.main(args);
	}
}
