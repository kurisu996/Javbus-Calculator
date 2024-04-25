import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        starter();
    }
    public static void starter() throws InterruptedException {
        System.out.println("Choose your mode: Available: getDeterminant; Coming Soon: ;");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("getDeterminant")){
            getDeterminant();
        }

     scanner.close();
    }
    public static void getDeterminant() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("welcome to Determinant mode!");
        Scanner scanner = new Scanner(System.in);
        int[] matrix = new int[4];
        int calculation = 0;
        do {
            System.out.println("Please enter the first number of the first line of the Matrix:");
            int firstNumberfirstLine = Integer.parseInt(scanner.nextLine());
            TimeUnit.MILLISECONDS.sleep(250);
            System.out.println("Please enter the second number of the first line of the Matrix:");
            int secondNumberfirstLine = Integer.parseInt(scanner.nextLine());
            TimeUnit.MILLISECONDS.sleep(250);
            System.out.println("Please enter the first number of the second line of the Matrix:");
            int firstNumbersecondLine = Integer.parseInt(scanner.nextLine());
            TimeUnit.MILLISECONDS.sleep(250);
            System.out.println("Please enter the second number of the second line of the Matrix:");
            int secondNumbersecondLine = Integer.parseInt(scanner.nextLine());
            TimeUnit.MILLISECONDS.sleep(250);
            matrix[0] = firstNumberfirstLine;
            matrix[1] = secondNumberfirstLine;
            matrix[2] = firstNumbersecondLine;
            matrix[3] = secondNumbersecondLine;
            System.out.println("|" + firstNumberfirstLine + " " + secondNumberfirstLine + "|");
            System.out.println("|" + firstNumbersecondLine + " " + secondNumbersecondLine + "|");
            System.out.println("Is this matrix correct? (Y/N)");
            while (true) {
                String yesNo = scanner.nextLine();
                if (yesNo.equals("Y")) {
                    TimeUnit.SECONDS.sleep(1);
                    calculation = (matrix[0] * matrix[3]) - (matrix[1] * matrix[2]);
                    System.out.println("The determinant is " + calculation);
                    break;
                } else if (yesNo.equals("N")) {
                    break;
                } else {
                    System.out.println("Invalid input! Is this matrix correct? (Y/N)");
                }
            }
        } while (calculation == 0);
    }
}