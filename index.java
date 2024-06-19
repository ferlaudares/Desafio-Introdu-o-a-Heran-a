package VEICULO; 

public class VEICULO {
    private string placa;
    private string modelo;
    private string marca;
    private int anoModelo;
    private int anoFabricacao;
    private String chassi;
    private String renavam;
    private String procedencia; // nacional ou importado

    public VEICULO(string placa, string modelo, string marca, int anoModelo, int anoFabricacao, String chassi, string renavam, string procedencia)
 
 this.placa = placa; 
 this.modelo = modelo;
 this.marca = marca;
 this.anoModelo = anoModelo;
 this.anoFabricacao = anoFabricacao;
 this.chassi = chassi;
 this.renavam = renavam;
 this.procedencia = procedencia;
}

public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAnoModelo() {
        return anoModelo;
    }
    
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    public String getChassi() {
        return chassi;
    }
    
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    public String getRenavam() {
        return renavam;
    }
    
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }
    
    public String getProcedencia() {
        return procedencia;
    }
    
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
