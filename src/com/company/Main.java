package com.company;
import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

       int n;

       do{
           System.out.println("Ingresa un numero positivo");
           n = input.nextInt();
       }while(n<0);

        System.out.println("Excelente !!, Tu numero Es "+n);
    }
}
