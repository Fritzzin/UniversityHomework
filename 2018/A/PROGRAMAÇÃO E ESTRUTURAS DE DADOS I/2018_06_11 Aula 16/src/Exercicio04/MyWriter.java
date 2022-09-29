import java.io.*;

class MyWriter
{
    private BufferedWriter bufferedWriter;
    
    public MyWriter(String filename)
    {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename);
            bufferedWriter = new BufferedWriter(fileWriter);
        }
        catch (IOException e) {
            System.err.println("Cannot write to file: " + filename);
            //e.printStackTrace();
        }
    }
    
    public void writeLine(String line)
    {
        try {
            if (bufferedWriter != null) {
                bufferedWriter.write(line + "\n");
            }
        }
        catch (IOException e) {
            System.err.println("Error writing to file");
            //e.printStackTrace();
        }
    }
    
    public void close()
    {
        try {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }
        catch(IOException e) {
            System.err.println("Error closing file");
            //e.printStackTrace();
        }
        bufferedWriter = null;
    }
}

