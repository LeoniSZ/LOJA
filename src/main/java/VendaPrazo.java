
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 55819
 */
public class VendaPrazo extends Venda{
    private double juros;
    
    public VendaPrazo(Date data) {
        super(data);
        this.juros = 0.1;
    }

    public VendaPrazo(Date data, Cliente cliente){
        super(data, cliente);
        this.juros = 0.1;
    }
    public VendaPrazo(){
        this.juros = 0.1;
    }
    
    @Override
    public double getTotal(){
        double total = 0;
        
        for(int i = 0; i < getCont(); i++){
            if(i < 100){
                total += produtos[i].getPreco();
            }
            if(i >= 100){
                total += produtosAux[i - 100].getPreco();
            }
        }
        
        return total + (total * this.juros);
    }
    
    @Override
    public String toString(){
        String info;
        
        info = "-------------Informações de venda à Prazo-----------------\n\nData: " + this.getData() +
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
