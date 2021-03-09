import java.util.Scanner;

public class menu extends Estoque{
    Scanner blz = new Scanner(System.in); 
    Contador c = new Contador();
    
    int escolha, qnt=0, produtoRetirar, produtoColocar, cond = 0, uoc=0;
    int tipo;
    int contVendasCaneta=0, contVendasLapis=0, contVendasPapal=0, contVendasBorracha=0;
    int contComprasCaneta=0, contComprasLapis=0, contComprasPapal=0, contComprasBorracha=0;
    
public void opcoes(){
            int escolha;
            System.out.println("\nSEJA BEM VINDO");
            System.out.println("1-COMPRAR");
            System.out.println("2-VENDER");
            System.out.println("3-QUANTIDADE DE ESTOQUE");
            System.out.println("4-Valor Bruto ATUAL");
            System.out.println("7-SALDO:");
            System.out.println("5-SAIR DO PROGRAMA\n");
            
        }
          
    void menu() {   
        while (cond < 1) {
            opcoes();
            escolha = blz.nextInt();
            switch (escolha) {

                case 1:
                    exibirProdutos(escolha);
                    produtoColocar = blz.nextInt();
                    
                    System.out.println("unidades ou caixas? 1-unidades || 2-caixas");
                    uoc = blz.nextInt();
                    switch (produtoColocar) {
                        case 1:
                            if(uoc == 1){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                            }if(uoc == 2){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                                qnt=qnt*10;
                            }
                            
                            tipo=1;
                            if(c.verificaSaldo(qnt, tipo)==1) {
                                adcCaneta(caneta, qnt);
                                c.contCompras(tipo, qnt);
                                break;
                            }
                            else {
                                c.verificaSaldo(qnt, tipo);
                                break;
                            }
                        case 2:
                            if(uoc == 1){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                            }if(uoc == 2){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                                qnt=qnt*12;
                            }                                                      
                            
                            tipo=2;
                            if(c.verificaSaldo(qnt, tipo)==1) {
                                adcLapis(lapis, qnt);
                                c.contCompras(tipo, qnt);
                                break;
                            }
                            else {
                                c.verificaSaldo(qnt, tipo);
                                break;
                            }
                        case 3:
                            vendOuComp(escolha);
                            qnt = blz.nextInt();
                            tipo=3;
                            if(c.verificaSaldo(qnt, tipo)==1) {
                                papal = papal + qnt;
                                c.contCompras(tipo, qnt);
                                break;
                            }
                            else {
                                c.verificaSaldo(qnt, tipo);
                                break;
                            }
                        case 4:
                            if(uoc == 1){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                            }if(uoc == 2){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                                qnt=qnt*6;
                            }
                            
                            tipo=4;
                            if(c.verificaSaldo(qnt, tipo)==1) {
                                adcBorracha(borracha, qnt);
                                c.contCompras(tipo, qnt);
                                break;
                            }
                            else {
                                c.verificaSaldo(qnt, tipo);
                                break;
                            }
                    }        
                    break;
                case 2://---------------------------------------------------VENDA---------------------------------------
                    exibirProdutos(escolha);
                    this.produtoRetirar = blz.nextInt();
                    switch (produtoRetirar) {     
                        case 1:
                        //fazer pra vender tbm em caixas
                            vendOuComp(escolha);
                            qnt = blz.nextInt();
                            tipo=1;
                            if(verificaEstoque(qnt, tipo)==1){
                            vendeCaneta(caneta, qnt);
                            c.contVendas(tipo, qnt);
                            break;
                        }else{
                            break;
                        }
                        case 2:
                            vendOuComp(escolha);
                            qnt = blz.nextInt();
                            tipo=2;
                            if(verificaEstoque(qnt, tipo)==1){
                            vendeLapis(lapis, qnt);
                            c.contVendas(tipo, qnt);
                            break;
                        }else{
                            break;
                        }
                        case 3:
                            vendOuComp(escolha);
                            qnt = blz.nextInt();
                            if(verificaEstoque(qnt, tipo)==1){
                            papal = papal - qnt;
                            tipo=3;
                            c.contVendas(tipo, qnt);
                            break;
                        }else{
                            break;
                        }
                        case 4:
                            vendOuComp(escolha);
                            qnt = blz.nextInt();
                            tipo=4;
                            if(verificaEstoque(qnt, tipo)==1){
                            vendeBorracha(borracha, qnt);
                            c.contVendas(tipo, qnt);
                            break;
                        }else{
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
                    
                case 7:
                    c.saldo();
                    
            }
        }
    }
}
