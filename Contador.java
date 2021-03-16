public class Contador {
	double valorMonitor = 499.90;
	double valorTeclado = 199.90;
	double valorMouse = 59.90;
	double valorFonte = 274.90;

	double valorCompraMonitor = 150;
	double valorCompraTeclado = 80;
	double valorCompraMouse = 19.90;
	double valorCompraFonte = 99.90;

	double saldoAtual = 1000;
	double lucro;
	double compras;
	double lucroFinal = lucro - compras;

	public void contVendas(double produto, int numeroDeProdutos) {
		if (produto == 1) {
			this.lucro += valorMonitor * numeroDeProdutos;
			this.saldoAtual += valorMonitor * numeroDeProdutos;
		}
		if (produto == 2) {
			this.lucro += valorTeclado * numeroDeProdutos;
			this.saldoAtual += valorTeclado * numeroDeProdutos;

		}
		if (produto == 3) {
			this.lucro += valorMouse * numeroDeProdutos;
			this.saldoAtual += valorMouse * numeroDeProdutos;
		}
		if (produto == 4) {
			this.lucro += valorFonte * numeroDeProdutos;
			this.saldoAtual += valorFonte * numeroDeProdutos;
		}
	}

	public double saldo() {
		// System.out.println("saldo é: "+saldoAtual);
		return saldoAtual;
	}

	public double verificaSaldo(double qnt, double tipo) {
		if (tipo == 1) {
			if ((qnt * this.valorCompraMonitor) > saldoAtual) {
				System.out.println("saldo insuficiente");
				return 0;
			}
		}
		if (tipo == 2) {
			if ((qnt * this.valorCompraTeclado) > saldoAtual) {
				System.out.println("saldo insuficiente");
				return 0;
			}
		}
		if (tipo == 3) {
			if ((qnt * this.valorCompraMouse) > saldoAtual) {
				System.out.println("saldo insuficiente");
				return 0;
			}
		}
		if (tipo == 4) {
			if ((qnt * this.valorCompraFonte) > saldoAtual) {
				System.out.println("saldo insuficiente");
				return 0;
			}
		}
		return 1;
	}

	public void contCompras(double produto, int numeroDeProdutos) {
		if (produto == 1) {
			this.lucro -= valorCompraMonitor * numeroDeProdutos;
			this.saldoAtual -= valorCompraMonitor * numeroDeProdutos;
		}
		if (produto == 2) {
			this.lucro -= valorCompraTeclado * numeroDeProdutos;
			this.saldoAtual -= valorCompraTeclado * numeroDeProdutos;
		}
		if (produto == 3) {
			this.lucro -= valorCompraMouse * numeroDeProdutos;
			this.saldoAtual -= valorCompraMouse * numeroDeProdutos;
		}
		if (produto == 4) {
			this.lucro -= valorCompraFonte * numeroDeProdutos;
			this.saldoAtual -= valorCompraFonte * numeroDeProdutos;
		}
	}

	public void lucro() {
		if (this.lucro >= 0) {
			System.out.println(" o valor bruto das vendas foi de: " + this.lucro);
		} else {
			System.out.println("você teve um prejuizo com as vendas de: " + this.lucro);
		}
	}
}
