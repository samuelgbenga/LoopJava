public class Main {
    public static void main(String[] args) {

        for( int i = 1; i<=5; i++){
         System.out.println("Square of " + i + " is " + i * i);
        }

        // nested for loop

        for(int i = 1; i <= 5; i++){
            for(int j = i; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Hello world!");

    }
}