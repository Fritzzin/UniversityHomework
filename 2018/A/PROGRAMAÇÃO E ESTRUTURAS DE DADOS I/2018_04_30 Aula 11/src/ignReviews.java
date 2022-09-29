
import java.util.*;

/**
 *
 * @author augusto.fritz
 */
public class ignReviews {

    private class Jogo {

        public int id;
        public String score_phrase;
        public String title;
        public String url;
        public String plataform;
        public Double score;
        public String genre;
        public char editors_choice;
        public int release_year;
        public int release_month;
        public int release_day;

        public Jogo(int id, String score_phrase, String title, String url, String plataform, Double score, String genre, char editors_choice, int release_year, int release_month, int release_day) {
            this.id = id;
            this.score_phrase = score_phrase;
            this.title = title;
            this.url = url;
            this.plataform = plataform;
            this.score = score;
            this.genre = genre;
            this.editors_choice = editors_choice;
            this.release_year = release_year;
            this.release_month = release_month;
            this.release_day = release_day;
        }
    }
    private ArrayList<Jogo> array;

    public ignReviews() {
        array = new ArrayList<Jogo>();
    }

    public static void main(String[] args) {
        ArquivoLeitura leitura = new ArquivoLeitura("/home/augusto.fritz/NetBeansProjects/2018_04_30 Aula 11/ign-reviews.txt"); //opens log.txt file
        String linha = leitura.lerLinha(); //line to a String variable

        while (linha != null) {
            String info[] = linha.split(";");

            int id = Integer.parseInt(info[0]);
            String score_phrase = info[1];
            String title = info[2];
            String url = info[3];
            String plataform = info[4];
            Double score = Double.parseDouble(info[5]);
            String genre = info[6];
            char editors_choice = info[7].charAt(0);
            int release_year = Integer.parseInt(info[8]);
            int release_month = Integer.parseInt(info[9]);
            int release_day = Integer.parseInt(info[10]);

            System.out.println(info[0] + " " + info[1] + " " + info[2] + " " + info[3] + " " + info[4] + " " + info[5] + " " + info[6] + " " + info[7] + " " + info[8] + " " + info[9] + " " + info[10]);
            Jogo jogo = new Jogo(id, score_phrase, title, url, plataform, score, genre, editors_choice, release_year, release_month, release_day);

            array.add(jogo);
            linha = leitura.lerLinha();
        }

    }
}
