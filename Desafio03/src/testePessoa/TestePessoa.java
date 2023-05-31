
package testePessoa;


public class TestePessoa {

    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(); 
        
        p1.setNomePessoa("marcos");
        p1.setIdadePessoa(23);
        System.out.println(p1.getNomePessoa() + p1.getIdadePessoa());
    }
    
}
