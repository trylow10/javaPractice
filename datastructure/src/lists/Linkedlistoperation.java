package lists;

import java.util.LinkedList;
import java.util.List;



public class Linkedlistoperation {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("added elements in new list are: " + list);
        List<Integer> new_list = new LinkedList<>(list);
        System.out.println("values in list before removing "+new_list);
        list.remove(2);

        System.out.println("removed 2nd index from the list and new list is: " + list);

    }

}
