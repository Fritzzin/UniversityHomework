import java.util.*;

public class TestSortPerformance
{
    public static void insertion_sort(ArrayList<Integer> a)
    {
        for (int j = 1; j < a.size(); j++)
        {
            int tmp = a.get(j);
            int i = j - 1;
            while (i >= 0 && a.get(i) > tmp)
            {
                a.set(i + 1, a.get(i));
                i--;
            }
            a.set(i + 1, tmp);
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        int i, n = 10000;
        long start;
        ArrayList<Integer> array = new ArrayList<Integer>();

        TreeSet ts = new TreeSet();
        
        for (i = 0; i < n; i++)
        {
            array.add((int)(Math.random() * n));
        }

        System.out.println("Time sorting " + n + " integers (in seconds)");


        start = System.currentTimeMillis();
        //TreeSet
        for (int j = 0; j < array.size() ; j++) {
            ts.add(array.get(j));
        }
        System.out.println("  TreeSet sort:              " + (System.currentTimeMillis() - start) / 1000.0);
        

        start = System.currentTimeMillis();
        BinarySearchTree bst = new BinarySearchTree(String.valueOf(array.get(0)));
        for (int j = 0; j < array.size() ; j++) {
            bst.insert(String.valueOf(array.get(j)));
        }
        System.out.println("  BinarySearchTree sort:     " + (System.currentTimeMillis() - start) / 1000.0);
    }
}
