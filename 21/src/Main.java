public class Main {// для тестирования множественных классов

    public static void main(String[] args) {
        Complex complex = new Complex();

        System.out.println ("Сложение:"); // Общий тест
        complex.add("5", "4i", "3", "6i");
        System.out.println("Умножение:");
        complex.multiplication("5", "4i", "3", "6i");

    }
}
