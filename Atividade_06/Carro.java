import java.util.ArrayList;

public abstract class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double valor_locacao;

        public Carro(String marca, String modelo, String placa, double valor_locacao, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.placa = placa;
            this.valor_locacao = valor_locacao;
            this.ano = ano;
        }

    public static ArrayList<ArrayList<Carro>> criarListaDeListas() {
        return new ArrayList<>();
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
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getValor_locacao() {
        return valor_locacao;
    }
    public void setValor_locacao(String valor_locacao) {
        this.valor_locacao = valor_locacao;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

}