
import java.io.*;

public class MyReader {

    private BufferedReader bufferedReader;

    public MyReader(String filename) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file: " + filename);
            //e.printStackTrace();
        }
    }

    public String readLine() {
        try {
            if (bufferedReader != null) {
                return bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error reading from file");
            //e.printStackTrace();
        }
        return null;
    }

    public void close() {
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing file");
            //e.printStackTrace();
        }
        bufferedReader = null;
    }
}

//modificação teste
