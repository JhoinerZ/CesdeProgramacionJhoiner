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
         int contador_productos_basicos = 0;
         int contador_productos_medios = 0;
         int contador_productos_premium = 0;
         double porcentaje_productos_premium = 0;
         int productos_totales = 0;
         double DESCUENTO = 0.10;
         double IVA = 0.19;
         double VALORPARADESCUENTO = 100000;
         double opcion = 0;
         double valor_descuento = 0;
         double valor_descuentoiva = 0;
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
               contador_productos_basicos = contador_productos_basicos + 1;
            }else if (opcion == 2) {
               importe_bruto = importe_bruto + PRODUCTOMEDIO;
               contador_productos_medios = contador_productos_medios + 1;
            }else if (opcion == 3){
               importe_bruto = importe_bruto + PRODUCTOPREMIUM;
               contador_productos_premium = contador_productos_premium +1;
            }

         } while (opcion != 4);
         //System.out.println(importe_bruto);
         if (importe_bruto > VALORPARADESCUENTO) {
             valor_descuento = importe_bruto * DESCUENTO;
             importe_neto  = importe_bruto - valor_descuento;
         }
         //System.out.println(importe_neto);
         valor_descuentoiva = importe_neto * IVA;
         importe_neto = importe_neto + valor_descuentoiva;
         //System.out.println(importe_neto);
         System.out.println("------------------------");
         System.out.println("Factura");
         System.out.println("El valor bruto es: " + importe_bruto);
         System.out.println("El valor del descuento es: " + valor_descuento);
         System.out.println("El valor del iva es: " + valor_descuentoiva);
         System.out.println("El valor con iva es: " + importe_neto);
         System.out.println("------------------------");

         productos_totales = contador_productos_basicos + contador_productos_medios + contador_productos_premium;

         System.out.println("la cantidad de productos ingresados es: " + productos_totales);

         porcentaje_productos_premium = contador_productos_premium * (100 / productos_totales);

         System.out.println("El porcentaje de productos premiun ingresados en su factura es del: " + "% " + porcentaje_productos_premium);

         sc.close();
      }
}