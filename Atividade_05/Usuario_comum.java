public class Usuario_comum extends Usuario{
//atributos
    public String resumo;

//metodos 
    public Usuario_comum(String nome, int telefone, String email, String cpf) {
        super(titulo, dt_publicacao, publicacoes_ref, autor);
        this.edicao = edicao;
        this.editora = editora;
        this.isbn = isbn;
    }

}