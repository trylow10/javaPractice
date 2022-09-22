public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("the prime numbers from 1 to 100 are");
        primeFinders(0,0);
    }
    static void primeFinders(int num, int i) {

        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                System.out.println(i);
            }
        }
    }
}