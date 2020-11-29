
import java.util.Date;


public class VendaVista extends Venda{
    double desconto;
    // construtores
    VendaVista (Date data, Cliente cliente, double desconto){
        super(data, cliente);
        this.desconto = desconto/100;
    }
    public VendaVista(Date data) {
        super(data);
        this.desconto = 0.1;
    }
    public VendaVista(Date data, Cliente cliente){
        super(data, cliente);
        this.desconto = 0.1;
    }
    public VendaVista(){
        this.desconto = 0.1;
    }
    
    
    //pega o valor total da compra
    @Override
    public double getTotal(){
        double total = 0;
        
        for(int j = 0; j < getCont(); j++){
            if(j < 100){
                //System.out.println(produtos[j].getDescricao());
                total += produtos[j].getPreco();
            }
            if(j >= 100){
                total += produtosAux[j - 100].getPreco();
            }
        }
        
        return total - (total * this.desconto);
    }
    
    
    //imprime toda a compra
    @Override
    public String toString(){
        String info;
        
        info = "-------------Informações de venda à Vista-----------------\n\nData: " + this.getData() +
                "\nCliente:" + this.getClienteObj() +
                "\n--------------------------------------------------\n";
        
        for(int i = 0; i < getCont(); i++){
            if(i <= 99){
                info += produtos[i].toString();
                //System.out.println("\nProduto: " + produtos[i].getDescricao() + "\nPreco: " + produtos[i].getPreco());
            }
            else{
                if(i > 99){
                    info += produtos[i].toString();
                    //System.out.println("\nProduto: " + produtos[i - 100].getDescricao() + "\nPreco: " + produtos[i-100].getPreco());
                }
            }
        }
        
        info += "\n\nValor: " + getTotal() + "\n--------------------------------------------------\n";
        
        
        
        return info;
    }
    
    
}
