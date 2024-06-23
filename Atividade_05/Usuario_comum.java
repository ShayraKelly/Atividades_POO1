public class Usuario_comum extends Usuario{
//atributos

//metodos 
    public Usuario_comum(String nome, int telefone, String email, String cpf, int emprestimo){
        super(nome, telefone, email, cpf, emprestimo);
    }

    public boolean verifica_emprestimo(int qtd_livro){
        int emprestimo = getEmprestimo();
        if (qtd_livro >= 1) {
            setEmprestimo(emprestimo++);
            return true;
        }else{
            return false;
        }
    }
}