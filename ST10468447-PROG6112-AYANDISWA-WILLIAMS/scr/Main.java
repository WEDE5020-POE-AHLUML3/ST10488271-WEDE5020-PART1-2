import java.util.Scanner;
 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("LATEST SERIES - 2025");
            System.out.println("********************");
            System.out.println("Enter (1) to launch menu or (6) to exit");

            System.out.print("Please select any of the following menu items: ");
            System.out.println("Menu:");
            System.out.println("1. Capture Series Details");
            System.out.println("2. Search Series");
            System.out.println("3. Update Series");
            System.out.println("4. Delete Series");
            System.out.println("5. Series Report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            (choice) = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {


                case 1:
                    Series.CaptureSeries();
                    break;
                case 2:
                    Series.SearchSeries();
                    break;
                case 3:
                    Series.UpdatedSeries();
                    break;
                case 4:
                    System.out.println("Are you sure you want to delete this series? Y/N:  ");
                    break;
                case 5:
                    System.out.println("Series Report Generated Successfully");

                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (method(choice) != 4);

        sc.close();
    }

    private static int method(int choice) {
        return choice;
    }
}
