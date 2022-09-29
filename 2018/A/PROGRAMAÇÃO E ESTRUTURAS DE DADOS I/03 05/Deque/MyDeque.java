package Deque;


/**
 *
 * @author augusto.fritz
 */
public class MyDeque extends MyQueue {

    public void addFirst(int i) {
        this.array.add(0, i);
    }

    public int removeLast() throws Exception {
        if (size() != 0) {
            return this.array.remove(size() - 1);
        } else {
            throw new Exception("empty queue");
        }
    }

    public int last() throws Exception {
        if (size() != 0) {
            return this.array.get(size() - 1);
        } else {
            throw new Exception("emptyq ueue");
        }
    }

}
