import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Como embajador del canal de Venta Directa / Kliiker en el Grupo Uribe,
         * necesito un sistema de consola rápido para revisar qué marcas del portafolio
         * tengo disponibles para recomendar en mi catálogo digital y poder agregar una
         * nueva marca asociada enviada por la compañía.
         */    
        
        /*
        * Requiero un programa en Java que maneje un único arreglo de texto de 5
        * posiciones cargado con 3 marcas iniciales (ej. {"Naf Naf", "Americanino",
        * "Esprit", null, null}). La aplicación usará un menú interactivo con ciclo xxx
        * y una estructura para detectar la selección del menú y gestionar las
        * siguientes tareas:
        */

        Scanner sc = new Scanner(System.in);

        String[] marcas = new String[5];
        marcas[0] = "Naf Naf";
        marcas[1] = "Americanino";
        marcas[2] = "Esprit";

        
   
    }

    public static void ImprimirMarcas(String[] numero_marcas){
        for (int i = 0; i < numero_marcas.length; i++) {
            System.out.println(numero_marcas[i]);
        }
    }

    public static void BuscarMarca(String[] arreglo_marcas, String marca_buscada){
        
        boolean disponibilidad = false;
        
        for (int i = 0; i < arreglo_marcas.length; i++) {

            if (marca_buscada.equals(arreglo_marcas[i])) {
                disponibilidad = true;
            }
        }

        if (disponibilidad == true) {
            System.out.println("La marca esta disponible");
        }else{
            System.out.println("La marca no esta disponible");
        }
    }

    public static void AgregarMarca(String[] arreglo_marcas, String marca_agregar){

        for (int i = 0; i < arreglo_marcas.length; i++) {

            if (arreglo_marcas[i] == null) {

                arreglo_marcas[i] = marca_agregar;
                break;
            }else{
                System.out.println("No hay espacio para agregar la marca que ingresaste");
            }
            
        }
    }
}
