
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author augusto.fritz
 */
public class ignReview {

    private static class Stats {

        public String title;
        public String score_phrase;
        public Double score;
        public char editors_choice;

        public Stats(String title, String score_phrase, Double score, char editors_choice) {
            this.title = title;
            this.score_phrase = score_phrase;
            this.score = score;
            this.editors_choice = editors_choice;

        }
    }

    private ArrayList<Stats> array;

    public ignReview() {
        array = new ArrayList<Stats>();
    }

    public static void main(String[] args) {
        ArquivoLeitura leitura = new ArquivoLeitura("/home/augusto.fritz/NetBeansProjects/2018_04_30 Aula 11/ign-reviews.txt");
        String linha = leitura.lerLinha();

        HashMap<Integer, Stats> hashTitle = new HashMap<Integer, Stats>(); //info[2]

        while (linha != null) {
            String info[] = linha.split(";");

            int year = Integer.parseInt(info[8]);

            String title = info[2];
            String scorePhrase = info[1];
            Double score = Double.parseDouble(info[5]);
            char editors = info[7].charAt(0);

            Stats stats = new Stats(title, scorePhrase, score, editors);

            linha = leitura.lerLinha();
        }
    }
}

//id                = info[0]
//score_phrase      = info[1]
//title             = info[2]
//url               = info[3]
//plataform         = info[4]
//score             = info[5]
//genre             = info[6]
//editors_choice    = info[7]
//release_year      = info[8]
//release_month     = info[9]
//release_day       = info[10]
