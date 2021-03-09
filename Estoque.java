public class Estoque extends Contador
{
    int caneta = 120, lapis = 120, papal = 120, borracha = 120;
    double caixasCaneta = 10, caixasLapis =10, caixasBorracha = 20;
        
       /* double valorTotalCaneta = (caneta * valorCaneta);
        double valorTotalLapis = (lapis * valorLapis);
        double valorTotalPapal =(papal * valorPapal);
        double valorTotalBorracha = (borracha * valorBorracha);
        */
        
         void exibirProdutos(int op){
                    System.out.println("-------PRODUTOS-------");
                    System.out.println("1-Canetas: " + this.caneta + "("+ this.caixasCaneta+") caixas");
                    System.out.println("2-lapis: " + this.lapis + "("+this.caixasLapis+") caixas");
                    System.out.println("3-papal: " + this.papal + " resmas");
                    System.out.println("4-borrachas: " + this.borracha + "("+this.caixasBorracha+") caixas");
                    
                    if(op==1){
                    System.out.println("qual produto deseja Comprar");
                }if(op==2){
                System.out.println("qual produto deseja Vender");
                }
        }
        
        public double adcCaneta(int caneta, int qnt){
        this.caneta += qnt;
        return this.caixasCaneta = (caneta / 10);
    }
     public double adcLapis(int lapis, int qnt){
        this.lapis +=qnt;
        return this.caixasLapis = (lapis / 12);
    }
     public double adcBorracha(int borracha, int qnt){
        this.borracha += qnt;
        return this.caixasBorracha = (borracha/ 6);
    }
    
    public double verificaEstoque(double qnt, double tipo){
        if(tipo==1){
        if(qnt >caneta){
        System.out.println("estoque insuficiente"); 
        return  0; 
    }}
    if(tipo==2){
        if(qnt >lapis){
        System.out.println("estoque insuficiente"); 
        return  0; 
    }}
    if(tipo==3){
        if(qnt >papal){
        System.out.println("estoque insuficiente"); 
        return  0; 
    }}
    if(tipo==4){
        if(qnt >borracha){
        System.out.println("estoque insuficiente"); 
        return  0; 
    }}
    return 1;
}
        public double vendeCaneta(int caneta, int qnt){
        this.caneta -= qnt;
        return this.caixasCaneta = (caneta / 10);
    }
     public double vendeLapis(int lapis, int qnt){
        this.lapis -=qnt;
        return this.caixasLapis = (lapis / 12);
    }
     public double vendeBorracha(int borracha, int qnt){
        this.borracha -= qnt;
        return this.caixasBorracha = (borracha/ 6);
    }
    
    void vendOuComp(int voc){
        if(voc==1){
            System.out.println("Quantas unidades deseja comprar?");        
        }if(voc==2){
            System.out.println("Quantas unidades deseja Vender?");
        }
    }
            
}
