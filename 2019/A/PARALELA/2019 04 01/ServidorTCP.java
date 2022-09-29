package servidortcp;

/*
    @author : Augusto Fritz
    @date   : 25/03/2019
 */

// Java upload (com sockets)

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class ServidorTCP {

    private Socket socket = null;
    public static final int BUFFER_SIZE = 100;

    public ServidorTCP() {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            // Esperar conexcao
            Socket socketClient = serverSocket.accept();

            ObjectOutputStream out = new ObjectOutputStream(socketClient.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socketClient.getInputStream());

            // Envia ao cliente
            out.writeObject("Bem vindo ao servidor!\n" + "Digite o comando \"help\" para ver os comandos do servidor");
            out.flush();

            while (true) {

                String dados = (String) in.readObject();

                System.out.println("Cliente enviou " + dados);

                if (dados.toLowerCase().equals("upload")) {
                    upload(out, in);
                } else {
                    out.writeObject(comandos(dados));
                    out.flush();
                }

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
                        + "Info   - Mostrar algumas informacoes do servidor\n" + "Tchau    - Fechar conexao com servidor \n";
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
                } else {
                    mensagem += "Caminho necessario";
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

            default:
                mensagem = "Este nao e um comando valido";
        }
        return mensagem;
    }

    public void upload(ObjectOutputStream out, ObjectInputStream in) throws IOException, ClassNotFoundException {
//        File arquivoOrigem;
//        long tamanhoArquivo;
//        boolean confirmar = false;
//
//        out.writeObject("Qual caminho para o arquivo?");
//        out.flush();
//
//        String path = (String) in.readObject();
//        System.out.println("Cliente enviou: " + path);
//        
//        out.writeObject("Qual caminho para o arquivo?");
//        out.flush();
//
//        
//        if (confirmar) {
//            out.writeObject("Arquivo recebido com sucesso!");
//            out.flush();
//        }
        FileOutputStream fos = null;
        byte[] buffer = new byte[BUFFER_SIZE];

        // 1. Read file name.
        Object o = in.readObject();

        if (o instanceof String) {
            fos = new FileOutputStream(new File("/home/augusto.fritz/Área de Trabalho/teste.txt"));
        } else {
            System.out.println(("Something is wrong"));
        }

        // 2. Read file to the end.
        Integer bytesRead = 0;

        do {
            o = in.readObject();

            if (!(o instanceof Integer)) {
                System.out.println(("Something is wrong"));
            }

            bytesRead = (Integer) o;

            o = in.readObject();

            if (!(o instanceof byte[])) {
                System.out.println(("Something is wrong"));
            }

            buffer = (byte[]) o;

            // 3. Write data to output file.
            fos.write(buffer, 0, bytesRead);

        } while (bytesRead == BUFFER_SIZE);
    }

    public static void main(String[] args) throws IOException {
        new ServidorTCP();
    }
}
