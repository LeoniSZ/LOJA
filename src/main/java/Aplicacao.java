
public class Aplicacao {


    public static void main(String[] args) {
        Gerente gerente = new Gerente("Fernada", 2546, 1500.0, 500.0);
        Atendente atendentes[] = new Atendente[5];
        Repositor repositores[] = new Repositor[5];
        Funcionario funcionarios[] = new Funcionario[5];
        Produto produtos[] = new Produto[5];
        
        produtos[0] = new Produto("Samsung A20",1200.0);
        produtos[1] = new Produto("PlayStation 5",5200.0);
        produtos[2] = new Produto("Xbox X",5100.0);
        produtos[3] = new Produto("Nintendo Switch",3000.0);
        produtos[4] = new Produto("PC Gamer",7200.0);
        
        
        funcionarios[0] = new Funcionario("Andressa", 2546, 980.0);
        atendentes[0] = new Atendente("Jose", 2547, 1100.0, 120.0);
        /*atendentes[1] = new Atendente("Joana", 2548, 1100.0, 120.0);
        atendentes[2] = new Atendente("Ruan", 2549, 1100.0, 120.0);
        atendentes[3] = new Atendente("Ronaldo", 2550, 1100.0, 120.0);
        atendentes[4] = new Atendente("Albanita", 2551, 1100.0, 120.0);*/
        
        repositores[0] = new Repositor("Moises", 2552, 700, 20, 20);
        /*repositores[1] = new Repositor("Carlos", 2553, 700, 12, 20);
        repositores[2] = new Repositor("John", 2554, 700, 9, 20);
        repositores[3] = new Repositor("Pedro", 2555, 700, 16, 20);
        repositores[4] = new Repositor("Joao", 2556, 700, 13, 20);*/
        Caixa caixa1 = new Caixa();
        
        // primeira venda
        caixa1.incluirProdutoPrazo(produtos[2]);
        caixa1.incluirProdutoPrazo(produtos[1]);
        caixa1.incluirProdutoPrazo(produtos[1]);
        caixa1.incluirProdutoPrazo(produtos[1]);
        caixa1.incluirProdutoPrazo(produtos[1]);
        caixa1.fecharVendaPrazo();
        atendentes[0].comissao();
        
        //segunda venda
        caixa1.incluirProdutoPrazo(produtos[4]);
        caixa1.fecharVendaPrazo();
        atendentes[0].comissao();
        
        
        //terceira venda
        
        caixa1.incluirProdutoVista(produtos[2]);
        caixa1.incluirProdutoVista(produtos[4]);
        caixa1.fecharVendaVista();
        atendentes[0].comissao();
        
        //imprimir o salario de todos os funcionarios
        
        System.out.println(funcionarios[0].toString());
        System.out.println(atendentes[0].toString());
        System.out.println(repositores[0].toString());
        System.out.println(gerente.toString());
        
    }
    
}
