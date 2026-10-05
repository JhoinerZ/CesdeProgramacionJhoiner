import java.util.Scanner;

public class SegundaClaseJ {
    public static void main(String[] args) {
        
        //Ejemplo 1:

/*      boolean tienePermiso = true;
        int nivelAcceso = 5;

        System.out.println((nivelAcceso == 5) && (tienePermiso == true)); */


        //Ejemplo de condicional simple:
        /* int i = 4;

        if (i == 5) {
            System.out.println("Es correcto");
        }else{
            System.out.println("No es correcto");
        } */

        //Ejemplo de condicional mas avanzado:
        Scanner montoSolicitado = new Scanner(System.in);
        double saldo=100, montoRetiro;

        System.out.println("Cuanto vas a retirar");
        montoRetiro = montoSolicitado.nextDouble();

        if (saldo >= montoRetiro) {
            saldo = saldo - montoRetiro;
            System.out.println("Retiro exitoso");            
        }else{
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Gracias por usar el cajero");
        montoSolicitado.close();
    }
}