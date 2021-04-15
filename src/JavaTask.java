import java.util.Scanner;
public class JavaTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, counter;
        System.out.println("How many films do you want to enter?");
        number = scanner.nextInt();
        String[] titles = new String[number];
        String[] actors = new String[number];
        String[] category = new String[number];

        scanner.nextLine();
        for (counter = 0; counter < number; counter++) {
            System.out.print("Title " +(counter+1)+ ": ");
            titles[counter] = scanner.nextLine();
        }
        for (counter = 0; counter < number; counter++){
            System.out.print("Actor's name " +(counter+1)+ ": ");
            actors[counter] = scanner.nextLine();
        }
        for (counter = 0; counter < number; counter++){
            System.out.print("Category for movie " +(counter+1)+ ": ");
            category[counter] = scanner.nextLine();
        }
        scanner.close();
        for (counter = 0; counter < number; counter++) {
            System.out.println("Should we cast " +actors[counter]+ " in "+titles[counter]+" and make it a "+category[counter]+ "?");
        }
    }
}





