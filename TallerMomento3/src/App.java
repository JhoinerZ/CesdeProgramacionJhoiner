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
        int opcion = 0;
        String marca_a_buscar;
        String marca_a_agregar;

        String[] marcas = new String[5];
        marcas[0] = "Naf Naf";
        marcas[1] = "Americanino";
        marcas[2] = "Esprit";

        do {
            System.out.println("Bienvenido al canal de Venta Directa / Kliiker del Grupo Uribe");
            System.out.println("1. Ver marcas");
            System.out.println("2. Validar disponibilidad de marca");
            System.out.println("3. Registrar marca");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ImprimirMarcas(marcas);
                    break;
                
                case 2:
                    System.out.println("Ingrese la marca a buscar");
                    sc.nextLine();
                    marca_a_buscar = sc.nextLine();
                    BuscarMarca(marcas, marca_a_buscar);
                    break;

                case 3:
                    System.out.println("Ingrese la marca a registrar");
                    sc.nextLine();
                    marca_a_agregar = sc.nextLine();
                    AgregarMarca(marcas, marca_a_agregar);
                    break;

                case 4:
                    
                    System.out.println("Muchas gracias por usar el sistema");
                    break;
           
                default:
                    break;
            }

        } while (opcion != 4);

        sc.close();
   
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
        
        Boolean marca_disponible_para_agregar = false;

        for (int i = 0; i < arreglo_marcas.length; i++) {


            if (arreglo_marcas[i] == null) {
                marca_disponible_para_agregar = true;
                arreglo_marcas[i] = marca_agregar;
                break;
            }

        }

        if (marca_disponible_para_agregar == true){
            System.out.println("Marca agregada exitosamente");
        } else {
            System.out.println("No hay espacio para agregar una marca");
        }
    }
}
