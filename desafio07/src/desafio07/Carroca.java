
package desafio07;

/**
 *
 * @author Marcos
 */
public class Carroca extends Transporte{
    private boolean utilizaCavalo;

    public Carroca(boolean utilizaCavalo, String cor, String placa, String nomeFabricante, String nomeModelo, String dataFabricacao, int qtdRodas, int qtdPessoas, double qtdCarga) {
        super(cor, placa, nomeFabricante, nomeModelo, dataFabricacao, qtdRodas, qtdPessoas, qtdCarga);
        this.utilizaCavalo = utilizaCavalo;
    }

    public boolean isUtilizaCavalo() {
        return utilizaCavalo;
    }

    public void setUtilizaCavalo(boolean utilizaCavalo) {
        this.utilizaCavalo = utilizaCavalo;
    }
    
}
