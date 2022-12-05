public class task2 {

        public static void main(String[] args) {
            int[] intArray = new int[] { 1, 2, 3, 5 };
            int d=(int)(Math.random()*10);
            if(d == 0){
                throw new ArithmeticException("Деление на ноль не возможно ");
            }
            double catchedRes1 = intArray[2] / d;
            System.out.println("catchedRes1 = " + catchedRes1);

        }


}
