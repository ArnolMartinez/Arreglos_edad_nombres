package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int edades[]= new int[5];
        String nombres[]=new String [5];

        for (int x=0;x<4;x++){
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Ingrese un nombre: ");
            nombres[x]=entrada.nextLine();
        }
        for (int x=0;x<5;x++){
            System.out.println("----------------------------------------------------------------------------------");
            System.out.printf("Ingrese la edad de %s : ",nombres[x]);
            edades[x]=entrada.nextInt();
        }
        float media=0,c;
        for (int x=0;x<5;x++){
            media=media+edades[x];
        }
        c=media/5;
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("La media de las edades: "+c);
        System.out.println("----------------------------------------------------------------------------------");
        for (int x=0;x<5;x++){
            if (edades[x]>25){
                System.out.printf("%s tiene %d anios \n",nombres[x],edades[x]);
            }
        }
        System.out.println("----------------------------------------------------------------------------------");
        for (int x=0;x<5;x++){
            if (edades[x]<10){
                System.out.printf("%s tiene %d anios \n",nombres[x],edades[x]);
            }
        }
        System.out.println("----------------------------------------------------------------------------------");

    }
}
