public class Task6 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?

        int number=31;
        int count=0;
        for(int i=1;i<=number;i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is prime.");
        }else{
            System.out.println("Not prime.");
        }

    }
}


