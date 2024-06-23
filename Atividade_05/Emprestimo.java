public class Emprestimo{
//atributos
    private Usuario usuarios;
    private Publicacoes publicacao;
    private int renovacao;
    private double val_multa;
    private boolean devolucao;
    
//métodos

    public Emprestimo(Usuario usuarios, Publicacoes publicacao) {
        this.usuarios = usuarios;
        this.publicacao = publicacao;
        this.renovacao = 0;
        this.val_multa = 0;
        this.devolucao = false;
    }

    public boolean renovacao_emprestimo(){
        val_renovacao = getRenovacao();
        if (val_renovacao > 3) {
            setRenovacao(val_renovacao++);
            return true;
        }else{
            setRenovacao(val_renovacao++);
            return false;
        }
    }

    public double devolucao_emprestimo(){
        setDevolucao(true);
        return getVal_multa();
        for(x = 0; x <= getRenovacao(); x++){
            if (x < 3) {
                continue;
            }else{
                multa = getVal_multa();
                setVal_multa(multa + publicacao.getMulta());
            }
        }
        return getVal_multa();
    }

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    public Publicacoes getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacoes publicacao) {
        this.publicacao = publicacao;
    } 
    
    public int getRenovacao() {
        return renovacao;
    }

    public void setRenovacao(int renovacao) {
        this.renovacao = renovacao;
    }

    public double getVal_multa() {
        return val_multa;
    }

    public void setVal_multa(double val_multa) {
        this.val_multa = val_multa;
    }

    public boolean getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(boolean devolucao) {
        this.devolucao = devolucao;
    }

}
