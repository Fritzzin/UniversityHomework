public class BinarySearchTree{
	private BinaryTree tree;

	public BinarySearchTree(String s){
		this.tree = new BinaryTree(s);
	}

	public void insert(String s){
		Node n = tree.getRoot();
		while(n != null){
			if (n.element.equals(s)) { break; }

			//LEFT SIDE
			if (Double.parseDouble(s) < Double.parseDouble(n.element)){
				if (n.left != null){
					n = n.left;
				} else {
					this.tree.addLeftChild(n,s);
					break;
				}
			} else {
			// RIGHT SIDE
			if (Double.parseDouble(s) > Double.parseDouble(n.element)){
				if (n.right != null){
				 	n = n.right; 
				} else {
					this.tree.addRightChild(n,s);
					break;
					}
				}
			}
		}
	}



	public boolean contains(String s){
		Node n = tree.getRoot();
		while(n != null){
			if (n.element.equals(s)) {return true;}
			if (Double.parseDouble(s) < Double.parseDouble(n.element)) { n = n.left;}
			if (Double.parseDouble(s) > Double.parseDouble(n.element)) { n = n.right;}
		}
		return false;
	}

	public Node getRoot(){
		return this.tree.getRoot();
	}

	//public static void remove();
}