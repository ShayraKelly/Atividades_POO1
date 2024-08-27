public class Carro_SUV extends Carro{
    private String tam_portamalas;
    private String tipo_tracao;
    private String tipo_combustivel;
    private boolean ar_condicionado;
    
    public Carro_SUV(String marca, String modelo, String placa, double valor_locacao, int ano, String tam_portamalas,
            String tipo_tracao, String tipo_combustivel, boolean ar_condicionado) {
        super(marca, modelo, placa, valor_locacao, ano);
        this.tam_portamalas = tam_portamalas;
        this.tipo_tracao = tipo_tracao;
        this.tipo_combustivel = tipo_combustivel;
        this.ar_condicionado = true;
    }

    public String getTam_portamalas() {
        return tam_portamalas;
    }

    public void setTam_portamalas(String tam_portamalas) {
        this.tam_portamalas = tam_portamalas;
    }

    public String getTipo_tracao() {
        return tipo_tracao;
    }

    public void setTipo_tracao(String tipo_tracao) {
        this.tipo_tracao = tipo_tracao;
    }

    public String getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(String tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }

    public boolean getAr_condicionado() {
        return ar_condicionado;
    }

    public void setAr_condicionado(boolean ar_condicionado) {
        this.ar_condicionado = ar_condicionado;
    }
    
}
