/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade05;

/**
 *
 * @author shayr
 */

public class Questao05 {
    
    public static void main(String[] args) {
        String dna1 = "AGTCTGCA";
        String dna2 = "AGTCTCCA";
        
        int distancia = calcularDistanciaHamming(dna1, dna2);
        System.out.println("Distância de Hamming entre as cadeias de DNA: " + distancia);
    }
    
    public static int calcularDistanciaHamming(String dna1, String dna2) {
        if (dna1.length() != dna2.length()) {
            throw new IllegalArgumentException("As cadeias de DNA devem ter o mesmo comprimento.");
        }
        
        int distancia = 0;
        for (int i = 0; i < dna1.length(); i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                distancia++;
            }
        }
        return distancia;
    }
}