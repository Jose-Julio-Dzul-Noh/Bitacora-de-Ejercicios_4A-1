package bitacora_ejercicios;
/**
 * @author Dzul Noh Jose Julio - 19070047 
 * Llanes Barrera Luis Angel - 19070023
 * Poot Pool Riger Emmanuel - 19070067 
 * Semestre: Cuarto   Grupo: A
 */
import java.util.Scanner;
public class Bitacora_Ejercicios {
    public static double discriminante;
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int opc;
        do {
            System.out.println("---------------------------------");
            System.out.println("|              MENU             |");
            System.out.println("| 1.- Euler                     |");
            System.out.println("| 2.- Ecuacion Cuadratica       |");
            System.out.println("---------------------------------");
            System.out.print("Seleccione Una Opcion: ");
            opc = xd.nextInt();
            System.out.println("\n************************************\n");
            switch (opc) {
                case 1:
                    double Euler = 0;
                    System.out.print("Ingrese el valor de x: ");
                    int x = xd.nextInt();
                    System.out.print("Ingrese el valor de n: ");
                    int n = xd.nextInt();
                    for (int j = 0; j <= n; j++) {
                        Euler += (Math.pow(x, j) / Factorial(j));
                    }
                    System.out.println("");
                    System.out.println("El resultado de euler elevado a " + x + " es: " + Euler);
                    System.out.println("El resultado de euler elevado a -" + x + " es: " + (1 / Euler));
                    break;
                    
                case 2:
                    System.out.print("Ingrese el valor de a: ");
                    int a = xd.nextInt();
                    System.out.print("Ingrese el valor de b: ");
                    int b = xd.nextInt();
                    System.out.print("Ingrese el valor de c: ");
                    int c = xd.nextInt();
                    discriminante = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
                    ecuacion1(a, b, c);
                    ecuacion2(a, b, c);
                    break;
                    
                default:
                    System.out.println("Opcion Invalida");
                    break;
                    
            }
            System.out.println("\n************************************\n");
            System.out.println("Desea Volver Al Menu");
            System.out.println("1: SI    Otro N°: NO");
            System.out.print("R: ");
            opc = xd.nextInt();
            System.out.println("\n************************************\n");
        } while (opc == 1);
    }
    
    public static double Factorial(int n) {
        double cont = 1;
        for (int i = 1; i <= n; i++) {
            cont *= i;
        }
        return cont;
    }
    
    public static void ecuacion1(int a, int b, int c) {
        double x1 = 0, x2 = 0;
        if (discriminante > 0) {
            x1 = (-b + discriminante) / (2 * a);
            x2 = (-b - discriminante) / (2 * a);
        } else if (discriminante == 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = x1;
        }
        System.out.println("\nPrimer Metodo de Solucion:");
        impresion(x1, x2);
    }
    
    public static void ecuacion2(int a, int b, int c) {
        double x1 = 0, x2 = 0;
        if (discriminante > 0) {
            x1 = (-2 * c) / (b + discriminante);
            x2 = (-2 * c) / (b - discriminante);
        } else if (discriminante == 0) {
            x1 = (-2 * c) / (b + discriminante);
            x2 = x1;
        }
        System.out.println("\nSegundo Metodo de Solucion:");
        impresion(x1, x2);
    }
    
    public static void impresion(double x1, double x2) {
        if (discriminante >= 0) {
            System.out.println("El resultado de x1 es " + x1);
            System.out.println("El resultado de x2 es " + x2);
        } else {
            System.out.println("No tiene ninguna solucion");
        }
    }
}
