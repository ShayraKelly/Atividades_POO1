public class Tese extends Publicacoes{
//atributos
    public int n_pag;
    public int dt_defesa;
    public String resumo;
    public String instituicao;

//metodos    
    public Tese(String titulo, String dt_publicacao, String publicacoes_ref, String autor, int n_pag, int dt_defesa, String resumo, String instituicao) {
        super(titulo, dt_publicacao, publicacoes_ref, autor);
        this.n_pag = n_pag;
        this.resumo = resumo;
        this.dt_defesa = dt_defesa;
        this.instituicao = instituicao;
    }

}