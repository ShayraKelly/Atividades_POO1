public class Sobremesa extends ItemCardapio {
    private String tamanhoPorcao;
    private int contagemCalorias;    

    public Sobremesa(String nome, double preco, String tamanhoPorcao, int contagemCalorias) {
        super(nome, preco);
        this.tamanhoPorcao = tamanhoPorcao;
        this.contagemCalorias = contagemCalorias;
    }
    
    public double calcularPreco() {
        return preco;
    }

    public double calcularPreco(boolean comCobertura) {
        // Cálculo considerando cobertura
        double adicionalCobertura = 2.0;
        return preco + (comCobertura ? adicionalCobertura : 0);
    }
    
    public String getTamanhoPorcao() {
        return tamanhoPorcao;
    }
    
    public void setTamanhoPorcao(String tamanhoPorcao) {
        this.tamanhoPorcao = tamanhoPorcao;
    }
    
    public int getContagemCalorias() {
        return contagemCalorias;
    }

    public void setContagemCalorias(int contagemCalorias) {
        this.contagemCalorias = contagemCalorias;
    }

    @Override
    public String descrever() {
        return "Sobremesa: " + nome + ", " + tamanhoPorcao + ", " + contagemCalorias + " calorias" + ", Preço: R$" + calcularPreco();
    }
}