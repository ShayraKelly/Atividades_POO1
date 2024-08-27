public class Carro_Popular extends Carro{
    private boolean ar_condicionado;

    public Carro_Popular(String marca, String modelo, String placa, double valor_locacao, int ano,
            boolean ar_condicionado) {
        super(marca, modelo, placa, valor_locacao, ano);
        this.ar_condicionado = ar_condicionado;
    }

    public boolean isAr_condicionado() {
        return ar_condicionado;
    }

    public void setAr_condicionado(boolean ar_condicionado) {
        this.ar_condicionado = ar_condicionado;
    }   
}
