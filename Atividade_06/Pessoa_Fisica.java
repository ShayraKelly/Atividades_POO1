public class Pessoa_Fisica implements Cliente{
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;    
    
    public Pessoa_Fisica(String nome, String telefone, String endereco, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
