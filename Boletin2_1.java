package boletin2_1;
import java.util.*;
public class Boletin2_1 {

    
    public static void main(String[] args) {
        // porcentaje descontado
   
        float precioInicial, precioFinal;
        
        
        Scanner lectura= new Scanner(System.in);
        Scanner lectura2= new Scanner(System.in);
    
    System.out.println("Precio inicial del producto: ");
    precioInicial=lectura.nextInt();
   System.out.println("Precio final del producto: ");
    precioFinal=lectura2.nextInt();
    
    float porcentajeDescontado;
    porcentajeDescontado=(precioFinal*100)/precioInicial;
     
     System.out.println("El porcentaje descontado es del: " +porcentajeDescontado+"%");
     
     
     
     
    }
    
}
