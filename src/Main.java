import java.util.Scanner;

// Entrada de datos.
private static Scanner scanner = new Scanner(System.in);

        void main() {

            // Mostrar menú y ejecutar la función adecuada.
            boolean salir = false;

            while (!salir) {
                System.out.println("\n--- GESTIÓN DE CITAS TALLER ---");
                System.out.println("1. Registrar nueva cita");
                System.out.println("2. Consultar citas por fecha");
                System.out.println("3. Calcular coste de servicio");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();
                if (opcion == 4) {
                    salir = true;
                    System.out.println("Saliendo del programa...");
                }
                // Switch para realizar la operación adecuada en función de la opción elegida.
                // Cada desarrollador codifica lo suyo.
                // Se puede añadir un bucle hasta que la opción sea correcta.
                switch (opcion) {
                    case 1:
                        //*registrarCita();
                        break;
                    case 2:
                        //*consultarCitas();
                        break;
                    case 3:
                        //*calcularCosteServicio();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }
        }