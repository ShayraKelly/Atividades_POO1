public class Pessoa_Fisica implements Cliente{
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;
    
    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public String getTelefone(){
        return telefone;
    }

    @Override
    public String getEndereco(){
        return endereco;
    }

    public Pessoa_Fisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}