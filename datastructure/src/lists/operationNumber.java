package lists;

import java.util.Scanner;

public class operationNumber {
static int storedValue = 1;

    public static void main(String[] args) {

        System.out.println("the sum is " +(double)(method1()+storedValue));
    }
    public static int method1(){
        System.out.println("enter any number ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        return number1;

    }

}
