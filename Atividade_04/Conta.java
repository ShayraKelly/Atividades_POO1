public class Conta {
    //atributos
    private String titular;
    private int n_conta;
    private float saldo;
    private int agencia;

    //metodos
    public Conta(String titular, int n_conta, float saldo, int agencia) {
        this.titular = titular;
        this.n_conta = n_conta;
        this.saldo = saldo;
        this.agencia = agencia;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getN_conta() {
        return n_conta;
    }
    public void setN_conta(int n_conta) {
        this.n_conta = n_conta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    

}
