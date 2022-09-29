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

public class servidorTCP {

    private Socket socket = null;
    public static final int BUFFER_SIZE = 100;

    public servidorTCP() {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            // Esperar conexcao
            Socket socketClient = serverSocket.accept();

            ObjectOutputStream out  = new ObjectOutputStream(socketClient.getOutputStream());
            ObjectInputStream in    = new ObjectInputStream(socketClient.getInputStream());

            // Envia ao cliente
            out.writeObject("Bem vindo ao servidor!\n" + "Digite o comando \"help\" para ver os comandos do servidor");
            out.flush();

            while (true) {

                String dados = (String) in.readObject();

                System.out.println("Cliente enviou " + dados);

                if (dados.toLowerCase().trim().equals("upload")) {
                    try {
                        out.writeObject("Upload");
                        long tamanho = (long) in.readObject();
                        System.out.println("tamanho: " + tamanho);
                        upload(socketClient,tamanho);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e);
                    }
                    
                } else {
                    out.writeObject(comandos(dados.trim()));
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

    public static String comandos( String comando ) {
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
                mensagem =  "Help   - Listar todos comandos\n" + "Hora   - Mostrar hora atual\n"
                        +   "Data   - Mostrar data atual\n"
                        +   "Dir    (caminho) - Listar arquivos do diretorio\n"
                        +   "Info   - Mostrar algumas informacoes do servidor\n"
                        +   "upload (caminho) - Fazer upload para o servidor\n"
                        +   "Tchau  - Fechar conexao com servidor \n";
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
                    mensagem += "Caminho necessario\n";
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

    public void upload( Socket clientSock, long tamanho ) throws IOException {
        DataInputStream  dis    = new DataInputStream(clientSock.getInputStream());
        FileOutputStream fos    = new FileOutputStream("teste.zip");

        //4kb buffer
        byte[] buffer = new byte[4096];

        int filesize    = (int) tamanho; // Send file size in separate msg
        int read        = 0;
        int totalRead   = 0;
        int remaining   = (int) filesize;

        while ((read = dis.read(buffer, 0, Math.min(buffer.length, remaining))) > 0) {
            totalRead += read;
            remaining -= read;
            System.out.println("read " + totalRead + " bytes.");
            fos.write(buffer, 0, read);
        }

        fos.close();
        dis.close();
    }

    public static void main( String[] args ) throws IOException {
        new servidorTCP();
    }
}
