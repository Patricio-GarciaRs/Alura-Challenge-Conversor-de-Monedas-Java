import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean condicion = true;
        do {
            InterfazDelUsuario inicio = new InterfazDelUsuario();
            Calculo proceso = new Calculo();

            inicio.saludo();
            proceso.calculo();
            System.out.println("¿Gustas convertir otra divisa?");
            System.out.println("""
                1 - Convertir otra divisa       2 - Salir
                """);
            Scanner respuesta = new Scanner(System.in);
            String respuestaIngresada = respuesta.nextLine();

            if (respuestaIngresada.equals("1")) {
                condicion = true;
            } else if (respuestaIngresada.equals("2")) {
                System.out.println("¡Gracias por usar el conversor de monedas!");
                condicion = false;
            }
        } while (condicion);
    }
}