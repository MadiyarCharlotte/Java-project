public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will calculate the
        // sum of even and odd numbers for that array.

        int [][] array={
                {10,13,14,20,21},
                {11,16,17,20,23},
                {18,31,30,34,40}
        };
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%2==0) {
                    sumEven = sumEven + array[i][j];
                }else{
                    sumOdd=sumOdd+array[i][j];
                }}}
        System.out.println("Sum of even numbers "+sumEven);
        System.out.println("Sum of odd numbers "+sumOdd);
    }
}
