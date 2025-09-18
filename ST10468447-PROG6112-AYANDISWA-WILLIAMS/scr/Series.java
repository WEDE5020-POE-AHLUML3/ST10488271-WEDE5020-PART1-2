import java.util.ArrayList;
import java.util.Scanner;


public class Series {

private static ArrayList<SeriesModel> seriesList = new ArrayList<>();
private static Scanner sc = new Scanner(System.in);
    private static boolean found;

public static void CaptureSeries () {
    System.out.print("Enter Series ID: ");
    String id = sc.nextLine();

        System.out.print("Enter Series Name: ");
        String name = sc.nextLine();

        int age; 
        do {
            System.out.print("Enter Age Restriction (2-18): ");
            age = sc.nextInt();
            sc.nextLine();
        } while (age < 2 || age > 18);
        System.out.print("Enter Number of Episodes: ");
        int episodes = sc.nextInt();
        sc.nextLine(); 
        seriesList.add(new SeriesModel(id, name, age, episodes));
        System.out.println("Series details captured successfully.");
   }


        public static void SearchSeries() {
                System.out.print("Enter Series ID to search: ");
                String id = sc.nextLine();

                for (SeriesModel s: seriesList) {
                    if (s.seriesId.equals(id)) { 
                        System.out.println("Found: " + s.seriesName + "| Age: " +s.seriesAge + "| Epoisodes: " + s.seriesNumberOfEpisodes);
                        return;
                    }
                }
                if (!found) {
                    String searchId = null;
                    System.out.println("Series with ID " + searchId + " not found.");
                }
        }

            public static void UpdatedSeries() {
            System.out.print("Enter Series ID to update: ");
            String Id = sc.nextLine();
           

            for (SeriesModel s : seriesList) {
                if (s.seriesId.equals(Id)) {
                    System.out.print("Enter new Series Name: ");
                    s.seriesName = sc.nextLine();   

                     int age; 
                    do {
                        System.out.print("Enter new Age Restriction (2-18): ");
                        age = sc.nextInt();
                        sc.nextLine();

                        if (age >= 2 && age <= 18) {
                            break; 
                        } else {
                            System.out.println("Invalid age. Please enter a value between 2 and 18.");
                        }   

                    } while (true); 
                    s.seriesAge = age;


                    System.out.print("Enter new Number of Episodes: "); 
                    s.seriesNumberOfEpisodes = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Series details updated successfully.");
                    found = true;
                    break;
                }
            }
        
            if (!found) {
                System.out.println("Series with ID " + Id + " not found.");
            }
        }
        public static void DeleteSeries() {
            
            System.out.print("Enter Series ID to delete: ");
            String id = sc.nextLine();

            boolean found = false;


            for (int i = 0; i < seriesList.size(); i++) {
                SeriesModel s= seriesList.get(i);
                if (seriesList.get(i).seriesId.equals(id)) {
                    System.out.print("Are you sure you want to delete this series? (y/n): ");
                    String confirm = sc.nextLine();
                    if (!confirm.equalsIgnoreCase("y")) {
                        seriesList.remove(i);
                        System.out.println("Series eithID " + id + " deleted successfully.");
                    } else {
                        System.out.println("Deletion cancelled.");
                    }
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Series with ID " + id + " not found.");
            }
        }
        public static void SeriesReport() {
            System.out.println("Series Report:");
            for (SeriesModel s : seriesList) {
                System.out.println("ID: " + s.seriesId + ", Name: " + s.seriesName + ", Age: " + s.seriesAge + ", Episodes: " + s.seriesNumberOfEpisodes);
            }
        }

          public static void ExitSeriesApplication() {
                System.out.println("Exiting  Application. Goodbye!");
                sc.close();
                System.exit(0); 
        }

      public static SeriesModel 
      SearchSeriesById (String id) {
        for (SeriesModel s : seriesList) {
            if (s.seriesId.equals(id)) {
                return s;
            }
        }
        return null;
        }
      
        public static void updateSeries(String id, String newName, int age, String newGenre) {
            for (SeriesModel s : seriesList) {
                if (s.seriesId.equals(id)) {
                    s.seriesName = newName;
                    s.seriesAge = age;
                    s.seriesGenre = newGenre;
                    return;
                }
            }
        }
    }




    









    



