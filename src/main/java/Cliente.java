/**
 *
 * @author Elioenai Roberto
 */
public class Cliente {
    private final String nomeCliente;
    private String endereco;
    
    
    //construtores
    
    Cliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    Cliente(String nomeCliente, String endereco){
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    
    //getters
    public String getEndereco(){
        return endereco;
    }
    
    public String getCliente(){
        return nomeCliente;
    }
    
    //imprime os dados do cliente caso necessario
    @Override
    public String toString(){
        String info;
        
        info = "\nNome: " + this.getCliente() + "\nEndereco: " + this.getEndereco();
        return info;
    }
    
}
