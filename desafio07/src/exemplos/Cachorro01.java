package exemplos;

/**
 *
 * @author Marcos
 */
public class Cachorro01 extends Animal01{
    String corDePelo;

    public Cachorro01(String corDePelo, double altura, int qtdPatas) {
        super(altura, qtdPatas);
        this.corDePelo = corDePelo;
    }
    
    
    @Override
    public void emitirSom() {
        super.emitirSom();
        latir();
    }
    
    private void latir(){
        System.out.println("auAu");
    }
    
}
