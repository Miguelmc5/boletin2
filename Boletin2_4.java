package boletin2_4;

import java.util.*;
public class Boletin2_4 {

    
    public static void main(String[] args) {
        // Dar x euros y decir los billetes y monedas que hay
        
        Scanner sc=new Scanner(System.in);
        
        int dinero;
        System.out.println("Dime cuantos euros añades: ");
        dinero=sc.nextInt();
        
        int billetes100;
        int billetes20;
        int billetes5;
        int monedas;
        
        billetes100=dinero/100;
        System.out.println("Tienes : "+billetes100+" billetes de 100€" );

        billetes20=dinero%100/20;
        System.out.println("Tienes : "+billetes20+" billetes de 20€" );
        
        billetes5=dinero%100%20/5;
        System.out.println("Tienes : "+billetes5+" billetes de 5€" );
        
        monedas=dinero%100%20%5/1;
        System.out.println("Tienes : "+monedas+" monedas de 1€" );
    }
    
}