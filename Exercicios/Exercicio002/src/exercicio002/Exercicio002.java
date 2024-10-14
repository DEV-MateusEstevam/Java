package exercicio002;

import java.util.Scanner;

public class Exercicio002{
    public static void main(String[] args){
        System.out.println("Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas- vindas para ela");
        Scanner teclado = new Scanner(System.in);//System.in = entrada
        
        String nome;
        System.out.print("Olá! Qual é o seu nome?");
        nome = teclado.next();
        
        System.out.println("Olá "+nome+", é um prazer te conhecer!");
    }
}