import java.util.Scanner;

public class VerificadorDeEdad {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        }
        else{
            System.out.println("No eres mayor de edad");
        }

        sc.close();
    }
}