import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
        new Customer(1, "Пупкин", "Вася",
                "Лесов", "Глининная 16", 123, 321),

        new Customer(2, "Лупа", "Иван",
                "Лупович", "Столовая 16", 345, 543),

        new Customer(3, "Антонов", "Пупа",
                "Спенович", "Столовая 16", 345, 543),

        new Customer(4, "Нос", "Степан",
                "Николаевич", "Столовая 16", 345, 543),

        new Customer(5, "Дрябкин", "Игорь",
                "Лупенькович", "Столовая 16", 345, 543),
        };

        Arrays.sort(customers, Collections.reverseOrder());

        System.out.println(customers);
    }
}
