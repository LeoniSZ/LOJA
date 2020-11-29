
import java.util.Date;
/**
 *
 * @author Elioenai Roberto
 */
abstract class Venda{
    private final Date data;
    Cliente cliente;
    Produto produtos[] = new Produto[100];
    Produto produtosAux[];
    private int cont = 0;
    
    public Cliente getClienteObj(){
        return cliente;
    }
    //construtores
    
    Venda(){
        this.data = getData();
        //this.cliente.
    }
    
    Venda(Date data){
        this.data = data;
    }
    
    Venda(Date data, Cliente cliente){
        this.data = data;
        this.cliente = cliente;
    }
    
    //getters
    
    public int getCont(){
        return cont;
    }
    
    public Date getData(){
        return data;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public Produto getProduto(int numero){
        if(cont <= 99){
            return produtos[numero];
        }
        return produtosAux[numero - 100];
    }
    
    
    //metodos
    
    public void adicionarProduto(Produto newProduto){
        if(cont <= 99){
            produtos[cont] = new Produto(newProduto.getDescricao(), newProduto.getPreco());
            cont++;
        }
        if(cont == 100){
            this.produtosAux = new Produto[100];
        }
        if(cont >= 100){
            produtosAux[cont - 100] = new Produto(newProduto.getDescricao(), newProduto.getPreco());
            cont++;
        }
    }
    
    @Override
    public abstract String toString();
      
    //getTotal() imprime o valor final da compra
    public abstract double getTotal();
    
    //getNumProdutos() infomra quantos produtos já foram adicionados
    public int getNumProdutos(){
        return this.cont + 1;
    }
    
}








/*
Trechos descartados

//imprimirVenda() imprime o cupom fiscal da venda
    public void imprimirVenda(){
        System.out.println(toString());
        for(int i = 0; i < cont; i++){
            if(i <= 99){
                produtos[i].toString();
                //System.out.println("\nProduto: " + produtos[i].getDescricao() + "\nPreco: " + produtos[i].getPreco());
            }
            else{
                if(i > 99){
                    produtos[i].toString();
                    //System.out.println("\nProduto: " + produtos[i - 100].getDescricao() + "\nPreco: " + produtos[i-100].getPreco());
                }
            }
        }
    }
    
    
    //fecharVenda() fecha a venda, mudando o status e imprimindo os dados da venda
    public void fecharVenda(){
        //informacoesDeVenda();
        //imprimirVenda();
        System.out.printf("\nValor: %.2f\n", getTotal());
        
        System.out.println("\nVenda fechada!");
        System.out.println("--------------------------------------------------");
        this.status = true;
    }

        //verificarProduto( , ) verifica se o codigo de produto informado se refere a um produto dentro do estoque
    /*public boolean verificarProduto(Produto[] newProduto, double codigo){
        for(int i = 0; i < newProduto.length; i++){
            if(newProduto[i].getCodigo() == codigo){
                return true;
            }
        }
        return false;
    }*/
    
    //adicionarProduto( , , ) adiciona um produto a lista de compras apartir do codigo de produto e o numero de unidades adicionadas
    /*public void adicionarProduto(double codigo, Produto[] newProduto){
        //
        if(verificarProduto(newProduto, codigo)){
            if(cont <= 99){
                for(int i = 0; i < newProduto.length; i++){
                    if(newProduto[i].getCodigo() == codigo){
                        produtos[cont] = new Produto(newProduto[i].getDescricao(), newProduto[i].getPreco(), (int) newProduto[i].getCodigo());
                    }
                }
            }
            if(cont == 100){
                this.produtosAux = new Produto[100];
            }
            if(cont >= 100){
                for(int i = 0; i < newProduto.length; i++){
                    if(newProduto[i].getCodigo() == codigo){
                        produtosAux[cont-100] = new Produto(newProduto[i].getDescricao(), newProduto[i].getPreco(), (int) newProduto[i].getCodigo());
                    }
                }
                
            }
            //System.out.println(newProduto.getDescricao() + newProduto.getPreco());
            cont++;
        }
        
    }

    //getProduto() recebe um inteiro indicando o numero da posição da compra e retorna o produto que está no vetor
    /*public Produto getProduto(int numero){
        if(numero < 100){
            return this.produtos[numero - 1];
        }else{
            return this.produtos[(numero - 100) - 1];
        }
    }
*/
    
