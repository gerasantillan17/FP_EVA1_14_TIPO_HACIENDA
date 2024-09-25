/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("CAPTURA EL TIPO DE PERSONA F:FISICA, M:MORAL");
        tipo = captu.nextLine().charAt(0);
        System.out.println("El caracter es "+ tipo);
        if(tipo == 'F')
            System.out.println("Persona Fisica");
        else
            System.out.println("Persona Moral");
                    
    }
    
}
