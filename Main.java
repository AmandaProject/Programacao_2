package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ladoa, ladob, ladoc;
        System.out.println("Informe o lado a do triangulo: ");
        ladoa = sc.nextLine();
        System.out.println("Informe lado b do triangulo: ");
        ladob = sc.nextLine();
        System.out.println("Informe o lado c do triangulo: ");
        ladoc = sc.nextLine();
        if ((ladoa==ladob) && (ladoa==ladoc) && (ladob==ladoc)){
            System.out.println("O triangulo é equilatero");
        }
        else{
            if ((ladoa==ladob) && (ladob!=ladoc)){
                System.out.println("O triangulo é isosceles");
            }
            else{
                if ((ladoa!=ladob) && (ladoa!=ladoc) && (ladob!=ladoc)){
                    System.out.println("O triangulo é escaleno");
                }
            }
        }
    }
}
