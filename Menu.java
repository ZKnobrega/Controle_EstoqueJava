import java.io.IOException;
import java.util.Scanner;

public class menu extends Estoque {
	Scanner blz = new Scanner(System.in);
	Contador c = new Contador();

	int escolha, qnt = 0, produtoRetirar, produtoColocar, cond = 0, uoc = 0;
	int tipo;
	int contVendasCaneta = 0, contVendasLapis = 0, contVendasPapal = 0, contVendasBorracha = 0;
	int contComprasCaneta = 0, contComprasLapis = 0, contComprasPapal = 0, contComprasBorracha = 0;

	public void opcoes() {

		int escolha;
		System.out.println("\nSEJA BEM VINDO");
		System.out.println("------SALDO ATUAL: " + c.saldo() + "------");
		System.out.println("1-PRODUZIR");
		System.out.println("2-VENDER");
		System.out.println("3-QUANTIDADE DE ESTOQUE");
		System.out.println("4-VALOR BRUTO DA VENDA");
		System.out.println("5-SAIR DO PROGRAMA\n");

	}

	void menu() throws IOException {
		while (cond < 1) {
			opcoes();
			escolha = blz.nextInt();
			switch (escolha) {

			case 1:
				exibirProdutos(escolha);
				produtoColocar = blz.nextInt();

				switch (produtoColocar) {
				case 1:

					vendOuComp(escolha);
					qnt = blz.nextInt();
					tipo = 1;
					if (c.verificaSaldo(qnt, tipo) == 1) {
						adcMonitor(monitor, qnt);
						c.contCompras(tipo, qnt);
						break;
					} else {
						c.verificaSaldo(qnt, tipo);
						break;
					}
				case 2:

					vendOuComp(escolha);
					qnt = blz.nextInt();
					tipo = 2;
					if (c.verificaSaldo(qnt, tipo) == 1) {
						adcTeclado(teclado, qnt);
						c.contCompras(tipo, qnt);
						break;
					} else {
						c.verificaSaldo(qnt, tipo);
						break;
					}
				case 3:
					vendOuComp(escolha);
					qnt = blz.nextInt();
					tipo = 3;
					if (c.verificaSaldo(qnt, tipo) == 1) {
						c.contCompras(tipo, qnt);
						break;
					} else {
						c.verificaSaldo(qnt, tipo);
						break;
					}
				case 4:
					vendOuComp(escolha);
					qnt = blz.nextInt();
					tipo = 4;
					if (c.verificaSaldo(qnt, tipo) == 1) {
						adcFonte(fonte, qnt);
						c.contCompras(tipo, qnt);
						break;
					} else {
						c.verificaSaldo(qnt, tipo);
						break;
					}
				}
				break;
			case 2:// ---------------------------------------------------VENDA---------------------------------------
				exibirProdutos(escolha);
				this.produtoRetirar = blz.nextInt();
				switch (produtoRetirar) {
				case 1:
					// fazer pra vender tbm em caixas
					vendOuComp(escolha);
					qnt = blz.nextInt();
					tipo = 1;
					if (verificaEstoque(qnt, tipo) == 1) {
						vendeMonitor(monitor, qnt);
						c.contVendas(tipo, qnt);
						break;
					} else {
						break;
					}
				case 2:
					vendOuComp(escolha);
					qnt = blz.nextInt();
					tipo = 2;
					if (verificaEstoque(qnt, tipo) == 1) {
						vendeTeclado(teclado, qnt);
						c.contVendas(tipo, qnt);
						break;
					} else {
						break;
					}
				case 3:
					vendOuComp(escolha);
					qnt = blz.nextInt();
					if (verificaEstoque(qnt, tipo) == 1) {
						tipo = 3;
						vendeMouse(qnt, tipo);
						c.contVendas(tipo, qnt);
						break;
					} else {
						break;
					}
				case 4:
					vendOuComp(escolha);
					qnt = blz.nextInt();
					tipo = 4;
					if (verificaEstoque(qnt, tipo) == 1) {
						vendeFonte(fonte, qnt);
						c.contVendas(tipo, qnt);
						break;
					} else {
						break;
					}
				}
				break;
			case 3:
				exibirProdutos(escolha);
				break;

			case 4:
				c.lucro();
				break;
			case 5:
				cond = 2;
				break;

			}
		}
	}
}
