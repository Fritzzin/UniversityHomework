package Exercicio02;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 *
 * @author augusto.fritz
 */
public class Listing implements Comparable {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void listFiles(String folderPath) {
        File file = new File(folderPath);
        File[] files = file.listFiles();

        System.out.println("Path: " + folderPath + "\n");

        for (File fileData : files) {
            System.out.println("Name: " + fileData.getName()
                    + "\nSize: " + fileData.length() + " bytes"
                    + "\nDate: " + dateFormat.format(fileData.lastModified()) + "\n");
        }
    }

    public void listByDate(String folderPath) {
        File file = new File(folderPath);
        File[] files = file.listFiles();

        System.out.println("Path: " + folderPath + "\n");

        for (File fileData : files) {
            System.out.println("Name: " + fileData.getName()
                    + "\nSize: " + fileData.length() + " bytes\n");
        }
    }

    public void listBySize(String folderPath) {
        File file = new File(folderPath);
        File[] files = file.listFiles();

        System.out.println("Path: " + folderPath + "\n");

        for (File fileData : files) {
            System.out.println("Name: " + fileData.getName()
                    + "\nDate: " + dateFormat.format(fileData.lastModified()) + "\n");
        }
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
