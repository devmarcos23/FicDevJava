
package desafio07;

/**
 *
 * @author Marcos
 */
public class Moto extends Automovel{
    private boolean usaCapacete;

    public Moto(boolean usaCapacete, String chassi, String potencia, String tipoDeCombustivel, String autonomia, boolean hibrido, boolean eletrico, String cor, String placa, String nomeFabricante, String nomeModelo, String dataFabricacao, int qtdRodas, int qtdPessoas, double qtdCarga) {
        super(chassi, potencia, tipoDeCombustivel, autonomia, hibrido, eletrico, cor, placa, nomeFabricante, nomeModelo, dataFabricacao, qtdRodas, qtdPessoas, qtdCarga);
        this.usaCapacete = usaCapacete;
    }

    public boolean isUsaCapacete() {
        return usaCapacete;
    }

    public void setUsaCapacete(boolean usaCapacete) {
        this.usaCapacete = usaCapacete;
    }


    
 
}
