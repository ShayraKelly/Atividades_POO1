public class Locadora {

    private String nome;
    private String endereco;
    private String telefone;
    private Carro carro;
    private Cliente cliente;
    private Emprestimo emprestimo;

    public Locadora(String nome, String endereco, String telefone, Carro carro, Cliente cliente,
            Emprestimo emprestimo) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carro = carro;
        this.cliente = cliente;
        this.emprestimo = emprestimo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
