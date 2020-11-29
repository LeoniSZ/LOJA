
public class Funcionario {
    private String nome;
    private int codigoDeFuncionario;
    private double salario;
    private String cargo = "Funcionario(a)";
    
    Funcionario(){
    }
    
    Funcionario(String nome, int codigoDeFuncionario, double salario){
        this.nome = nome;
        this.codigoDeFuncionario = codigoDeFuncionario;
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
   
    public String getNome(){
        return nome;
    }
    public int getCodigoDeFuncionario(){
        return codigoDeFuncionario;
    }
    
    
    public double calcularSalario(){
        return getSalario();
    }
    
    
    @Override
    public String toString(){
        String info;
        
        info = "\n\nNome: " + getNome() + "\nSalario: " + this.calcularSalario() + "\nCodigo de funcionario: " + getCodigoDeFuncionario() +
                "\nCargo: " + this.cargo;
        
        return info;
    }
    /*
    public double calcularSalario();
    
    @Override
    public String toString();*/
}
