public class Task10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?

        String[] arr = {"Aa", "Ab", "Ac", "Ad", "Ae", "Aa", "Ad", "Bb"};
        System.out.println("Duplicate elements in the arr:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}


