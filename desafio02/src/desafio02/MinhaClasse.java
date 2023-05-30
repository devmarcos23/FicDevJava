
package desafio02;


public class MinhaClasse {
    private int valor01,valor02;
    
    public MinhaClasse(int v1, int v2){
        this.valor01 = v1;
        this.valor02 = v2;
    }
    
    public int somar(){
        return this.valor01 + this.valor02;
    }
    
    public int subtrair(){
        return this.valor01 - this.valor02;
    }
}
