import java.util.ArrayList;
import java.util.List;

public class Lanche extends ItemCardapio{
    private List<String> ingredientes = new ArrayList<>();

    public Lanche(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void adicionarIngrediente(String ingrediente){
        ingredientes.add(ingrediente);
    }

    @Override
    public String descrever(){
        StringBuilder decricao = new StringBuilder("Lanche: " + nome + ", Ingredientes: " + ", Preço: R$" + calcularPreco());
        for(String ingrediente : ingredientes){
            descricao.append(ingrediente).append(", ");
        }
        return descricao.toString();

    }

    public double calcularPreco(){
        return preco;
    }

    public double calcularPreco(List<String> ingredientesExtras) {
        double adicionalIngrediente = 1.5;
        return preco + ingredientesExtras.size() * adicionalIngrediente;
    }

}