public class App{
    public static void main(String[] args) {
        /*Hola */
        System.out.println("Hello, World!");
        //Realizar un programa que determine si puede o no entrar a un bar.
/*         String nombre ="santiago";
        int edad = 18;
        boolean puedeEntrar;

        puedeEntrar = edad >= 18;

        System.out.println(nombre + " puede entrar "+ puedeEntrar); */

        //Hacer un algoritmo que nos permita solucionar la entrega de la semana pasada
    
        //---------------DEFINIR-------------//

        double PRECIOUNITARIO = 1000;
        double PESOOKG = 15;
        int UNIDADESPRODUCTO = 60;
        double SALDODISPONIBLE = 100000;
        boolean esPedidoViable;

        //--------------PROCESO-------------//

        esPedidoViable =(UNIDADESPRODUCTO > 50) && ((PRECIOUNITARIO * UNIDADESPRODUCTO) <= SALDODISPONIBLE) && (PESOOKG * UNIDADESPRODUCTO <= 750);

        //--------------SALIDA--------------//

        System.out.println("El pedido es viable: " + esPedidoViable);

        //-----------------------------------//

    }
}