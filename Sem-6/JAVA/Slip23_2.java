import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Slip23_2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            list.add(args[i]);
        }

        System.out.println("Using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsing ListIterator (Forward):");
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        System.out.println("\nUsing ListIterator (Backward):");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}