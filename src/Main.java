//task1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            String n = scanner.next();

            while (isNumeric("n")==false){
                System.out.println("Введите число: ");
                n = scanner.next();
            }

    }
    public static boolean isNumeric(String str) {     //проверка на число
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}