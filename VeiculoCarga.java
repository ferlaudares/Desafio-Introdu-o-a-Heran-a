public class VeiculoCarga extends Veiculo {
    private double capacidadeCargaKg;
    private double altura;
    private double largura;
    private double profundidade;

    public VeiculoCarga (double capacidadeCargaKg, double altura, double largura, double profundidade)
    
    this.capacidadeCargaKg = capacidadeCargaKg;
    this.altura = altura;
    this.largura = largura;
    this.profundidade = profundidade;

    public double getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }
    
    public void setCapacidadeCargaKg(double capacidadeCargaKg) {
        this.capacidadeCargaKg = capacidadeCargaKg;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double getProfundidade() {
        return profundidade;
    }
    
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
}