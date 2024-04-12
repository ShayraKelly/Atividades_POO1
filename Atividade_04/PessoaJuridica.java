public class PessoaJuridica extends Cliente{
    //atribupos
    private string cnpj;
    private string empresa;

    //metodos
    public PessoaJuridica(String nome, String endereço, String telefone, String email, string cnpj, string empresa) {
        super(nome, endereço, telefone, email);
        this.cnpj = cnpj;
        this.empresa = empresa;
    }

    public string getCnpj() {
        return cnpj;
    }

    public void setCnpj(string cnpj) {
        this.cnpj = cnpj;
    }

    public string getEmpresa() {
        return empresa;
    }

    public void setEmpresa(string empresa) {
        this.empresa = empresa;
    }    
}
