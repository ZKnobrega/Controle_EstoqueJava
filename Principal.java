import javax.swing.JOptionPane;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Estoque estoqueAtual = new Estoque();
		Menu Menu = new Menu();
		Scanner in = new Scanner(System.in);
		JOptionPane.showMessageDialog(null,"Bem Vindo !");
		int contador = 0, saida = 0;
		String log = JOptionPane.showInputDialog("Insira o Login:");
		//String log = in.next();
		String senha = JOptionPane.showInputDialog("Insira sua Senha:");
		//String senha = in.next();
			
		/*for (;;)*/
		while(contador  == 0){
			
			if(log.equals("unifap") && senha.equals("unifap123")) {
				Menu.MenuPrincipal();
				int op = in.nextInt();
				
				switch(op) {
				
				case 1:
					
					Menu.MenuEntrada();
					int opc = in.nextInt();
					switch(opc) {
					case 1:
						System.out.println("Deseja inserir unidades ou caixas(12.und)");
						System.out.println("1 - Unidades\n2 - Caixa(12.und)");
						op = in.nextInt();

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
						}
						break;
					
				case 2:
					Menu.MenuRetirada();
					opc = in.nextInt();
					switch(opc) {
					case 1:
						System.out.println("Deseja retirar unidades ou caixas(12.und)");
						System.out.println("1 - Unidades\n2 - Caixa(12.und)");
						op = in.nextInt();

						switch(op) {
							case 1:
								System.out.println("insira o valor deasejado:");
								int a = in.nextInt();
								estoqueAtual.caneta = estoqueAtual.caneta-a;
								break;
								
							case 2:
								System.out.println("insira o valor deasejado:");
								int val = in.nextInt();
								estoqueAtual.caneta = estoqueAtual.caneta-(val*12);
								break;
							}
							break;
					
					case 2:
							System.out.println("Deseja retirar unidades ou caixas(12.und)");
							System.out.println("1 - Unidades\n2 - Caixa(12.und)");
							int op1 = in.nextInt();
						
						
						switch(op1) {
						
							case 1:
								System.out.println("insira o valor deasejado:");
								int b = in.nextInt();
								estoqueAtual.lapis = estoqueAtual.lapis-b;
								break;
								
							case 2:
								System.out.println("insira o valor deasejado:");
								int val2 = in.nextInt();
								estoqueAtual.lapis = estoqueAtual.lapis-(val2*12);
								break;
							}
							break;
						
					case 3:
						System.out.println("insira o valor deasejado de resmas:");
						int val3 = in.nextInt();
						estoqueAtual.papal = estoqueAtual.papal-val3;
						break;
						
					case 4:
						System.out.println("Deseja retirar unidades ou caixas(6.und)");
						System.out.println("1 - Unidades\n2 - Caixa(6.und)");
						int op2 = in.nextInt();
						switch(op2) {
							case 1:
								System.out.println("insira o valor deasejado:");
								int c = in.nextInt();
								estoqueAtual.borracha = estoqueAtual.borracha-c;
								break;
								
							case 2:
								System.out.println("insira o valor deasejado:");
								int val4 = in.nextInt();
								estoqueAtual.borracha = estoqueAtual.borracha-(val4*4);
								break;
							}
							break;
						}
						break;
					
				case 3:
					estoqueAtual.MostrarEstoque();
					System.out.println("\n");
					break;
					
				case 4:
					System.out.println("Obrigado por usar o programa :)");
					System.exit(0);
					
				}
					
			}
			else {
				JOptionPane.showMessageDialog(null,"Senha ou login errado!!!");
				log = JOptionPane.showInputDialog("Insira o Login:");
				//log = in.next();
				senha = JOptionPane.showInputDialog("Insira sua Senha:");
				//senha = in.next();
				System.out.println("\n");
			}
		}
		}
	}