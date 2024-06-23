public class Artigo extends Publicacoes{
//atributos
    public String resumo;

//metodos    
    public Artigo(String titulo, String dt_publicacao, String publicacoes_ref, String autor, String resumo) {
        super(titulo, dt_publicacao, publicacoes_ref, autor);
        this.resumo = resumo;
    }
}
