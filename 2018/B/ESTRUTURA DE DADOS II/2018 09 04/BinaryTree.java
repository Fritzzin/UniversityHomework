public class BinaryTree{
	private Node root;

	public BinaryTree(String s){
		Node n = new Node(s);
		this.root = n;
	}

	public Node getRoot(){
		return this.root;
	}

	public Node addLeftChild(Node parent, String s){
		if (parent.left != null){
			System.err.println("Node already has left child");
			return null;
		}

		Node n = new Node(s);

		// Parent <-> N
		n.parent = parent;
		parent.left = n;

		return n;			
	}
	

	public Node addRightChild(Node parent, String s){
		if (parent.right != null){
			System.err.println("Node already has right child");
			return null;
		}

		Node n = new Node(s);

		// Parent <-> N
		n.parent = parent;
		parent.right = n;

		return n;			
	}

	public int depth(Node n){
		int c = 0;

		while (n.parent != null){
			c++;
			n = n.parent;
		}

		return c;
	}

	public int height(Node n){
		//Stop Case
		if(n.isExternal()){
			return 0;
		}

		//General Case

		//Has Left Child
		int x = 0;
		if(n.left != null) { x = height(n.left); }

		//Has Right Child
		int y = 0;
		if(n.right != null) { y = height(n.right); }

		//Returns max height between childs
		return Math.max(x,y)+1;
	}


	public void print(Node n){
		//Prints Node's element
		System.out.println(n);

		//Has Left Child
		if(n.left != null) { print(n.left); }

		//Has Right Child
		if(n.right != null) { print(n.right); }
	}

	// Diametro
	public int diameter(Node root){
		return height(root.left) + height(root.right) + 1;
	}
}
