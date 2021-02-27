import javax.swing.JOptionPane;
import java.util.Scanner;
public class Menu {
	
	public void MenuPrincipal() {
		//System.out.println("Bem Vindo !!!\n");
		JOptionPane.showMessageDialog(null, "Escolha a opção Desejada\n1 - Entrada de Estoque\n2 - Saída de estoque\n3 - Quantidade em Estoque\n4 - Sair do Programa");
		
	}
	
	public void MenuEntrada() {
		JOptionPane.showMessageDialog(null,"Deseja Acrescentar Quais Itens ao Estoque ?");
		JOptionPane.showMessageDialog(null,"1 - Canetas\n2 - Lápis\n3 - Resmas De papal\n4 - Borrachas");
	}
	public void MenuRetirada() {
		JOptionPane.showMessageDialog(null,"Deseja retirar Quais Itens ao Estoque ?");
		JOptionPane.showMessageDialog(null,"1 - Canetas\n2 - Lápis\n3 - Resmas De papal\n4 - Borrachas");
	}
	
		/*Scanner in = new Scanner (System.in);
		int opc = in.nextInt();
		Estoque estoqueAtual = new Estoque();
		
		switch(opc) {
		case 1:
			System.out.println("Deseja inserir unidades ou caixas(12.und)");
			System.out.println("1 - Unidades\n2 - Caixa(12.und)");
			int op = in.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("insira o valor deasejado:");
				int a = in.nextInt();
				estoqueAtual.caneta = estoqueAtual.caneta+a;
				break;
				
			case 2:
				System.out.println("insira o valor deasejado:");
				int val = in.nextInt();
				estoqueAtual.caneta = estoqueAtual.caneta+(val*12);
				break;
			}
			break;
			
		case 2:
			System.out.println("Deseja inserir unidades ou caixas(12.und)");
			System.out.println("1 - Unidades\n2 - Caixa(12.und)");
			int op1 = in.nextInt();
			switch(op1) {
			
			case 1:
				System.out.println("insira o valor deasejado:");
				int b = in.nextInt();
				estoqueAtual.lapis = estoqueAtual.lapis+b;
				break;
				
			case 2:
				System.out.println("insira o valor deasejado:");
				int val2 = in.nextInt();
				estoqueAtual.lapis = estoqueAtual.lapis+(val2*12);
				break;
			}
			break;
			
		case 3:
			System.out.println("insira o valor deasejado de resmas:");
			int val3 = in.nextInt();
			estoqueAtual.papal = estoqueAtual.papal+val3;
			break;
			
		case 4:
			System.out.println("Deseja inserir unidades ou caixas(6.und)");
			System.out.println("1 - Unidades\n2 - Caixa(6.und)");
			int op2 = in.nextInt();
			switch(op2) {
			case 1:
				System.out.println("insira o valor deasejado:");
				int c = in.nextInt();
				estoqueAtual.borracha = estoqueAtual.borracha+c;
				break;
				
			case 2:
				System.out.println("insira o valor deasejado:");
				int val4 = in.nextInt();
				estoqueAtual.borracha = estoqueAtual.borracha+(val4*4);
				break;
			}
			break;
		}*/
	}

