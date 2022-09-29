import java.util.ArrayList;
import java.util.Random;

public class MessageDecrypt extends Thread {

    private String encryptedMessage;
    private ArrayList<String> usedKeys;

    public MessageDecrypt(String encryptedMessage) {
        this.encryptedMessage = encryptedMessage;
        this.usedKeys = new ArrayList<>();
    }

    @Override
    public void run() {
        for (int t = 0; t < 100000; t++) {
            int k = 0;
            String key = generateKey();
            int checksum1 = 0;
            int checksum2 = 0;
            StringBuilder decryptedMessage = new StringBuilder();

            for (int i = 0; i < encryptedMessage.length(); i++) {
                decryptedMessage.append((char) (encryptedMessage.charAt(i) ^ key.charAt(k)));
                k++;
                if (k > 6) {
                    k = 0;
                }
            }

            for (int i = 0; i < decryptedMessage.length(); i++) {
                checksum1 += decryptedMessage.charAt(i);
                checksum2 += (decryptedMessage.charAt(i) - 32) * (i + 1);
            }

            if (checksum1 == 3492 && checksum2 == 141204219) {
                System.out.println("-----------------------------------------");
                System.out.println("Message: " + decryptedMessage);
                System.out.println("Checksum 1: " + checksum1);
                System.out.println("Checksum 2: " + checksum2);
                System.out.println("Key: " + key);
                System.exit(0);
            }
        }
    }

    private String generateKey() {
        String SALTCHARS = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder s = new StringBuilder();
        s.append("v");
        Random r = new Random();

        while (s.length() < 7) {
            int index = (int) (r.nextFloat() * SALTCHARS.length());
            s.append(SALTCHARS.charAt(index));
        }

        boolean used = false;

        for (String key : this.usedKeys) {
            if (key.equals(s.toString())) {
                used = true;
            }
        }

        if (used) {
            return this.generateKey();
        }

        this.usedKeys.add(s.toString());
        return s.toString();
    }

    public static void main(String[] args) {
        int encryptedChars[] = {21, 1, 65, 0, 10, 7, 8, 26, 19, 18, 77, 8, 6, 18, 0, 19, 12, 77, 11, 12, 65, 4, 0, 4, 30, 10, 7, 21, 17, 1, 65, 14, 14, 27, 14, 7};
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < encryptedChars.length; i++) {
            encryptedMessage.append(Character.toString((char) encryptedChars[i]));
        }

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Numero de cores: " + cores + "\n");

        MessageDecrypt pb[] = new MessageDecrypt[cores];
        for (int i = 0; i < pb.length; i++) {
            pb[i] = new MessageDecrypt(encryptedMessage.toString());
            pb[i].start();
        }
    }
}