public class Publicacoes {
//atributos
    private String titulo;
    private String dt_publicacao;
    private String publicacoes_ref;
    private String autor;
    private double multa;

//metodos    
    public Publicacoes(String titulo, String dt_publicacao, String publicacoes_ref, String autor, double multa) {
        this.titulo = titulo;
        this.dt_publicacao = dt_publicacao;
        this.publicacoes_ref = publicacoes_ref;
        this.autor = autor;
        this.multa = multa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDt_publicacao() {
        return dt_publicacao;
    }

    public void setDt_publicacao(String dt_publicacao) {
        this.dt_publicacao = dt_publicacao;
    }

    public String getPublicacoes_ref() {
        return publicacoes_ref;
    }

    public void setPublicacoes_ref(String publicacoes_ref) {
        this.publicacoes_ref = publicacoes_ref;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

}
