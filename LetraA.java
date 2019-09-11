package com.company;

import java.util.Scanner;

public class LetraA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe a idade: ");
        idade = sc.nextInt();
        System.out.println("Nome: " + nome + " Idade: " + idade);
}
