
package desafio05;

/**
 *
 * @author Marcos
 */
public class Funcionario {
    private String nome, cpf;
    private double salario;
    
    
    public double getBonificacao(){
        return this.salario * 0.10;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf){
       this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
    
    
    
}
