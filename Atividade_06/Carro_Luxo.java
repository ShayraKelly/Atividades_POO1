public class Carro_Luxo extends Carro{
    private String tam_portamalas;
    private String gps_int;
    private String ar_condicionado;
    private int qtd_airbags;
    
    public Carro_Luxo(String marca, String modelo, String placa, String valor_locacao, int ano, String tam_portamalas,
            String gps_int, String ar_condicionado, int qtd_airbags) {
        super(marca, modelo, placa, valor_locacao, ano);
        this.tam_portamalas = tam_portamalas;
        this.gps_int = gps_int;
        this.ar_condicionado = ar_condicionado;
        this.qtd_airbags = qtd_airbags;
    }

    public String getTam_portamalas() {
        return tam_portamalas;
    }

    public void setTam_portamalas(String tam_portamalas) {
        this.tam_portamalas = tam_portamalas;
    }

    public String getGps_int() {
        return gps_int;
    }

    public void setGps_int(String gps_int) {
        if (gps_int = "S") {
            gps_int = true;
        }if (gps_int = "N") {
            gps_int = false;
        } else {
            System.err.println("Resposta inválida!");
        }
    }

    public String getAr_condicionado() {
        return ar_condicionado;
    }

    public void setAr_condicionado(String ar_condicionado) {
        this.ar_condicionado = true;
    }

    public int getQtd_airbags() {
        return qtd_airbags;
    }

    public void setQtd_airbags(int qtd_airbags) {
        this.qtd_airbags = qtd_airbags;
    }

}