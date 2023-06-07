package exemplos;

/**
 *
 * @author Usuário 106
 */
public class Main {

    public static void main(String[] args) {
        //exemplo 00
        Animal00 animal00 = new Animal00(4,1.70);
        Cachorro00 cachorro00 = new Cachorro00(4, 30, "marrom");
        
        //exemplo 01
        Animal01 animal01[] = new Animal01[2];
        animal01[0] = new Animal01(30, 3);
        animal01[1] = new Cachorro01("preto", 70, 4);
        
        //exemplo 02
        Animal01 meusAnimais [] = new Animal01[10];
        meusAnimais [0] = new Animal01(4,30);
        meusAnimais [1] = new Cachorro01("preto", 50, 4);
        meusAnimais [2] = new Gato01("branco", 30, 4);
        meusAnimais[0].emitirSom();
        meusAnimais[1].emitirSom();
        meusAnimais[2].emitirSom();
        
        
        
    }
    
}
