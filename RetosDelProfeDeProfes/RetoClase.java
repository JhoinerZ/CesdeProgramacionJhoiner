import java.util.Scanner;

public class RetoClase {
    public static void main(String[] args) {
        /* Un estudiante (Driver) domina el teclado y ejecuta los comandos Git. 
        El Navigator dicta la lógica arquitectónica y vigila el cumplimiento de Clean Code 
        (nombres descriptivos, llaves obligatorias).

        Desarrollar un sistema de autenticación (Simulado). El sistema tiene una contraseña predefinida guardada en una
        variable entera constante (ej. final int PIN_SECRETO = 1234;). 
        Debe solicitar al usuario que ingrese su PIN.
        1.	Si el PIN ingresado es idéntico a la constante, muestra "Bienvenido a su cuenta bancaria".
        2.	Si el PIN es diferente, debe imprimir una alerta de "PIN Incorrecto. Por seguridad el sistema se cerrará." 
        Obligatorio: El equipo debe realizar un commit en Git con el código base antes de incluir el condicional
        , y un segundo commit (push a repositorio remoto sugerido) con la validación if-else ya implementada. */
        
        //Equipo de trabajo: Alex Correa, Jhoiner Zapata.

        Scanner sc = new Scanner(System.in);
        final int CONTRASEÑAUSUARIO = 1234;
        int contraseñaIngresada;

        System.out.println("ingrese su contraseña");
        contraseñaIngresada = sc.nextInt();

        if (contraseñaIngresada == CONTRASEÑAUSUARIO) {
            System.out.println("acceso concedido");
        }else{ 
            System.out.println("acceso denegado");
            sc.close();
        }

        
    }
}
