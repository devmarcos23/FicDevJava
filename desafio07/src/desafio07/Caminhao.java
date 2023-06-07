package desafio07;

/**
 *
 * @author MArcos
 */
public class Caminhao extends Automovel{
    
    private double metros, cargaMaxima;
    private int qtdEixos;

    public Caminhao(double metros, double cargaMaxima, int qtdEixos, String chassi, String potencia, String tipoDeCombustivel, String autonomia, boolean hibrido, boolean eletrico, String cor, String placa, String nomeFabricante, String nomeModelo, String dataFabricacao, int qtdRodas, int qtdPessoas, double qtdCarga) {
        super(chassi, potencia, tipoDeCombustivel, autonomia, hibrido, eletrico, cor, placa, nomeFabricante, nomeModelo, dataFabricacao, qtdRodas, qtdPessoas, qtdCarga);
        this.metros = metros;
        this.cargaMaxima = cargaMaxima;
        this.qtdEixos = qtdEixos;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    
    
}