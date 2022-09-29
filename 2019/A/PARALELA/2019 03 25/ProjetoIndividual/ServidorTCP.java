
/*
    @author : Augusto Fritz
    @date   : 25/03/2019
*/

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class ServidorTCP {

    private Socket socket = null;

    public ServidorTCP() {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            // Esperar conexcao
            Socket socketClient = serverSocket.accept();

            PrintWriter out = new PrintWriter(socketClient.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

            // Envia ao cliente
            out.println("Bem vindo ao servidor!\n" + "Digite o comando \"help\" para ver os comandos do servidor");

            while (true) {

                String dados = in.readLine();

                System.out.println("Cliente enviou " + dados);

                out.println(comandos(dados));

                if (dados.equals("tchau") || dados.equals("tchau\r\n")) {
                    socketClient.close();
                    serverSocket.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String comandos(String comando) {
        String mensagem = "";
        String dirParam = "";

        if (comando.toLowerCase().startsWith("dir")) {
            if (comando.length() >= 4) {
                dirParam = comando.substring(4);
            }
            comando = "dir";
        }

        comando = comando.toLowerCase();

        switch (comando) {
        case "help":
            mensagem = "Help   - Listar todos comandos\n" + "Hora   - Mostrar hora atual\n"
                    + "Data   - Mostrar data atual\n" + "Dir    - Listar arquivos do diretorio\n"
                    + "Info   - Mostrar algumas informacoes do servidor" + "Tchau    - Fechar conexao com servidor \n";
            break;

        case "hora":
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            mensagem = sdf.format(cal.getTime()) + "\n";
            break;

        case "data":
            Calendar cal2 = Calendar.getInstance();
            SimpleDateFormat sdf2 = new SimpleDateFormat("d/M/Y");
            mensagem = sdf2.format(cal2.getTime()) + "\n";
            break;

        case "dir":
            if (!dirParam.isEmpty()) {
                File folder = new File(dirParam);
                File[] listOfFiles = folder.listFiles();
                for (File file : listOfFiles) {
                    if (file.isDirectory()) {
                        mensagem += "/" + file.getName() + "\n";
                    } else {
                        mensagem += file.getName() + "\n";
                    }
                }
            }
            break;

        case "info":
            RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
            int cores = Runtime.getRuntime().availableProcessors();

            mensagem += "Server cores   : " + cores + "\n";
            mensagem += "Server uptime  : " + rb.getUptime() + "ms\n";

            break;

        case "tchau":
            break;

        case "upload":
            break;

        default:
            mensagem = "Este nao e um comando valido";
        }
        return mensagem;
    }

    public static void main(String[] args) throws IOException {
        new ServidorTCP();
    }
}