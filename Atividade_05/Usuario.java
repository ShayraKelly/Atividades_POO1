public class Usuario {
//atributos
    private String nome;
    private int telefone;
    private String email;
    private String cpf;
    private int emprestimo;

//métodos
    public Usuario(String nome, int telefone, String email, String cpf, int emprestimo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.emprestimo = emprestimo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(int emprestimo) {
        this.emprestimo = emprestimo;
    }
}