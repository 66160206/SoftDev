import java.util.Scanner;

public class OXGame {
    public static void main(String[] args) {
        System.out.println("Welcome to XO");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input row,col : "); 
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        int row = Integer.parseInt(parts[0].trim());
        int col = Integer.parseInt(parts[1].trim());
       
        scanner.close();
    }
