public class Usuario_especial extends Usuario{
//atributos
    public String resumo;

//metodos 
    public Usuario_especial(String nome, int telefone, String email, String cpf) {
        super(titulo, dt_publicacao, publicacoes_ref, autor);
        this.edicao = edicao;
        this.editora = editora;
        this.isbn = isbn;
    }
}