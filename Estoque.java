import java.util.Scanner;

public class Estoque {
	
		int caneta = 120;
		int lapis = 24;
		int papal = 5;
		int borracha = 6;
		
	
	public void EstoqueAtual() {
		int canetaA = caneta;
		int lapisA = lapis;
		int papalA = papal ;
		int borrachaA = borracha;
	}
	
	public void MostrarEstoque() {
		System.out.println("Mostrar estoque em Unidade ou Caixas ?\n1 - UND.\n2 - Caixas.");
		Scanner in = new Scanner (System.in);
		int op = in.nextInt();
		if (op == 1) {
			System.out.println("h� " + caneta + " Canetas no estoque\n" + "h� "+ lapis + " lapis no estoque\n" + "h� "+ papal + " papals no estoque\n" + "h� "+ borracha + " borrachas no estoque");
		}
		else {
			System.out.println("h� " + caneta/12 + " caixas de canetas no estoque\n" + "h� "+ lapis/12 + " caixas de lapis no estoque\n" + "h� "+ papal + "caixas de papals no estoque\n" + "h� "+ borracha/6 + " caixas de borrachas no estoque");
		}
		
	}
}