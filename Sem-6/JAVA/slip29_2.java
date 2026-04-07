import java.util.LinkedList;

public class slip29_2 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);

        list.removeLast();

        System.out.println("List: " + list);
        System.out.println("Size of LinkedList: " + list.size());
    }
}