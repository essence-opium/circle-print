import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter size for the circle: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println("Size is: " + size);

        /*
        2n+1 matrix size


        calculate diameter diagonally to appear as a circle

        size 2
           * * *
         *       *
        *    0    *
         *       *
           * * *

        ;

        size 1
            * *
           * 0 *
            * *

                *
               *
              *
             0


             *
             * */
    }
}
