/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade03;
import java.util.Scanner;

/**
 *
 * @author shayr
 */

public class Questao03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeNumeros = 0;
        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;
        int somaNumeros = 0;
        
        System.out.println("Digite os números inteiros (digite -1 para encerrar):");
        
        while (true) {
            int numero = scanner.nextInt();
            
            if (numero == -1) {
                break;
            }
            
            quantidadeNumeros++;
            somaNumeros += numero;
            
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        
        scanner.close();
        
        if (quantidadeNumeros == 0) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            double media = (double) somaNumeros / quantidadeNumeros;
            
            System.out.println("Quantidade de números digitados: " + quantidadeNumeros);
            System.out.println("Maior número digitado: " + maiorNumero);
            System.out.println("Menor número digitado: " + menorNumero);
            System.out.println("Média dos números digitados: " + media);
        }
    }
}