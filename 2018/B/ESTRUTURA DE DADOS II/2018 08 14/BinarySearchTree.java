public class BinarySearchTree{
	private static BinaryTree tree;

	public BinarySearchTree(){
		this.tree = new BinaryTree("8");
		Node a = tree.getRoot();
		Node b = tree.addLeftChild(a, "4");
		Node c = tree.addRightChild(a, "13");
				 tree.addLeftChild(b, "3");
				 tree.addRightChild(b, "6");
		Node d = tree.addRightChild(c, "20");
				 tree.addLeftChild(d, "14");
	}

	//public static void insert();

	public static boolean contains(String s){
		Node n = tree.getRoot();
		while(n != null){
			if (n.element.equals(s)) {return true;}
			if (Double.parseDouble(s) < Double.parseDouble(n.element)) { n = n.left;}
			if (Double.parseDouble(s) > Double.parseDouble(n.element)) { n = n.right;}
		}
		return false;
	}

	//public static void remove();
}