package P1HospitalRomeroJhonny;

import java.util.Scanner;

public class RegistroPacientesRomeroJhonny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("UNiverisidad de las fuerzas armadas Espe");
            System.out.println("--Pregramacion Orientas de Obejetos");
            System.out.println("Nombre.-Jhonny Joel Romero Lopez");
            System.out.println("Fecha.-10-05-20214");
            System.out.println("---------------Menu--------");
            System.out.println("0 - Salir");
            System.out.println("1 -Ragistro de pacientesS ");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
             case 0:
                System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                break;
                case 1:

                    System.out.println("Ingresar datos del paciente:");

                    // Nombre
                    String nombre;
                    do {
                        System.out.print("Nombre (solo letras): ");
                        nombre = scanner.nextLine();
                    } while (!nombre.matches("[a-zA-Z]+"));

                    // Sexo
                    char sexo;
                    do {
                        System.out.print("Sexo (M/F): ");
                        sexo = scanner.nextLine().toUpperCase().charAt(0);
                    } while (sexo != 'M' && sexo != 'F');

                    // Edad
                    int edad;
                    do {
                        System.out.print("Edad (1-100): ");
                        edad = scanner.nextInt();
                    } while (edad < 1 || edad > 100);

                    // Estado Civil
                    String estadoCivil;
                    do {
                        System.out.print("Estado Civil (soltero/casado): ");
                        estadoCivil = scanner.nextLine().toLowerCase();
                    } while (!estadoCivil.equals("soltero") && !estadoCivil.equals("casado"));

                    // Profesión
                    String profesion;
                    do {
                        System.out.print("Profesión: ");
                        profesion = scanner.nextLine();
                    } while (!profesion.matches("[a-zA-Z]+"));

                    // Dirección
                    String direccion;
                    do {
                        System.out.print("Dirección (letras y números): ");
                        direccion = scanner.nextLine();
                    } while (!direccion.matches("[a-zA-Z0-9 ]+"));

                    // Teléfono
                    String telefono;
                    do {
                        System.out.print("Teléfono (10 números): ");
                        telefono = scanner.nextLine();
                    } while (!telefono.matches("\\d{10}"));

                    // Peso
                    double peso;
                    do {
                        System.out.print("Peso (1 kg - 150 kg): ");
                        peso = scanner.nextDouble();
                    } while (peso < 1 || peso > 150);

                    // Talla
                    double talla;
                    do {
                        System.out.print("Talla (20-44): ");
                        talla = scanner.nextDouble();
                        if (talla < 20 || talla > 44) {
                            System.out.println("La talla debe estar en el rango de 20 a 44.");
                        }
                    } while (talla < 20 || talla > 44);

                    // Asegurado
                    boolean asegurado;
                    System.out.print("¿Asegurado? (true/false): ");
                    while (true) {
                        String input = scanner.next().toLowerCase();
                        if (input.equals("true") || input.equals("false")) {
                            asegurado = Boolean.parseBoolean(input);
                            break;
                        } else {
                            System.out.println("Por favor, ingresa 'true' o 'false'.");
                        }
                    }

                    // Presión Sanguínea
                    float presionSanguinea;
                    do {
                        System.out.print("Presión Sanguínea (valor numérico): ");
                        while (!scanner.hasNextFloat()) {
                            System.out.println("Por favor, ingresa un valor numérico para la presión sanguínea.");
                            scanner.next(); // Consumir el token no válido
                        }
                        presionSanguinea = scanner.nextFloat();
                        if (presionSanguinea <= 0) {
                            System.out.println("La presión sanguínea debe ser un valor positivo.");
                        }
                    } while (presionSanguinea <= 0);

                    // Número de Seguro Social
                    long numeroSeguroSocial;
                    do {
                        System.out.print("Número de Seguro Social (solo números): ");
                        numeroSeguroSocial = scanner.nextLong();
                    } while (numeroSeguroSocial <= 0);

                    // Número de Habitación
                    short numeroHabitacion;
                    do {
                        System.out.print("Número de Habitación (1-20): ");
                        numeroHabitacion = scanner.nextShort();
                    } while (numeroHabitacion < 1 || numeroHabitacion > 20);

                    // Grupo Sanguíneo
                    byte grupoSanguineo;
                    do {
                        System.out.print("Grupo Sanguíneo: ");
                        grupoSanguineo = scanner.nextByte();
                    } while (grupoSanguineo <= 0);


                    break;
                
                
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
    }
}

