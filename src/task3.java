import java.io.FileNotFoundException;
//первй способ
public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}


////второй способ
//    int a = 90;
//    int b = 3;
//        System.out.println(a / b);
//                printSum(a, b);
//                int[] abc = { 1, 2 };
//                int index = 3;
//                abc[index] = 9;
//
//                if(index > abc.length-1){
//                throw new RuntimeException("Массив выходит за пределы своего размера!");
//                }
//                if(a == null || b == null){
//                throw new NullPointerException("Указатель не может указывать на null!");
//                }
//
//                }
//     public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//        }




