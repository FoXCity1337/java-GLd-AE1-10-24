package lessons.october3;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayOfNumbers = {1, 2, null, 3, 0, null, 0, 5, 6};

        System.out.println("Start");

        for (int i = 0; i < 15; i++) {
            System.out.println("Индекс равен: " + i);
            try {
                System.out.println(1 / arrayOfNumbers[i]);
            } catch (ArithmeticException e) {
                System.out.println("Деление на 0");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            } catch (NullPointerException e){
                System.out.println("Был null");
            }

        }
        System.out.println("Finish");
    }
}
