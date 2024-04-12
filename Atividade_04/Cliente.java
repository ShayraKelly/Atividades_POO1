public class Cliente {
    //atributos
    private String nome;
    private String endereço;
    private String telefone;
    private String email;
    private int n_conta;

    //metodos
    public Cliente(String nome, String endereço, String telefone, String email, int n_conta) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.n_conta = n_conta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getN_conta() {
        return n_conta;
    }
    public void setN_conta(int n_conta) {
        this.n_conta = n_conta;
    }
    
}
