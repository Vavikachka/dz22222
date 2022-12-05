import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        if(scanner.next() == null){
            throw new RuntimeException("пустые строки вводить нельзя");
        }
    }

}
