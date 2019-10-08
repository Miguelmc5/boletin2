package boletin2_3;

import java.util.*;
public class Boletin2_3 {

   
    public static void main(String[] args) {
        // calculador de dinero total
        
        Scanner sc=new Scanner(System.in);
        
        int billetes100;
        int billetes20;
        int billetes5;
        int monedas;
        
        System.out.println("Dime cuantas monedas de 1€ añades: ");
        monedas=sc.nextInt();
        
        System.out.println("Dime cuantos billetes de 100€ añades: ");
        billetes100=sc.nextInt();
        
        System.out.println("Dime cuantos billetes de 20€ añades: ");
        billetes20=sc.nextInt();
        
        System.out.println("Dime cuantos billetes de 5€ añades: ");
        billetes5=sc.nextInt();
        
        float dineroTotal;
        
        dineroTotal= monedas+(billetes100*100)+(billetes20*20)+(billetes5*5);
        
        System.out.println("El dinero total que tienes es: "+dineroTotal+"€");
    }
    
}