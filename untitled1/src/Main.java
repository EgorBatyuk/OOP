import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer(1, "Луковский", "Петр",
                "Анатольевич", "Камышевская 14", 123, 321);

        Customer cus2 = new Customer(2, "Тополёвский", "Юрий",
                "Петрович", "Машерова 14", 143, 371);

        Customer cus3 = new Customer(3, "Молчун", "Григорий",
                "Юрьевич", "Киселево  14", 173, 671);

        Customer cus4 = new Customer(4, "Киркоров", "Анатолий",
                "Григорьевич", "Кира 14", 233, 391);

        Customer cus5 = new Customer(5, "Рюрик", "Игорь",
                "Александрович", "Советская 14", 999, 333);

        Customer[] customers = {cus1, cus2};

        //Arrays.sort(customers);
        System.out.println("Список покупателей в алфавитном порядке:");
        System.out.println(customers);


    }
}
