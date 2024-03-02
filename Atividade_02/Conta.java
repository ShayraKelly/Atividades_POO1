/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conta;
import java.util.Scanner;

/**
 *
 * @author shayr
 */

public class Conta {
    public static void main(String[] args) {
        Scanner funcao = new Scanner(System.in);
        int x = 0;
        Conta_corrente conta1 = new Conta_corrente();
        conta1.nome_cliente = "Josivalda Martins";
        conta1.cpf_cliente = "000.111.222-33";
        conta1.agencia = 001;
        conta1.n_conta = 01234;
        conta1.saldo = 175;
        
        Conta_corrente conta2 = new Conta_corrente();
        conta2.nome_cliente = "Maurice Martins";
        conta2.cpf_cliente = "333.222.111-00";
        conta2.agencia = 001;
        conta2.n_conta = 43210;
        conta2.saldo = 50;
        
        while(x != -1){
            System.out.println("\nDigite 1 para Depositar na sua conta\n"
                + "Digite 2 para Sacar um valor da sua conta\n"
                + "Digite 3 para transferir valor da sua conta para outra\n"
                + "Digite -1 para finalizar\n\n"
                + "Selecione a ação que deseja realizar: ");
            x = funcao.nextInt();
         
            if(x == 1){
                System.out.println("Valor que deseja depositar em sua conta: ");
                float valor_depositado = funcao.nextFloat();
                conta1.deposito(valor_depositado);
            } else if(x == 2){
                System.out.println("\nValor que deseja retirar de sua conta: ");
                float valor_sacado = funcao.nextFloat();
                conta1.saque(valor_sacado);
            } else if(x == 3){
                System.out.println("\nNúmero da conta que deseja transferir: ");
                int escolha = funcao.nextInt();
                System.out.println("\nValor que deseja transferir: ");
                float valor_transferido = funcao.nextFloat();
                System.out.println("\nDigite 'transferir' para transferir ou 'transferido' para receber: ");
                String tipo_transferencia = funcao.next();
                if (tipo_transferencia.equals("transferir")) {
                    conta1.transferência(valor_transferido, escolha);
                } else if (tipo_transferencia.equals("transferido")) {
                    conta2.transferência(valor_transferido, conta1.n_conta);
                } else {
                    System.out.println("Opção inválida.");
                }
            }
        }
    }
}
