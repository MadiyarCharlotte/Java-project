import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?

        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number" + (i + 1));
            numbers[i] = sc.nextInt();}

            int max = numbers[0];
            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }}
            System.out.println("The maximum number is " + max);
            System.out.println("The minimum number is " + min);
        }
    }

