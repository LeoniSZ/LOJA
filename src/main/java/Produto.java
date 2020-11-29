public class Produto{
    private String descricao;
    private double preco;
    //private final double codigoDoProduto;
    
    Produto(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(){
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        String info;
        
        info = "\n\nProduto: " + getDescricao() + "\nPreco: " + getPreco();
        
        return info;
    }
    
}
