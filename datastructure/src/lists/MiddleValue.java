package lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MiddleValue {
    static int count = 0;

    public static void main(String[] args) {
        List<Object> items = new LinkedList<>();
        Random random = new Random();
        for (int i = 1; i <= 50; i++) {
            int value = random.nextInt(50);
            items.add(value);
        }

        List<Object> newNumbers = new LinkedList<>(items);

        System.out.println("LIst of Numbers: " + newNumbers);

        for (Object s : items) {
            count++;
        }
        System.out.println("middle index is "+middleValue());
        System.out.println("The middle value is: " + items.get(middleValue()));

    }

    public static int middleValue() {
         count = count / 2;
        return count;
    }
}


