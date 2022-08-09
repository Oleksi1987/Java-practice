import java.util.Scanner;

public class Practice {
    public static void  main(String args []) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String name = "";

        do {
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }while(name.isBlank());
            System.out.println("Hello " + name);
        }
    }



