import java.io.IOException;

public class Calculo {
    public void calculo() throws IOException, InterruptedException {
        InterfazDelUsuario calculo = new InterfazDelUsuario();
        API api = new API();

        double resultado = api.apiConnection()*calculo.cantidad() ;

        System.out.println("Serian $" + resultado + " dolares");
    }
}
