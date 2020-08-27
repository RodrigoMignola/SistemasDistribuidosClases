package excercise1;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String Input = "";
        System.out.println("Ingrese s para salir");
        SystemCommunication SystemC = new SystemCommunication();
        while (!Input.equals("s"))
        {
            System.out.println("Ingrese un mensaje o '1' para recibir un mensaje");
            Input = scan.nextLine();
            if (Input.equals("1")) {
                System.out.println("Esperando recibir el mensaje...");
                System.out.println(SystemC.ReceiveMessage());
            } else if (!Input.equals("s")) {
                SystemC.SendMessage(Input);
            }
        }
    }
}
