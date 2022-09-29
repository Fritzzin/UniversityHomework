public class TestBinaryTree{
	public static void main (String[] args){
		BinaryTree tree = new BinaryTree("A");

		Node a = tree.getRoot();
		Node b = tree.addLeftChild(a,"B");
		Node c = tree.addRightChild(a,"C");
		Node d = tree.addRightChild(b,"D");

		// Tree Depth
		/*
		System.out.println(tree.depth(a));
		System.out.println(tree.depth(b));
		System.out.println(tree.depth(c));
		System.out.println(tree.depth(d));
		*/

		// Tree Height
		/*
		System.out.println(tree.height(a));
		System.out.println(tree.height(b));
		System.out.println(tree.height(c));
		System.out.println(tree.height(d));
		*/

		tree.print(a);
	}
}