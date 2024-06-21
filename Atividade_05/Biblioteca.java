public class Biblioteca {
//atributos
    public String nome;
    public String endereco;
    public Publicacoes titulo;

//métodos
    public Biblioteca(String nome, String endereco, Publicacoes titulo) {
        this.nome = nome;
        this.endereco = endereco;
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Publicacoes getTitulo() {
        return titulo;
    }

    public void setTitulo(Publicacoes titulo) {
        this.titulo = titulo;
    }
}