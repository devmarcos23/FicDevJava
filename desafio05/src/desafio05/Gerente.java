
package desafio05;

/**
 *
 * @author Marcos
 */
public class Gerente extends Funcionario{
   private int senha, numeroDeFuncionariosGerenciados;
   
   public boolean autentica(int senha){
       if (this.senha == senha) {
           System.out.println("Acesso Permitido!");
           return true;
       } else {
           System.out.println("Acesso negado!");
           return false;
       }
   }
   
   public void setSenha(int senha){
       this.senha = senha;
   }
   public int getSenha(){
       return this.senha;
   }
   
   public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados){
       this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
   }
   
   public int getNumeroDeFuncionariosGerenciados(){
       return this.numeroDeFuncionariosGerenciados;
   }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + getSalario(); 
    }

    
   
   
   
}
