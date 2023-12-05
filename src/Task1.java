import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.

        double[] temp = new double[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Enter temperature day " + (i + 1) + ": ");
            temp[i] = sc.nextDouble();
        }
        double highestTemp = temp[0];
        double lowestTemp = temp[0];

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > highestTemp) {
                highestTemp = temp[i];
            }else if (temp[i] < lowestTemp) {
                lowestTemp = temp[i];
            }}
        System.out.println("Highest temperature " + highestTemp);
        System.out.println("Lowest temperature " + lowestTemp);
    }
    }

