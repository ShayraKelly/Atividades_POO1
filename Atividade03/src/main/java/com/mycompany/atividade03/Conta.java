/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shayr
 */


class Conta {
    private Pessoa titular;
    private String numero;
    private String agencia;
    private int banco;
    private double saldo;

    public Conta(Pessoa titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = "304";
        this.banco = 01;
        this.saldo = 0.0;
    }

    public Conta(Pessoa titular, String numero, String agencia, int banco) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = 0.0;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getBanco() {
        return this.banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}
