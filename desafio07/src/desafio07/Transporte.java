
package desafio07;

/**
 *
 * @author Marcos
 */
public class Transporte {
    private String cor, placa, nomeFabricante, nomeModelo, dataFabricacao;
    private int qtdRodas,qtdPessoas;
    private double qtdCarga;

    public Transporte(String cor, String placa, String nomeFabricante, String nomeModelo, String dataFabricacao, int qtdRodas, int qtdPessoas, double qtdCarga) {
        this.cor = cor;
        this.placa = placa;
        this.nomeFabricante = nomeFabricante;
        this.nomeModelo = nomeModelo;
        this.dataFabricacao = dataFabricacao;
        this.qtdRodas = qtdRodas;
        this.qtdPessoas = qtdPessoas;
        this.qtdCarga = qtdCarga;
    }
    
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    /**
     * @return the qtdPessoas
     */
    public int getQtdPessoas() {
        return qtdPessoas;
    }

    /**
     * @param qtdPessoas the qtdPessoas to set
     */
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    /**
     * @return the qtdCarga
     */
    public double getQtdCarga() {
        return qtdCarga;
    }

    /**
     * @param qtdCarga the qtdCarga to set
     */
    public void setQtdCarga(double qtdCarga) {
        this.qtdCarga = qtdCarga;
    }
    
    
    
   
}
