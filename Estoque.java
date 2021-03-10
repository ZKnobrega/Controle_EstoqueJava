import java.io.IOException;

public class Estoque extends Contador {
	int monitor = 120, teclado = 240, mouse = 50, fonte = 60;

	/*
	 * double valorTotalCaneta = (caneta * valorCaneta); double valorTotalLapis =
	 * (lapis * valorLapis); double valorTotalPapal =(papal * valorPapal); double
	 * valorTotalBorracha = (borracha * valorBorracha);
	 */

	void exibirProdutos(int op) throws IOException {
		System.out.println("\n-------PRODUTOS-------");
		System.out.println("1-MONITOR: " + this.monitor + " Unidades \n  Valor venda (" + this.valorMonitor + ") \n  Valor de produção (" + this.valorCompraMonitor + ")\n");
		System.out.println("2-TECLADO: " + this.teclado + " Unidades \n  Valor venda (" + this.valorTeclado + ") \n  Valor de produção (" + this.valorCompraTeclado + ")\n");
		System.out.println("3-MOUSE: " + this.mouse + " Unidades \n  Valor venda (" + this.valorMouse + ") \n  Valor de produção (" + this.valorCompraMouse + ")\n");
		System.out.println("4-FONTE: " + this.fonte + " Unidades \n  Valor venda (" + this.valorFonte + ") \n  Valor de produção (" + this.valorCompraFonte + ")\n");
		System.out.println("Precione ENTER para continuar....");
		System.in.read();
		if (op == 1) {
			System.out.println("qual produto deseja Comprar");
		}
		if (op == 2) {
			System.out.println("qual produto deseja Vender");
		}
	}

	public void adcMonitor(int monitor, int qnt) {
		this.monitor += qnt;
		Scanner in = new Scanner(System.in);
	}

	public void adcTeclado(int teclado, int qnt) {
		this.teclado += qnt;
	}

	public void adcMouse(int mouse, int qnt) {
		this.mouse += qnt;
	}

	public void adcFonte(int fonte, int qnt) {
		this.fonte += qnt;
	}

	public double verificaEstoque(double qnt, double tipo) {
		if (tipo == 1) {
			if (qnt > monitor) {
				System.out.println("estoque insuficiente");
				return 0;
			}
		}
		if (tipo == 2) {
			if (qnt > teclado) {
				System.out.println("estoque insuficiente");
				return 0;
			}
		}
		if (tipo == 3) {
			if (qnt > mouse) {
				System.out.println("estoque insuficiente");
				return 0;
			}
		}
		if (tipo == 4) {
			if (qnt > fonte) {
				System.out.println("estoque insuficiente");
				return 0;
			}
		}
		return 1;
	}

	public void vendeMonitor(int monitor, int qnt) {
		this.monitor -= qnt;
	}

	public void vendeTeclado(int teclado, int qnt) {
		this.teclado -= qnt;
	}

	public void vendeMouse(int mouse, int qnt) {
		this.mouse -= qnt;
	}

	public void vendeFonte(int fonte, int qnt) {
		this.fonte -= qnt;
	}

	void vendOuComp(int voc) {
		if (voc == 1) {
			System.out.println("Quantas unidades deseja produzir?");
		}
		if (voc == 2) {
			System.out.println("Quantas unidades deseja Vender?");
		}
	}

}
