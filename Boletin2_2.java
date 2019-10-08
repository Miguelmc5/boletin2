package boletin2_2;

import java.util.*;
public class Boletin2_2 {

    
    public static void main(String[] args) {
        // Conversor de temperatura
    
    Scanner sc=new Scanner(System.in);

    float gradosCentigrado;

    System.out.println("Dime que temperatura hace en grados centígrados: ");
    gradosCentigrado=sc.nextInt();
    
    float gradosFahrenheit;    
    float gradosKelvin;
    
    gradosFahrenheit=gradosCentigrado*1.8000f+32.00f;
     System.out.println(+gradosCentigrado+"ºC Son: " +gradosFahrenheit+"ºF");
    
    gradosKelvin=gradosCentigrado+273.15f;
     System.out.println(+gradosCentigrado+"ºC Son: " +gradosKelvin+"K");
    }
        
}
