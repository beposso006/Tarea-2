/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareametodosystring;

import java.util.Scanner;

/**
 *
 * @author 29164
 */
public class TareaMetodosyString {

    Scanner Leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("--Menu bonito(●'◡'●)--");
            System.out.println("1. Replace");
            System.out.println("2. Factorial");
            System.out.println("3. Mensajes");
            System.out.println("4. Promedios");
            System.out.println("5. Aprobado o reprobado");
            System.out.println("6. Contains");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opcion: ");
            int opcion = Leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("--Bienvenido al replace--");
                    System.out.print("Ingrese una cadena: ");
                    String cadena = Leer.nextLine();
                    String cadena1 = Leer.nextLine();
                    System.out.print("Ingrese la letra que quiere remplazar: ");
                    char letraArem = Leer.nextLine().charAt(0);
                    System.out.print("Ingrese la letra por la cual se va a reemplazar: ");
                    char nuevoCarac = Leer.nextLine().charAt(0);

                    String resultado = miMetodoreplace(cadena1, letraArem, nuevoCarac);
                    System.out.println("La cadena original es: " + cadena1);
                    System.out.println("La cadena modificada es: " + resultado);
                    System.out.println("La " + letraArem + " se cambio por " + nuevoCarac);
                    break;

                case 2:
                    System.out.println("--Bienvenido a Factorial--");
                    System.out.print("Ingrese un numero: ");
                    int n = Leer.nextInt();
                    int result = Factorial(n);
                    System.out.println("El factorial de " + n + " es: " + result);
                    break;

                case 3:
                    System.out.println("--Bienvenido a Mensaje--");
                    System.out.println("Este metodo no debe retornar nada :)");
                    break;

                case 4:
                    System.out.println("--Bienvenido a Promedio--");
                    double promedio = Notas();
                    System.out.println("El promedio de las 4 notas es: " + promedio);
                    break;

                case 5:
                    System.out.println("--Bienvenido a Aprovado o Reprobado--");
                    System.out.print("Ingrese una nota: ");
                    int notafinal = Leer.nextInt();
                    boolean aprobado = AproboOno(notafinal);
                    if (aprobado) {
                        System.out.println("El alumno aprobo （。＾▽＾）");
                    } else {
                        System.out.println("El alumno reprobo (っ °Д °;)っ");
                    }
                    break;

                case 6:
                    System.out.println("--Bienvenido a Contains--");
                    System.out.print("Ingrese una cadena principal: ");
                    String cadenaPrincipal = Leer.nextLine();
                    String cadenaPrincipal1 = Leer.nextLine();
                    System.out.print("Ingrese la subcadena a buscar: ");
                    String subcadena = Leer.nextLine();
                    boolean respuesta = miPropioContains(cadenaPrincipal1, subcadena);
                    if (respuesta) {
                        System.out.println("La cadena principal contiene la subcadena");
                    } else {
                        System.out.println("La cadena no contiene la subcadena");
                    }
                    break;

                case 7:
                default:
                    running = false;
                    System.out.println("Byee (´▽`ʃ♡ƪ)");
                    System.out.println("Trabaje sin pareja");
                    break;
            }
        }
    }

    public static String miMetodoreplace(String cadena, char letraArem, char nuevoCarac) {
        String result = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letraArem) {
                result += nuevoCarac;
            } else {
                result += cadena.charAt(i);
            }
        }
        return result;
    }

    public static int Factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void Vacio(String texto) {
        System.out.println(texto);
    }

    public static double Notas() {
        Scanner balerion = new Scanner(System.in);
        double suma = 0;
        System.out.print("Ingrese la primera nota: ");
        double nota1 = balerion.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        double nota2 = balerion.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        double nota3 = balerion.nextDouble();
        System.out.print("Ingrese la cuarta nota: ");
        double nota4 = balerion.nextDouble();
        suma = nota1 + nota2 + nota3 + nota4;
        double promedio = suma / 4;
        return promedio;
    }

    public static boolean AproboOno(int nota) {
        if (nota >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean miPropioContains(String cadenaPrincipal, String subcadena) {
        int contiene = cadenaPrincipal.indexOf(subcadena);
        if (contiene >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
