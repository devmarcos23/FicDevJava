
package queue;

/**
 *
 * @author Marcos
 */
public class Carro {
    private String nomeFabricante, nomeModelo;
    private int anoFabricacao;

    public Carro(String nomeFabricante, String nomeModelo, int anoFabricacao){
        this.nomeFabricante = nomeFabricante;
        this.nomeModelo = nomeModelo;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Carro{" + "nomeFabricante=" + nomeFabricante + ", nomeModelo=" + nomeModelo + ", anoFabricacao=" + anoFabricacao + '}';
    }
    
    
    public String getNomeFabricante() {
        return nomeFabricante;
    }

    
    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    
    public String getNomeModelo() {
        return nomeModelo;
    }

    
    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    
}
