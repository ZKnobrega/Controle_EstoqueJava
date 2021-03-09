public class Contador
{
        double valorCaneta = 0.50;
        double valorLapis = 0.40;
        double valorPapal = 1;
        double valorBorracha = 0.20;
        
        double valorCompraCaneta = 0.25;
        double valorCompraLapis = 0.20;
        double valorCompraPapal = 0.50;
        double valorCompraBorracha = 0.10;
        
        double saldoAtual = 100;
        double lucro;
        double compras;
        double lucroFinal=lucro-compras;
        double valorTP=75.8;
        
        public void contVendas(double produto, int numeroDeProdutos){
            if(produto==1){
                this.lucro+=valorCaneta*numeroDeProdutos;
                this.saldoAtual+=valorCaneta*numeroDeProdutos;
            }
            if(produto==2){
                this.lucro+=valorLapis*numeroDeProdutos;
                this.saldoAtual+=valorLapis*numeroDeProdutos;

            }
            if(produto==3){
                this.lucro+=valorPapal*numeroDeProdutos;
                this.saldoAtual+=valorPapal*numeroDeProdutos;
            }
            if(produto==4){
                this.lucro+=valorBorracha*numeroDeProdutos;
                this.saldoAtual+=valorBorracha*numeroDeProdutos;
            }
    }
    public double saldo(){
    System.out.println("saldo é: "+saldoAtual);
    return saldoAtual;
    }
    
    public double verificaSaldo(double qnt, double tipo){
        if(tipo==1){
        if((qnt*this.valorCaneta) >saldoAtual){
        System.out.println("saldo insuficiente"); 
        return  0; 
    }}
    if(tipo==2){
        if((qnt*this.valorLapis) >saldoAtual){
        System.out.println("saldo insuficiente"); 
        return  0; 
    }}
    if(tipo==3){
        if((qnt*this.valorPapal) >saldoAtual){
        System.out.println("saldo insuficiente"); 
        return  0; 
    }}
    if(tipo==4){
        if((qnt*this.valorBorracha) >saldoAtual){
        System.out.println("saldo insuficiente"); 
        return  0; 
    }}
    return 1;
}    
    public void contCompras(double produto, int numeroDeProdutos){
            if(produto==1){
                this.lucro-=valorCompraCaneta*numeroDeProdutos;
                this.saldoAtual-=valorCompraCaneta*numeroDeProdutos;
            }
            if(produto==2){
                this.lucro-=valorCompraLapis*numeroDeProdutos;
                 this.saldoAtual-=valorCompraLapis*numeroDeProdutos;
            }
            if(produto==3){
                this.lucro-=valorCompraPapal*numeroDeProdutos;
                 this.saldoAtual-=valorCompraPapal*numeroDeProdutos;
            }
            if(produto==4){
                this.lucro-=valorCompraBorracha*numeroDeProdutos;
                 this.saldoAtual-=valorCompraBorracha*numeroDeProdutos;
            }
    }
    
    public void lucro(){
        if(this.lucro>=0){
        System.out.println("o valor bruto da venda foi de: "+this.lucro);
    }else{
        System.out.println("você teve um prejuizo de: "+this.lucro);
    }
}   
}
