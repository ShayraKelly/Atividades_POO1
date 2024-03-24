/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shayr
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade03{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList();
        int x = 0;

        while (x != 6) {
            System.out.println("------------------ M E N U ------------------\n");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depósito");
            System.out.println("4 - Transferir");
            System.out.println("5 - Saldo");
            System.out.println("6 - Sair\n");
            System.out.println("Digite o número da ação que quer realizar: ");
            x = scan.nextInt();
            scan.nextLine();

            if (x == 1) {
                    System.out.print("\n\n------------------ C A D A S T R O ------------------\n");
                    System.out.print("------------------ Informações pessoais ------------------\n");
                    System.out.println("\nDigite o nome do titular: ");
                    String nome = scan.nextLine();
                    System.out.println("\nDigite o CPF do titular: ");
                    String cpf = scan.nextLine();
                    System.out.print("\n\n------------------ Informações bancárias ------------------\n");
                    System.out.println("\nDigite o número da conta: ");
                    String numero = scan.nextLine();
                    System.out.println("\nDigite o banco: ");
                    int banco = scan.nextInt();
                    Pessoa pessoa = new Pessoa(nome, cpf);
                    Conta conta = new Conta(pessoa, numero, banco);
                    contas.add(conta);

                    System.out.println(contas);
            }
            else if(x == 2){
                System.out.print("\n\n------------------ S A Q U E ------------------\n");
                System.out.println("Digite o número da conta: ");
                String numero = scan.nextLine();
                Conta validacao = validaConta(contas, numero);
                if (validacao != null) {
                    System.out.println("\nDigite o valor a ser sacado: ");
                    double saque = scan.nextDouble();
                    if (validacao.sacar(saque)) {
                        System.out.println("\nSaque realizado com sucesso!\n");
                    } else {
                        System.out.println("\nSaque não realizado!\n");
                    }
                } else {
                    System.out.println("\nConta não encontrada!\n");
                }
            }
            else if(x == 3){
                System.out.print("\n\n------------------ D E P Ó S I T O ------------------\n");
                System.out.println("Digite o número da conta: ");
                String numero = scan.nextLine();
                Conta validacao = validaConta(contas, numero);
                if (validacao != null) {
                    System.out.println("\nDigite o valor a ser depositado: ");
                    double deposito = scan.nextDouble();
                    if (validacao.depositar(deposito)) {
                        System.out.println("\nDepósito realizado com sucesso!\n");
                    } else {
                        System.out.println("\nDepósito não realizado!\n");
                    }
                } else {
                    System.out.println("\nConta não encontrada!\n");
                }
            }
            else if(x == 4){
                System.out.print("\n\n------------------ T R A N S F E R Ê N C I A ------------------\n");
                System.out.println("Digite o número da conta que vai transferir: ");
                String numero = scan.nextLine();
                Conta validacao = validaConta(contas, numero);
                
                if (validacao != null) {
                    System.out.println("Digite o número da conta que vai receber a transferência: ");
                    String numeroTransferencia = scan.nextLine();
                    Conta validaTransferencia = validaConta(contas, numeroTransferencia);
                    if (validaTransferencia != null) {
                        System.out.println("\nDigite o valor a ser transferido: ");
                        double transferencia = scan.nextDouble();
                        if (validacao.transferir(transferencia, validaTransferencia)) {
                            System.out.println("\nTransferência realizada com sucesso!\n");
                        } else {
                            System.out.println("\nTransferência não realizada!\n");
                        }
                    } else {
                        System.out.println("\nConta de destino não encontrada!\n");
                    }
                } else {
                    System.out.println("\nConta não encontrada!\n");
                }
            }
            else if (x == 5){
                System.out.print("\n\n------------------ S A L D O ------------------\n");
                System.out.println("Digite o numero da conta: ");
                String numero = scan.nextLine();
                Conta verificacao = validaConta(contas, numero);
                if(verificacao != null){
                    System.out.println("\nTitular " + verificacao.getTitular().getNome());
                    System.out.println("Conta " + verificacao.getNumero());
                    System.out.println("Saldo " + verificacao.getSaldo() + "\n");
                }else{
                    System.out.println("\nConta nao encontrada\n");
                }
                
            }
        }
    }

    public static Conta validaConta(ArrayList<Conta> contas, String numero){
        for(int i = 0; i < contas.size(); i++){
            Conta validacao = contas.get(i);
            if(validacao.getNumero().equals(numero)){
                return validacao;
            }
        }
        return null;
    }
}
