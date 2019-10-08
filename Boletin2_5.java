package boletin2_5;

import java.util.*;
public class Boletin2_5 {

   
    public static void main(String[] args) {
        // calcular sueldo bruto y líquido
        
        Scanner sc=new Scanner(System.in);
        
        float sueldo;
        System.out.println("Dime el sueldo que recibes: ");
        sueldo=sc.nextInt();
        
        float sueldoBruto;
        float sueldoLiquido;
        float desplazamiento;
        float dietas;
        float comision;
        
        System.out.println("Dime los quilometros diarios que haces: ");
        desplazamiento=sc.nextInt();
        
        System.out.println("Dime cuantos días trabajas: ");
        dietas=sc.nextInt();
        
        System.out.println("Dime el importe total de tus ventas: ");
        comision=sc.nextInt();
        
        sueldoBruto=sueldo+(dietas*30)+(desplazamiento*2)+((comision*5)/100);
        System.out.println("El sueldo bruto es de: "+sueldoBruto+"€");
        
        sueldoLiquido=sueldoBruto-(sueldoBruto*18/100)-36;
        System.out.println("El sueldo líquido es de: "+sueldoLiquido+"€");
        
        
    }
    
}

