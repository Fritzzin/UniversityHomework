public class BinarySearchTree{

	public static void insert();

	public static void contains();

	public static void remove();

	public static void main(String[] args){
		BinaryTree tree = new BinaryTree("A");
		Node a = tree.getRoot();
		Node b = tree.addLeftChild(a, "B");
		Node c = tree.addRightChild(a, "C");
		Node d = tree.addRightChild(b, "D");
		Node e = tree.addLeftChild(c, "E");
	}
}