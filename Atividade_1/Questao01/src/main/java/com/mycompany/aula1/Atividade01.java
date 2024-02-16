/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author shayr
 */

public class Atividade01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as cores do resistor (máximo 3 cores, separe por espaço): ");
        String entrada = scanner.nextLine();
        
        String[] cores = entrada.split(" ");
        
        int valorResistor = calcularValorResistor(cores);
        System.out.println("\nValor do resistor: " + valorResistor);
        
        scanner.close();
    }
    
    public static int calcularValorResistor(String... cores) {
        HashMap<String, Integer> mapaCores = new HashMap<>();
        mapaCores.put("preto", 0);
        mapaCores.put("marrom", 1);
        mapaCores.put("vermelho", 2);
        mapaCores.put("laranja", 3);
        mapaCores.put("amarelo", 4);
        mapaCores.put("verde", 5);
        mapaCores.put("azul", 6);
        mapaCores.put("violeta", 7);
        mapaCores.put("cinza", 8);
        mapaCores.put("branco", 9);
        
        int valorResistor = 0;
        for (int i = 0; i < Math.min(2, cores.length); i++) {
            valorResistor = valorResistor * 10 + mapaCores.getOrDefault(cores[i], 0);
        }
        return valorResistor;
    }
}
