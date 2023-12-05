public class Task7 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series.

        System.out.println("First 10 numbers of Fibonacci series");
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < 10; i++) {
            int next = num1 + num2;
            System.out.print(next + " ");
            num1 = num2;
            num2 = next;
        }
    }
}
