import java.time.LocalDateTime;// Datos del cliente, vehículo y  cita.
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

// Formatos fecha
private static final String PATRON_FECHA = "dd/MM/yyyy HH:mm";
        private static final DateTimeFormatter FORMATO_ESPANOL =
                DateTimeFormatter.ofPattern(PATRON_FECHA, new Locale("es", "ES"));
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
        public static void consultarCitas() {
            // No lo hace nadie. Necesitamos una colección.

        }
        public static String formatearFechaEspanol() {
            // De las fechas se encarga el alumno C
            if (fechaCita == null) {
                return "Fecha no disponible";
            }
            return fechaCita.format(FORMATO_ESPANOL);
        }
        public static void leerYValidarFecha() {
            // De las fechas se encarga el alumno C
            scanner.nextLine();
            System.out.print("Fecha y hora de la cita (" + PATRON_FECHA + "): ");
            String entrada = scanner.nextLine();

            try {
                // Intenta parsear la cadena ingresada según el patrón definido
                fechaCita = LocalDateTime.parse(entrada, FORMATO_ESPANOL);
                System.out.println(" Fecha correcta.");

            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Debe usar exactamente el formato: dd/MM/yyyy HH:mm");
                System.out.println("Se asignará la fecha y hora actual por defecto.");
                fechaCita = LocalDateTime.now();
            }
        }