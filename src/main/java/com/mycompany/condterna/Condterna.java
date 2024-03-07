package com.mycompany.condterna;

import java.util.Scanner;

public class Condterna {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double preco;
        
        System.out.println("digite o valor a ser depositado para saber qual será seu desconto");
        preco = teclado.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
        System.out.printf("seu desconto é %f  ",desconto);
        
        /*
        if(preco < 20.0){
            desconto = preco * 0.1;
        }else{
            desconto = preco * 0.5;
        } 
        System.out.println(desconto);
         */

    }
}
