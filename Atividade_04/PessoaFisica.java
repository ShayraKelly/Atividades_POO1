public class PessoaFisica extends Cliente{
    //atributos
    private string cpf;

    //metodos
    public PessoaFisica(String nome, String endereço, String telefone, String email, string cpf) {
        super(nome, endereço, telefone, email);
        this.cpf = cpf;
    }

    public string getCpf() {
        return cpf;
    }

    public void setCpf(string cpf) {
        this.cpf = cpf;
    }

}
