
package movies;
import java.util.Arrays;
import java.util.Scanner;


public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category ");
        System.out.println("5 - view movies in the scifi category");

        Scanner sc = new Scanner(System.in);
        int userOption = sc.nextInt();

        if (userOption == 1) {
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                System.out.println("Name: " + MoviesArray.findAll()[i].getName() + ", Category: " + MoviesArray.findAll()[i].getCategory());
            }
        } else if (userOption == 2) {
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                if (MoviesArray.findAll()[i].getCategory().equals("animated")) {
                    System.out.println("Name: " + MoviesArray.findAll()[i].getName() + ", Category: " + MoviesArray.findAll()[i].getCategory());
                }
            }
        } else if (userOption == 3) {
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                if (MoviesArray.findAll()[i].getCategory().equals("drama")) {
                    System.out.println("Name: " + MoviesArray.findAll()[i].getName() + ", Category: " + MoviesArray.findAll()[i].getCategory());
                }
            }
        } else if (userOption == 4) {
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                if (MoviesArray.findAll()[i].getCategory().equals("horror")) {
                    System.out.println("Name: " + MoviesArray.findAll()[i].getName() + ", Category: " + MoviesArray.findAll()[i].getCategory());
                }
            }
        } else if (userOption == 5) {
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                if (MoviesArray.findAll()[i].getCategory().equals("scifi")) {
                    System.out.println("Name: " + MoviesArray.findAll()[i].getName() + ", Category: " + MoviesArray.findAll()[i].getCategory());
                }
            }
        }
    }
}
