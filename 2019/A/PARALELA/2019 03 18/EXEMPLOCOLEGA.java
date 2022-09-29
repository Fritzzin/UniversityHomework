
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex OZekoski 18/03/2019
 */
public class Descrip implements Runnable {

    public static int checksum1 = 3492;
    public static int checksum2 = 141204219;
    public static int[] v = { 21, 1, 65, 0, 10, 7, 8, 26, 19, 18, 77, 8, 6, 18, 0, 19, 12, 77, 11, 12, 65, 4, 0, 4, 30,
            10, 7, 21, 17, 1, 65, 14, 14, 27, 14, 7 };
    public static String expressao = "[^a-z,A-Z,\\s,/.,\\,,0-9,!,?, ]";
    public static String possiveis = "abcdefghijklmnopqrstuvxwyz0123456789";
    public static int threads = 24;
    int[] chaves = new int[7];
    long total = 0;

    public static void criptografar(String mens, String chave) {
        String aux = "";
        int sum = 0;
        for (int i = 0; i < mens.length(); i++) {
            sum = sum + mens.charAt(i);
            aux += (char) (mens.charAt(i) ^ chave.charAt(i % chave.length()));

        }
        System.out.println(aux);
        System.out.println("soma = " + sum);
        System.out.print("{");
        for (int i = 0; i < aux.length() - 1; i++) {
            System.out.print((int) aux.charAt(i) + ",");
        }
        System.out.println((int) aux.charAt(aux.length() - 1) + "}");
        String temp = "";
        for (int i = 0; i < aux.length(); i++) {
            temp += (char) (aux.charAt(i) ^ chave.charAt(i % chave.length()));
        }
        System.out.println(temp);
    }

    public Descrip(int inicia) {
        for (int i = 0; i < inicia; i++) {
            soma(chaves);
        }
    }

    public boolean incrementa() {
        for (int i = 0; i < threads; i++) {
            if (!soma(chaves)) {
                return false;
            }
        }
        return true;
    }

    public static int[] aplicarXor(int[] v, int[] c) {
        int[] nova = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            nova[i] = xor(v[i], possiveis.charAt(c[i % c.length]));
        }
        return nova;
    }

    public boolean soma(int[] v) {
        v[0] = v[0] + 1;
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] == possiveis.length()) {
                v[i] = 0;
                v[i + 1] = v[i + 1] + 1;
            }
        }
        if (v[v.length - 1] == possiveis.length()) {
            v[v.length - 1] = 0;
            return false;
        }
        return true;
    }

    public static int[] aplicarXor(int[] v, int c) {
        int[] nova = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            nova[i] = xor(v[i], c);
        }
        return nova;
    }

    public static boolean total(int[] v, int m) {
        int s = 0;
        for (int i = 0; i < v.length; i++) {
            s += v[i];
        }
        return s == m;
    }

    public static String valor(int[] v) {
        String r = "";
        for (int i = 0; i < v.length; i++) {
            r += ((char) v[i]);
        }
        return r;
    }

    public static String valor2(int[] v) {
        String r = "";
        for (int i = 0; i < v.length; i++) {
            r += (possiveis.charAt(v[i]));
        }
        return r;
    }

    public static int soma(int v) {
        v += 16;
        v += 1;
        return v;
    }

    public static int xor(int a, int b) {
        return a ^ b;
    }

    public int totalP(int[] v) {
        int son = 0;
        for (int i = 0; i < v.length; i++) {
            son += (int) Math.pow(v[i], i + 1);
        }
        return son;
    }

    @Override
    public void run() {
        // DescTela.tela.colocarTexto("Thread "+Thread.currentThread().getName()+"
        // iniciou");
        do {
            int[] n = aplicarXor(v, chaves);
            if (total(n, checksum1) && totalP(n) == checksum2) {
                String val = valor(n);

                try {
                    Pattern pattern = Pattern.compile(expressao);
                    Matcher matcher = pattern.matcher(val);
                    if (!matcher.find()) {
                        System.out.println("\"" + val + "\" chave = " + valor2(chaves));
                    } else {
                        System.out.println("\"" + val + "\" chave = " + valor2(chaves));
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
            total++;

        } while (incrementa());
    }

    public static void main(String[] args) {

        Thread[] thread = new Thread[threads];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(new Descrip(i));

            thread[i].start();
        }

    }
}
