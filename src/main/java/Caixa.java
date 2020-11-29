
import java.util.Date;

/**
 *
 * @author Elioenai Roberto
 */
public class Caixa{
    private final Date data = new Date();
    Venda vendas[] = new Venda[100];
    private int cont1 = 0;
    
    Caixa(){
    }
    
    //Caixa -> Vendas[ ] -> adicionarProduto( p )
    public void incluirProdutoPrazo(Produto produto){
        if(vendas[cont1] == null){
            vendas[cont1] = new VendaPrazo(data);
            vendas[cont1].adicionarProduto(produto);
        }else{
            vendas[cont1].adicionarProduto(produto);
        }
    }
    public void incluirProdutoVista(Produto produto){
        if(vendas[cont1] == null){
            vendas[cont1] = new VendaVista(data);
            vendas[cont1].adicionarProduto(produto);
        }else{
            vendas[cont1].adicionarProduto(produto);
        }
    }
    
    public void fecharVendaPrazo(){
        System.out.println(vendas[cont1].toString());
        cont1++;
    }
    public void fecharVendaVista(){
        System.out.println(vendas[cont1].toString());
        cont1++;
    }
}
