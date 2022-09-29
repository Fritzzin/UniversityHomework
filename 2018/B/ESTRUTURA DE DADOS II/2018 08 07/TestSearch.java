public class TestSearch{
	public static void preorder(Node n){
		// 1. Node
		System.out.println(n.element);

		// 2. Left
		if(n.left != null) { preorder(n.left); }

		// 3. Right
		if(n.right != null) { preorder(n.right); } 
	}


	public static void inorder(Node n){
		// 1. Left
		if(n.left != null) { inorder(n.left); }

		// 2. Node
		System.out.println(n.element);

		// 3. Right
		if(n.right != null) { inorder(n.right); } 
	}

	public static void postorder(Node n){
		// 1. Left
		if(n.left != null) { postorder(n.left); }

		// 2. Right
		if(n.right != null) { postorder(n.right); } 

		// 3. Node
		System.out.println(n.element);
	}

	public static void main (String[] args){
		BinaryTree tree = new BinaryTree("A");

		Node a = tree.getRoot();
		Node b = tree.addLeftChild(a,"B");
		Node c = tree.addRightChild(a,"C");
		Node d = tree.addRightChild(b,"D");

		//preorder(a);
		//inorder(a);
		postorder(a);
	}
}