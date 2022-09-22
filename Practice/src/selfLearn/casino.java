package selfLearn;

public class casino {
    public static void main(String[] args) {
        int number = 300;
        int count = 0;
        while (number != 1) {
            count++;
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number - 1;

            }
        }
        System.out.println("the number of odd is " + count);
    }
}




