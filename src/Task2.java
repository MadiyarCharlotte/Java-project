import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        //Create an array of integer values. After the array is created,
        // calculate the sum of all stored elements in that array.

        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number " + (i + 1));
            numbers[i] = sc.nextInt();}

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println("Sum of all numbers in the array "+sum);
    }
}
