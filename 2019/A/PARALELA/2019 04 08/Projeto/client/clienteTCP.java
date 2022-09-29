import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class clienteTCP {

    public static final int PORTA = 5000;
    private static Socket cliente;

    public static void main( String[] args ) {
        try {
            cliente = new Socket("127.0.0.1", PORTA);
            Scanner scanner = null;

            ObjectInputStream entrada   = new ObjectInputStream(cliente.getInputStream());
            ObjectOutputStream saida    = new ObjectOutputStream(cliente.getOutputStream());

            boolean repetir = true;

            while (repetir) {

                String mens = (String) entrada.readObject();
                System.out.println("O servidor disse: \n" + mens);

                System.out.print("Comando: ");
                scanner         = new Scanner(System.in);
                String comando  = scanner.nextLine();

                if (comando.toLowerCase().trim().equals("upload")) {
                    saida.writeObject(comando);

                    System.out.println("Caminho para o arquivo: ");
                    scanner = new Scanner(System.in);
                    String arquivo = scanner.nextLine();

                    File f = new File(arquivo);
                    saida.writeObject(f.length());

                    sendFile(arquivo);
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

    public static void sendFile( String file ) throws IOException {
        DataOutputStream dos    = new DataOutputStream(cliente.getOutputStream());
        FileInputStream  fis    = new FileInputStream(file);

        byte[] buffer = new byte[4096];

        while (fis.read(buffer) > 0) {
            dos.write(buffer);
        }

        // fis.close();
        // dos.close();
    }
}
