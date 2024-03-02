/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author shayr
 */

public class Conta_corrente {
    String cpf_cliente;
    String nome_cliente;
    int n_conta;
    float saldo;
    int agencia;
    
    public void deposito(float valor_depositado){
        this.saldo = this.saldo + valor_depositado;
    }
    
    public void saque(float valor_sacado){
        this.saldo = this.saldo - valor_sacado;
    }
    
    public void transferência(float valor_transferido, int numero_conta_destino){
        this.saldo = this.saldo - valor_transferido;
        System.out.println("Transferência realizada com sucesso!");
    }
}