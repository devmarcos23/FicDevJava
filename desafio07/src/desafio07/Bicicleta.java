package desafio07;

/**
 *
 * @author Marcos
 */
public class Bicicleta extends Automovel{
    private int quantidadesMarcha;
    private double tamanhoAro;

    public Bicicleta(int quantidadesMarcha, double tamanhoAro, String chassi, String potencia, String tipoDeCombustivel, String autonomia, boolean hibrido, boolean eletrico, String cor, String placa, String nomeFabricante, String nomeModelo, String dataFabricacao, int qtdRodas, int qtdPessoas, double qtdCarga) {
        super(chassi, potencia, tipoDeCombustivel, autonomia, hibrido, eletrico, cor, placa, nomeFabricante, nomeModelo, dataFabricacao, qtdRodas, qtdPessoas, qtdCarga);
        this.quantidadesMarcha = quantidadesMarcha;
        this.tamanhoAro = tamanhoAro;
    }

    public int getQuantidadesMarcha() {
        return quantidadesMarcha;
    }

    public void setQuantidadesMarcha(int quantidadesMarcha) {
        this.quantidadesMarcha = quantidadesMarcha;
    }

    public double getTamanhoAro() {
        return tamanhoAro;
    }

    public void setTamanhoAro(double tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }


    
    
}
