import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Der er kaffe!!");

        System.out.println("Hvor mange tal vil du printe?");
        //Scanner scan = new Scanner();
        for(int i=1; i<=3; i++) {

            for (int b = 0; b<5-i; b++) {

                for (int j = 0; j < i; j++) {

                    System.out.print(i);
                }
                System.out.println();
                System.out.println(" ekko");
            }
        }

    }
}