package TallerMomento2;

import java.util.Scanner;

public class ModuloVentasIterativo {
   public static void main(String[] args) {
         /* el estudiante debe construir un programa en Java que utilice un ciclo para mantener la caja abierta. 
         Dentro del ciclo, se debe desplegar un menú, usando if, else if con 3 productos predefinidos del
         catálogo(básico, medio, premiun) y una opción para "Finalizar compra".*/

         Scanner sc= new Scanner(System.in);

         double PRODUCTOBASICO = 10000;
         double PRODUCTOMEDIO = 30000;
         double PRODUCTOPREMIUM = 50000;
         double DESCUENTO = 0.10;
         double IVA = 0.19;
         double opcion = 0;
         double importe_bruto = 0;
         double importe_neto = 0;

         do {
            System.out.println("1. Agregar producto basico");
            System.out.println("2. Agregar producto medio");
            System.out.println("3. Agregar producto premium");
            System.out.println("4. finalizar compra");
            System.out.println("Ingresa la opción");
            opcion = sc.nextInt();

            if (opcion == 1) {
               importe_bruto = importe_bruto + PRODUCTOBASICO;
            }else if (opcion == 2) {
               importe_bruto = importe_bruto + PRODUCTOMEDIO;
            }else if (opcion == 3){
               importe_bruto = importe_bruto + PRODUCTOPREMIUM;
            }

         } while (opcion != 4);
         System.out.println(importe_bruto);
         
      }
}