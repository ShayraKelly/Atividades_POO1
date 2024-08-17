public class Pessoa_Juridica implements Cliente{
    private String nome;
    private String telefone;
    private String endereco;
    private String cnpj;
    private String nome_representante;

    @Override
    public String getNome(){
        return nome;
    }

    @override
    public String getTelefone(){
        return telefone;
    }

    @Override
    public String getEndereco(){
        return endereco;
    }

    public Pessoa_Juridica(String nome, String cnpj, String nome_representante) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.nome_representante = nome_representante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome_representante() {
        return nome_representante;
    }

    public void setNome_representante(String nome_representante) {
        this.nome_representante = nome_representante;
    }
    
}