
import java.util.ArrayList;

// @Author: Augusto (Fritzzin) Fritz

public class tarefa {

    //Adicionar os filhos
    public static void addFilhos(Node n){
        // Variáveis auxiliares x = esquerdo | y = direito
        String x = "";
        String y = "";

        //procurando filhos
        for(int i = 0; i < pais.size(); i++){
            if (n.element.equals(pais.get(i))){
                x = filhos.get(i);
                //System.out.println("Achei filho esquerdo de "+n.element+": "+filhos.get(i));
                break;
            }
        }

        for(int i = 0; i< pais.size(); i++){
            if (n.element.equals(pais.get(i)) && !filhos.get(i).equals(x)){
                y = filhos.get(i);
                //System.out.println("Achei filho direito de "+n.element+": "+filhos.get(i));
            }
        }

        // Adicionar filho esquerdo
        if(n.left == null && !x.equals("")){
            Node esquerdo = new Node(x);
            n.left = esquerdo;
            esquerdo.parent = n;
            //System.out.println("Adicionando filho esquerdo de "+n.element+": "+esquerdo.element+"\n");
            addFilhos(esquerdo);
        }

        // Adicionar filho direito
        if(n.right == null && !y.equals("")){
            Node direito = new Node(y);
            n.right = direito;
            direito.parent = n;            
            //System.out.println("Adicionando filho direito de "+n.element+": "+direito.element+"\n");
            addFilhos(direito);
        }
    }

    public int diameter(BinaryTree tree){
        return tree.height(tree.getRoot().left) + tree.height(tree.getRoot().right) + 1;
    }

    public static void svg_start() {
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
        System.out.println("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"400\" height=\"400\">");
        System.out.println();

        System.out.println("  <style type=\"text/css\">");
        System.out.println("      .label { font: normal 24px sans-serif; stroke-width: 0; fill: black }");
        System.out.println("  </style>");
        System.out.println();

        System.out.println("  <g stroke=\"black\" stroke-width=\"2\">");
        System.out.println();
    }

    public static void exportToSVG(Node n){svg_start(); svg(n, 200, 30, 60); svg_finish();}

    public static void svg(Node n, int x, int y, int d) {
        int leftx = x - d;
        int lefty = y + 60;
        int rightx = x + d;
        int righty = y + 60;

        if (n.left != null) {
            System.out.println("<line   x1=\"" + x + "\" y1=\"" + y
                    + "\" x2=\"" + leftx + "\" y2=\"" + lefty + "\" />");
        }
        if (n.right != null) {
            System.out.println("<line   x1=\"" + x + "\" y1=\"" + y
                    + "\" x2=\"" + rightx + "\" y2=\"" + righty + "\" />");
        }

        System.out.println("    <circle cx=\"" + x + "\" cy=\"" + y
                + "\" r=\"20\" fill=\"#55cccc\" />");
        System.out.println("    <text  x=\"" + (x - 8) + "\"  y=\"" + (y + 8)
                + "\" class=\"label\">" + n.element + "</text>");

        if (n.left != null) {
            svg(n.left, leftx, lefty, d / 2);
        }
        if (n.right != null) {
            svg(n.right, rightx, righty, d / 2);
        }
    }

    public static void svg_finish() {
        System.out.println("  </g>");
        System.out.println("</svg>");
    }


	// Arrays
    public static ArrayList<String> pais = new ArrayList<String>();
    public static ArrayList<String> filhos = new ArrayList<String>();

    // Main
    public static void main(String[] args) {
    	// Abrir arquivo
    	ArquivoLeitura leitura = new ArquivoLeitura("dataset-a-large.txt");

        // Variável auxiliar para root
        String root = "";
        
        // Variáveis auxiliares para leitura do arquivo
        String s = leitura.lerLinha();
        String pai = "";	String filho = "";

        // Ler arquivo
        while (s != null) {
            // Print para debug
            //System.out.println(s);

            // Separar linhas
            String[] separar = s.split(" > ");
            pai = separar[0];	filho = separar[1];

            // Adicionar aos respectivos arrays
            pais.add(separar[0]);	filhos.add(separar[1]);

            // Passar para próxima linha
            s = leitura.lerLinha();
        }

        // Prints para debug
        System.out.println("\npais: " + pais);
        System.out.println("filhos: " + filhos);

        // Descobrir root
        for (int i = 0; i < filhos.size(); i++) {
            if (!filhos.contains(pais.get(i))) {
                root = pais.get(i);
            }
        }

        // Debug de root
        System.out.println("Root: " + root + "\n");

        // Criar BinaryTree com root
        BinaryTree tree = new BinaryTree(root);
        System.out.println("Tree Root: " + tree.getRoot().element);

        // Adicionar filhos e fazer o print
        addFilhos(tree.getRoot());
        System.out.println("\nPrint da Árvore: \n");
        tree.print(tree.getRoot());
        System.out.println();
        
        // Diametro
        System.out.println("\nDiâmetro: " + tree.diameter(tree.getRoot()));

        // Gerar texto para visualização em SVG
        System.out.println("\nPara visualização em SVG:");
        exportToSVG(tree.getRoot());
    }
}