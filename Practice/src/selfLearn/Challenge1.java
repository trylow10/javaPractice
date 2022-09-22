package selfLearn;

import java.util.ArrayList;
        import java.util.Collections;

public class Challenge1 {

    public static void main(String[] args) {
        var time = System.currentTimeMillis();
        var numbers = new int[]{1, 7, 5, 9, 2, 12, 3};
        var k = 2;
        var pairs = new ArrayList<Pair>();

        for (int i = 0; i < numbers.length; ++i) {
            for (int j = i + 1; j < numbers.length; ++j) {
                var a = numbers[i];
                var b = numbers[j];
                if (k == Math.abs(a - b)) {
                    pairs.add(new Pair(a, b));
                }
            }
        }

        Collections.sort(pairs);
        System.out.println(pairs);
        System.out.println(time-System.currentTimeMillis());
    }

    record Pair(int a, int b) implements Comparable<Pair> {

        Pair {
            if (a > b) {
                a ^= b;
                b ^= a;
                a ^= b;
            }
        }

        @Override
        public String toString() {
            return "(" + a + "," + b + ")";
        }
        @Override
        public int compareTo(Pair o) {
            return a - o.a;
        }
    }
}