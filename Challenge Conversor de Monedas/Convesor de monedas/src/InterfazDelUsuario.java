import java.util.Scanner;

public class InterfazDelUsuario {
    public void saludo(){
        System.out.println("Hola, bienvenido al Conversor de Monedas.");
        System.out.println("Selecciona el tipo de cambio que deseas realizar:");
        System.out.println(
            """
            ------------------------------------------
            1 - Peso mexicano =================> Dolar          7 - Colón costarricense ===========> Dolar
            2 - Peso argentino ================> Dolar          8 - Peso cubano ===================> Dolar
            3 - Boliviano boliviano ===========> Dolar          9 - Sol peruano ===================> Dolar
            4 - Real brasileño ================> Dolar         10 - Cordoba nicaragüense ==========> Dolar
            5 - Peso chileno ==================> Dolar
            6 - Peso colombiano ===============> Dolar
            ------------------------------------------
            """
        );
    }

    public String direccion(){
        Scanner opcion = new Scanner(System.in);
        String opcionIngresada = opcion.nextLine();
        String url = "";

        switch (opcionIngresada) {
            case "1":
                System.out.println("¿Cuántos Pesos mexicanos quieres convertir en Dolares?");
                url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/MXN/USD";
                break;
            case "2":
                System.out.println("¿Cuántos Pesos argentinos quieres convertir en Dolares?");
                url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/ARS/USD";
                break;
            case "3":
                System.out.println("¿Cuántos Bolivares quieres convertir en Dolares?");
                url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/BOB/USD";
                break;
            case "4":
                System.out.println("¿Cuántos Reales brasileños quieres convertir en Dolares?");
                url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/BRL/USD";
                break;
            case "5":
                System.out.println("¿Cuántos Pesos chilenos quieres convertir en Dolares?");
                url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/CLP/USD";
                break;
            case "6":
                System.out.println("¿Cuántos Pesos colombianos quieres convertir en Dolares?");
                url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/COP/USD";
                break;
            case "7":
                System.out.println("¿Cuántos Cólones quieres convertir en Dolares?");
                url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/CRC/USD";
                break;
            case "8":
                System.out.println("¿Cuántos Pesos cubanos quieres convertir en Dolares?");
                url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/CUP/USD";
                break;
            case "9":
                System.out.println("¿Cuántos Soles quieres convertir en Dolares?");
                url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/PEN/USD";
                break;
            case "10":
                System.out.println("¿Cuántas Córdobas quieres convertir en Dolares?");
                url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/COP/NIO";
                break;
            default:
                System.out.println("Opcion no valida");
        }

        return url;
    }
    public int cantidad() {
        Scanner cantidad = new Scanner(System.in);
        int cantidadIngresada= cantidad.nextInt();

        return cantidadIngresada;
    }
}

