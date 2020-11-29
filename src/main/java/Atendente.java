public class Atendente extends Funcionario{
    private final double comissaoDeVenda;
    private int contadorDeVendas = 0;
    private String cargo = "Atendente(a)";
    
    
    Atendente(String nome, int codigoDeFuncionario, double salario, double comissaoDeVenda){
        super(nome, codigoDeFuncionario, salario);
        this.comissaoDeVenda = comissaoDeVenda;
    }
    
    @Override
    public double calcularSalario(){
        return getSalario() + (this.comissaoDeVenda * this.contadorDeVendas);
    }
    
    
    @Override
    public String toString(){
        String info;
        
        info = "\n\nNome: " + getNome() + "\nSalario: " + this.calcularSalario() + 
               "\nCodigo de funcionario: " + getCodigoDeFuncionario() +
               "\nCargo: " + this.cargo;
        
        return info;
    }
    
    public void comissao(){
        this.contadorDeVendas++;
    }
    
    
}
