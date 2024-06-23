public class Usuario_especial extends Usuario{
//atributos

//metodos 
    public Usuario_especial(String nome, int telefone, String email, String cpf, int emprestimo) {
        super(nome, telefone, email, cpf, emprestimo);
    }

    public boolean verifica_emprestimo(int qtd_livro){
        int emprestimo = getEmprestimo();
        setEmprestimo(emprestimo++);
        return true;
    }
}
