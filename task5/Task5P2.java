import java.util.Scanner;
import java.util.ArrayList;

public class Task5P2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> number = new ArrayList<>();


        System.out.println("Enter a first number: ");
        int first = scanner.nextInt();
        number.add(first);

        System.out.println("Enter a second number: ");
        int second = scanner.nextInt();
        number.add(second);

        System.out.println("Enter a third number: ");
        int third = scanner.nextInt();
        number.add(third);

        if (first == second && second == third){
            System.out.println("All numbers are equals");
        } 

        int largest = Math.max(first, Math.max(second, third));

        System.out.println("The largest number is: " + largest);

        scanner.close();
        
    }
}