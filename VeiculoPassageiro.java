public class VeiculoPassageiro extends VEICULO {
    private String tipoCombustivel;
    private String motor;
    private double consumoMedio;
    private int numeroPortas;
    private int numeroPassageiros;
    private String corExterna;
    private String corInterna;
    private List<String> opcionais;

  public VeiculoPassageiro (string tipoCombustivel, string motor; double consumoMedio, int numeroPortas, int numeroPassageiros, string corExterna,
  string corInterna)
 
  this.tipoCombustivel = tipoCombustivel;
  this.motor = motor;
  this.consumoMedio = consumoMedio;
  this.numeroPortas = numeroPortas;
  this.numeroPassageiros = numeroPassageiros;
  this.corExterna = corExterna;
  this.corInterna = corInterna;

  public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public String getMotor() {
        return motor;
    }
    
    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    public double getConsumoMedio() {
        return consumoMedio;
    }
    
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    
    public int getNumeroPortas() {
        return numeroPortas;
    }
    
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    
    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
    
    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
    
    public String getCorExterna() {
        return corExterna;
    }
    
    public void setCorExterna(String corExterna) {
        this.corExterna = corExterna;
    }
    
    public String getCorInterna() {
        return corInterna;
    }
    
    public void setCorInterna(String corInterna) {
        this.corInterna = corInterna;
    }
    
    public List<String> getOpcionais() {
        return opcionais;
    }
    
    public void setOpcionais(List<String> opcionais) {
        this.opcionais = opcionais;
    }
}








