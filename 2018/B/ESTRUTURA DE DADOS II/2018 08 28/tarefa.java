
import java.util.ArrayList;

public class tarefa {

	// Arrays
    public static ArrayList<String> pais = new ArrayList<String>();
    public static ArrayList<String> filhos = new ArrayList<String>();
    public static ArrayList<String> individual = new ArrayList<String>();

    public static void main(String[] args) {
    	// Abrir arquivo
    	ArquivoLeitura leitura = new ArquivoLeitura("dataset-a-small.txt");

    	

        // Variáveis auxiliares para root
        String root = "";
        
        String s = leitura.lerLinha();
        String pai = "";	String filho = "";

        // Ler arquivo
        while (s != null) {
            System.out.println(s);

            // Separar linhas
            String[] separar = s.split(" > ");
            pai = separar[0];	filho = separar[1];

            // Adicionar aos respectivos arrays
            pais.add(separar[0]);	filhos.add(separar[1]);

            // Array auxiliar para separar em nodos individuais (não haver duplicados)
            for (int i = 0; i < pais.size(); i++) {
                if (!individual.contains(pais.get(i))) {
                    individual.add(pais.get(i));
                }

                if (!individual.contains(filhos.get(i))) {
                    individual.add(filhos.get(i));
                }
            }

            // Passar para próxima linha
            s = leitura.lerLinha();
        }

        // Prints para debug
        System.out.println("\npais: " + pais);
        System.out.println("filhos: " + filhos);
        System.out.println("individual: " + individual);

        // Descobrir root
        for (int i = 0; i < filhos.size(); i++) {
            if (!filhos.contains(pais.get(i))) {
                root = pais.get(i);
            }
        }

        // Debug de root
        System.out.println("root: " + root + "\n");

        // Criar BinaryTree com root
        BinaryTree tree = new BinaryTree(root);
        System.out.println(tree.getRoot().element);
        System.out.println(temFilhos(tree.getRoot()));

        // 
    }

    public static boolean temFilhos(Node n) {
        for (int i = 0; i < pais.size(); i++) {
            if (n.element.equals(pais.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void addFilhos(Node n, BinaryTree tree){
		if(n.left == null){
			tree.addLeftChild(s);
			addFilhos(n.left, s, tree);
		}

		if(n.right == null){
			tree.addRightChild(s);
			addFilhos(n.right);
		}
	}
	/* criar (node n){
		setemfilhoL(){
			addLeft(n,l)
			criar (l)
		}
		setemfilhoR(){
			addRight(n, r)
			criar (r)
		}
	}*/
}
