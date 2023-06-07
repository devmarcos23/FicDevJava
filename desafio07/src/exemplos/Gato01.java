
package exemplos;

/**
 *
 * @author Marcos
 */
public class Gato01 extends Animal01{
    String cordDePelo;

    public Gato01(String cordDePelo, double altura, int qtdPatas) {
        super(altura, qtdPatas);
        this.cordDePelo = cordDePelo;
    }
    
    @Override
    public void emitirSom(){
        super.emitirSom();
        miau();
    }
    
    private void miau(){
        System.out.println("miau");
    }
}
