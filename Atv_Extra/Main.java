public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        Bebida cocaCola = new Bebida("Coca-Cola", 6.0, "grande", "frio");
        Lanche xBacon = new Lanche("X-Bacon", ingrediente, 12.0);
        xBacon.adicionarIngrediente("Bacon");
        xBacon.adicionarIngrediente("Queijo");
        Sobremesa sundae = new Sobremesa("Sundae", 6.0, "grande", 250);

        pedido.adicionarItem(cocaCola);
        pedido.adicionarItem(xBacon);
        pedido.adicionarItem(sundae);

        double precoTotal = pedido.calcularTotal();

        pedido.exibirPedido();
        System.out.println("Preço total: R$" + precoTotal);
    }
}