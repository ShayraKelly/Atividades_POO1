public class Carro_Popular extends Carro {
    private String ar_condicionado;

    public Carro_Popular(String marca, String modelo, String placa, String valor_locacao, int ano,
            String ar_condicionado) {
        super(marca, modelo, placa, valor_locacao, ano);
        this.ar_condicionado = ar_condicionado;
    }

    public String getAr_condicionado() {
        return ar_condicionado;
    }

    public void setAr_condicionado(String ar_condicionado) {
        if (ar_condicionado = "S") {
            ar_condicionado = true;
        }if (ar_condicionado = "N") {
            ar_condicionado = false;
        } else {
            System.err.println("Erro: " + e.getMessage());   
        }
    } 
    
}