public class Bebida extends ItemCardapio {
    private String tamanho;
    private String temperatura;
    
    public Bebida(String nome, double preco, String tamanho, String temperatura) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.temperatura = temperatura;
    }
    
    @Override
    public String descrever() {
        return "Bebida: " + nome + ", " + tamanho + ", " + temperatura + ", Preço: R$" + calcularPreco();

    }

    public String getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }


    public double calcularPreco(){
        return preco;
    }

    public double calcularPreco(String tamanho){
        double adicionalTamanho = 0;
        if (tamanho.equals("medio")) {
            adicionalTamanho = 1.0;
        } else if (tamanho.equals("grande")) {
            adicionalTamanho = 2.0;
        }
        return preco + adicionalTamanho;
    }
}