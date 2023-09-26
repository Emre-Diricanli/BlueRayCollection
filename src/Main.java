import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        BlueRayCollection brc = new BlueRayCollection();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("0. Quit");
            System.out.println("1. Add BlueRay to collection");
            System.out.println("2. See collection");

            int menuInput = input.nextInt();
            input.nextLine();

            switch (menuInput){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("What is the title?");
                    String title = input.nextLine();
                    System.out.println("Who is the director?");
                    String director = input.nextLine();
                    System.out.println("What is the year of release?");
                    int yearOfRelease = input.nextInt();
                    input.nextLine();
                    System.out.println("What is the cost?");
                    double cost = input.nextDouble();
                    input.nextLine();
                    brc.add(title, director, yearOfRelease, cost);
                    break;
                case 2:
                    brc.showAll();
                    break;
            }
        }
    }
}