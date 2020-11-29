public class Repositor extends Funcionario {
    private double horasTrabalhadas;
    private final double valorHoras;
    private String cargo = "Repositor(a)";
    
    Repositor(String nome, int codigoDeFuncionario, double salario, double horasTrabalhadas, double valorHoras){
        super(nome, codigoDeFuncionario, salario);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoras = valorHoras;
    }
    
    public void setHorasTrabalhadas(double newHorasTrabalhadas){
        this.horasTrabalhadas = newHorasTrabalhadas;
    }
    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    
    public double getValorHoras(){
        return valorHoras;
    }
    
    @Override
    public double calcularSalario(){
        return getSalario() + (horasTrabalhadas * valorHoras);
    }
    
    @Override
    public String toString(){
        String info;
        
        info = "\n\nNome: " + getNome() + "\nSalario: " + this.calcularSalario() + 
               "\nCodigo de funcionario: " + getCodigoDeFuncionario() + "\nHoras trabalhadas: " + this.horasTrabalhadas +
               "\nCargo: " + this.cargo;
        
        return info;
    
    }
}