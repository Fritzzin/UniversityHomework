package servidortcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class ClienteTCP {

    public static final int PORTA = 5000;

    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("127.0.0.1", PORTA);

            Scanner scanner = null;

            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());

            boolean repetir = true;

            while (repetir) {

                String mens = (String) entrada.readObject();
                System.out.println("O servidor disse: \n" + mens);

                System.out.print("Comando: ");
                scanner = new Scanner(System.in);
                String comando = scanner.nextLine();

                if (comando.toLowerCase().equals("upload")) {
                    String path;
                    System.out.println("Caminho para arquivo :");
                    scanner = new Scanner(System.in);
                    path = scanner.nextLine();

                    File file = new File(path);
                    saida.writeObject(file.getName());

                    FileInputStream fis = new FileInputStream(file);
                    byte[] buffer = new byte[ServidorTCP.BUFFER_SIZE];
                    Integer bytesRead = 0;

                    while ((bytesRead = fis.read(buffer)) > 0) {
                        saida.writeObject(bytesRead);
                        saida.writeObject(Arrays.copyOf(buffer, buffer.length));
                    }

                } else {
                    saida.writeObject(comando);
                }

                if (comando.toLowerCase().equals("tchau")) {
                    repetir = false;
                }
            }

            entrada.close();
            saida.close();
            cliente.close();

            System.out.println("Conexão encerrada");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
