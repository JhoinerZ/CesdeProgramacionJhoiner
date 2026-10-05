import java.util.Scanner;

public class CalculadoraDeCompra {
    public static void main(String[] args) {

        //---------------------------------------------
        Scanner sc= new Scanner(System.in);
        
        String nombre_producto;
        double precio_producto, valor_compra;
        int cantidad_unidades;

        //---------------------------------------------
        
        System.out.println("Cual es el nombre del producto");
        nombre_producto = sc.nextLine();
        
        System.out.println("Cual es el precio del producto");
        precio_producto = sc.nextDouble();
        
        System.out.println("Cual es la cantidad del producto");
        cantidad_unidades = sc.nextInt();

        valor_compra = precio_producto * cantidad_unidades;

        //---------------------------------------------

        System.out.println("Producto: " + nombre_producto);
        System.out.println("El valor de la compra es: " + valor_compra);
        
        sc.close();
    }
}
