public class Livro extends Publicacoes{
//atributos
    public String edicao;
    public String editora;
    public int isbn;

//metodos
    public Livro(String titulo, String dt_publicacao, String publicacoes_ref, String autor, double multa, String edicao, String editora, int isbn) {
        super(titulo, dt_publicacao, publicacoes_ref, autor, multa);
        this.edicao = edicao;
        this.editora = editora;
        this.isbn = isbn;
    }
}