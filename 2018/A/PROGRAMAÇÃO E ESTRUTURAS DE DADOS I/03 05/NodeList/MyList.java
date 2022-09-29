package NodeList;

/**
 *
 * @author augusto.fritz
 */
public class MyList {

    private Node header;
    private int size;

    public int size() {
        return this.size;
    }

    public Node first() {
        return this.header;
    }

    public Node insertFirst(int e) {
        Node n = new Node(e, this.header);
        this.header = n;
        this.size++;
        return n;
    }

    public Node find(int e) {
        Node n = first();
        while (n != null) {
            if (n.element == e) {
                return n;
            }
            n = n.next;
        }
        return null;
    }

    public String toString() {
        String s = "";
        Node n = first(); // default way of  going through a Node List
        while (n != null) {
            s += n;
            n = n.next;
        }
        return s;
    }
}
