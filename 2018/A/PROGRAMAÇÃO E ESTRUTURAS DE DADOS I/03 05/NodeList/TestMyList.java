package NodeList;

/**
 *
 * @author augusto.fritz
 */
public class TestMyList {

    public static void main(String[] args) {
        MyList list = new MyList();
        Node x = list.insertFirst(1);
        Node y = list.insertFirst(2);
        Node z = list.insertFirst(3);
        System.out.println(list.find(3));
        System.out.println("size= " + list.size());
        System.out.println("list= " + list);
    }
}
