public class Task9 {
    public static void main(String[] args) {
        //Write a java program to find the second largest number in the array?

        int[] array = {5, 10, 11, 8, 10, 7};

        int largest = array[0];
        int secondLargest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }System.out.println("Second largest number in the array: " + secondLargest);
        }
    }


