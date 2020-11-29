/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 55819
 */
public class Gerente extends Funcionario {
    private final double comissao;
    private String cargo = "Gerente";
    
    Gerente(String nome, int codigoDeFuncionario, double salario, double comissao){
        super(nome, codigoDeFuncionario, salario);
        this.comissao = comissao;
    }
    
    @Override
    public double calcularSalario(){
        return getSalario() + this.comissao;
    }
    
    @Override
    public String toString(){
        String info;
        
        info = "\n\nNome: " + getNome() + "\nSalario: " + this.calcularSalario() +
                "\nCodigo de funcionario: " + getCodigoDeFuncionario() +
                "\nCargo: " + this.cargo;
        
        return info;
    }
}
