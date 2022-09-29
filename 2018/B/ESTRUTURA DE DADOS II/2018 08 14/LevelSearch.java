import java.util.ArrayList;

public class LevelSearch
{
	public static BinaryTree tree;

	public static void level(Node n){
		ArrayList<Node> queue = new ArrayList<Node>();
		queue.add(n);

		while(queue.size() != 0){
			n = queue.remove(0);
			
			System.out.print(n.element + " ");

			if(n.left != null){ queue.add(n.left); }
			if(n.right != null){ queue.add(n.right); }
		}
		System.out.println();
	}

	public static void levelDepth(Node n){
		ArrayList<Node> queue = new ArrayList<Node>();
		queue.add(n);

		while(queue.size() != 0){
			n = queue.remove(0);
			
			System.out.println(n.element + " " + tree.depth(n));

			if(n.left != null){ queue.add(n.left); }
			if(n.right != null){ queue.add(n.right); }
		}
	}


	public static void visual1(Node n){
		ArrayList<Node> queue = new ArrayList<Node>();
		queue.add(n);

		while(queue.size() != 0){
			n = queue.remove(0);
			
			for (int i = 0;i <= tree.depth(n) ;i++ ) {System.out.print("  ");}
			System.out.println(n.element);

			if(n.left != null){ queue.add(n.left); }
			if(n.right != null){ queue.add(n.right); }
		}
	}

	public static void visual2(Node n){
		ArrayList<Node> queue = new ArrayList<Node>();
		queue.add(n);

		int oldlevel = tree.depth(n);

		while(queue.size() != 0){
			n = queue.remove(0);

			if (tree.depth(n) != oldlevel) {
				System.out.println();
				oldlevel = tree.depth(n);
			}

			System.out.print(n.element + " ");

			if(n.left != null){ queue.add(n.left); }
			if(n.right != null){ queue.add(n.right); }
		}
		System.out.println();
	}

	public static void exportToSVG(Node n){svg_start(); svg(n, 200, 30, 60); svg_finish();}

	public static void svg_start(){
		System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
		System.out.println("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"400\" height=\"400\">");
		System.out.println();

		System.out.println("  <style type=\"text/css\">");
		System.out.println("    .label { font: normal 24px sans-serif; stroke-width: 0; fill: black }");
		System.out.println("  </style>");
		System.out.println("");

		System.out.println("  <g stroke=\"black\" stroke-width=\"2\">");
		System.out.println("    <circle cx=\"0\"   cy=\"0\"   r=\"20\" fill=\"red\" />");
		System.out.println("    <circle cx=\"400\" cy=\"0\"   r=\"20\" fill=\"green\" />");
		System.out.println("    <circle cx=\"0\"   cy=\"400\" r=\"20\" fill=\"blue\" />");
		System.out.println("    <circle cx=\"400\" cy=\"400\" r=\"20\" fill=\"yellow\" />");
		System.out.println("");
	}

	public static void svg(Node n, int x, int y, int d){
		// 1. node
		System.out.println("    <circle cx=\""+x+"\" cy=\""+y+"\" r=\"20\" fill=\"#55cccc\" />");
		System.out.println("	 <text  x=\""+x+"\"  y=\""+y+"\" class=\"label\">"+n.element+"</text>");

		// 2. left
		if (n.left != null) {svg(n.left, (x - d), (y+60), d/2);}

		// 3. right
		if (n.right != null) {svg(n.right, (x + d), (y+60), d/2);}
	}

	public static void svg_finish(){
		System.out.println("  </g>");
		System.out.println("</svg>");
	}
					
	public static void main(String[] args){
		tree = new BinaryTree("A");
		Node a = tree.getRoot();
		Node b = tree.addLeftChild(a, "B");
		Node c = tree.addRightChild(a, "C");
		Node d = tree.addRightChild(b, "D");
		Node e = tree.addLeftChild(c, "E");

		//level(a);
		//levelDepth(a);
		//visual1(a);
		//visual2(a);
		exportToSVG(a);
	}
}




