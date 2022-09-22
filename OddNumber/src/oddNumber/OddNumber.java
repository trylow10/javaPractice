package oddNumber;

public class OddNumber {

    public static void main(String[] args) {

//        function oddFinder is called here
        System.out.println("the odd number from one to hundred are");
        oddFinder(100);

    }

    //static function is created that takes number as param
    static void oddFinder(int number) {

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {

                System.out.println(" " + i);
            }

        }
    }
}
