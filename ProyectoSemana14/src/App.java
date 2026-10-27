import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double cop = 0;
        final double VALORDOLAR = 0.0003175;
        final double VALOREURO = 0.0002817;

        do {
            System.out.println("Bienvenido al sistema de conversión");
            System.out.println("1. Convertir de COP a USD");
            System.out.println("2. Convertir de COP a EUR");
            System.out.println("3. salir");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                    switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el valor en COP a convertir");
                        if (sc.hasNextDouble()) {
                            cop = sc.nextDouble();
                            if (cop > 0) {
                                System.out.println("La cantidad en dolares es: " + ConversionAUSD(cop, VALORDOLAR));
                                break;
                            } else {
                                System.out.println("Debes ingresar un numero mayor que 0, intentalo de nuevo");
                                break;
                            }
                        } else {
                            sc.next();
                            System.out.println("Debes ingresar una opción valida, intentalo de nuevo");
                            break;
                        }

                    case 2:
                        System.out.println("Ingrese el valor en COP a convertir");
                        if (sc.hasNextDouble()) {
                            cop = sc.nextDouble();
                            if (cop > 0) {
                                System.out.println("La cantidad en euros es: " + ConversionAEUR(cop, VALOREURO));
                                break;
                            } else {
                                System.out.println("Debes ingresar un numero mayor que 0, intentalo de nuevo");
                                break;
                            }
                        } else {
                            sc.next();
                            System.out.println("Debes ingresar una opción valida, intentalo de nuevo");
                            break;
                        }
                    case 3:
                        System.out.println("Muchas gracias por usar el sistema");
                        break;
                    default:
                        System.out.println("Ingrese una opción valida");
                        break;
                }
            }else{
                sc.next();
                opcion = 0;
                System.out.println("Debes ingresar una opción valida");
            }

        } while (opcion != 3 );

        sc.close();
    }

    public static double ConversionAUSD( double pesos, double valor_dolar){
        return pesos * valor_dolar;
    }

    public static double ConversionAEUR(double pesos, double valor_euro){
        return pesos * valor_euro;
    }
}
