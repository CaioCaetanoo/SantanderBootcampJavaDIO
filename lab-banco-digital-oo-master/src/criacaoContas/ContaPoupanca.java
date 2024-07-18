package criacaoContas;

import clientes.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato contaInfos.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
