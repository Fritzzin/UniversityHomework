public class Exercicio{
	public static double postorder(Node n){
		// External
		if(n.isExternal()){
			double v = Double.parseDouble(n.element);
			return v;
		}

		// Left
		Double x = postorder(n.left);

		// Right
		Double y = postorder(n.right);

		// Node
		if 		(n.element.equals("+")) return x+y;
		else if (n.element.equals("-")) return x-y;
		else if (n.element.equals("*")) return x*y;
		else 							return x/y;
	}

	public static void inorder(Node n){
		// 1. Left
		if(n.left != null) { System.out.print("("); inorder(n.left); }

		// 2. Node
		System.out.print(n.element);

		// 3. Right
		if(n.right != null) { inorder(n.right); System.out.print(")"); } 
	}

	public static void json(Node n){
		// Node
		if(n.isExternal()){
			System.out.print("[\""+n.element+"\", null, null]");
		} else {
			System.out.print("[\""+n.element+"\"");
		}		

		// Left
		if(n.left != null) { 	System.out.print(","); json(n.left);}

		// Right
		if(n.right != null) { 	System.out.print(","); json(n.right); System.out.print("]");}
	}

	public static void main(String[] args){
		BinaryTree tree = new BinaryTree("+");

		Node a = tree.getRoot();
		Node b = tree.addLeftChild(a,"*");
		Node c = tree.addLeftChild(b,"+");
		Node d = tree.addLeftChild(c,"1");
		Node e = tree.addRightChild(c,"4");
		Node f = tree.addRightChild(b,"5");
		Node g = tree.addRightChild(a,"-");
		Node h = tree.addLeftChild(g,"8");
		Node i = tree.addRightChild(g,"*");
		Node j = tree.addLeftChild(i,"3");
		Node k = tree.addRightChild(i,"7");

		//inorder(a);
		//System.out.println(" = "+postorder(a));
		json(a);
	}
}