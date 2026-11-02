<<<<<<< HEAD
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
=======
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
>>>>>>> 5363ab0c3845dabea4b48fd992e0f00ce338968c
