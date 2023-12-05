public class Task3 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.

        int [][] array={
            {10,13,14,20,21},
            {11,16,17,20,23},
                {18,31,30,34,40}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%2==0){
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
