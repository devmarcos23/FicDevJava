package desafio07;

/**
 *
 * @author marcos
 */
public class Automovel extends Transporte {
    private String chassi, potencia, tipoDeCombustivel, autonomia ;
    private boolean hibrido, eletrico;

    public Automovel(String chassi, String potencia, String tipoDeCombustivel, String autonomia, boolean hibrido, boolean eletrico, String cor, String placa, String nomeFabricante, String nomeModelo, String dataFabricacao, int qtdRodas, int qtdPessoas, double qtdCarga) {
        super(cor, placa, nomeFabricante, nomeModelo, dataFabricacao, qtdRodas, qtdPessoas, qtdCarga);
        this.chassi = chassi;
        this.potencia = potencia;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.autonomia = autonomia;
        this.hibrido = hibrido;
        this.eletrico = eletrico;
    }
    

    

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isHibrido() {
        return hibrido;
    }

    public void setHibrido(boolean hibrido) {
        this.hibrido = hibrido;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }

}
