package selfLearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class taskInSlack {
    public static void main(String[] args) {
        var time = System.currentTimeMillis();

        List<List> alist = new ArrayList<>();
        Integer[] number = {1, 7, 5, 9, 2, 12, 3};
        Arrays.sort(number);
        int k = 2;
        for (int num1 : number) {
            for (int num : number) {
                if (k == (num - num1)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(num1);
                    temp.add(num);
                    alist.add(temp);
                }
            }
        }

        System.out.println(alist);
        System.out.println(time-System.currentTimeMillis());

    }
}