public class Autor extends Publicacoes{
//atributos
    public String nome;
    public String titulacao;

//metodos    
    public Autor(String titulo, String dt_publicacao, String publicacoes_ref, String autor, String nome, String titulacao) {
        super(titulo, dt_publicacao, publicacoes_ref, autor);
        this.nome = nome;
        this.titulacao = titulacao;
    }


}