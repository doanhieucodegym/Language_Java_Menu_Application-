import java.util.Scanner;

public class Menu_Application {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1: Draw the triangle");
        System.out.println("2: Draw the square");
        System.out.println("3: Draw the rectangle");
        System.out.println(" 0:Exit");
        Scanner sc = new Scanner(System.in);
        while(true){
            int choose = sc.nextInt();
            switch(choose){
                case 1 :
                    System.out.println("*********");
                    System.out.println("********");
                    System.out.println("*******");
                    System.out.println("******");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2 :
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    break;
                case 3 :
                    System.out.println("********");
                    System.out.println("********");
                    System.out.println("********");
                    System.out.println("********");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choose!");

            }

        }
    }
}
