import java.util.Arrays;
import java.util.*;

public class Customer {
    public int id;
    public String surname;
    public String name;
    public String patronymic;
    public String address;
    public int number_cart;
    public int number_bank_account;

    public Customer(int id,
                      String surname,
                      String name,
                      String patronymic,
                      String address,
                      int number_cart,
                      int number_bank_account) {

        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.number_cart = number_cart;
        this.number_bank_account = number_bank_account;

    }

    @Override
    public String toString() {
        return "Id покупателя: " + id + "\nИмя: " + name + "\nФамилия: " + surname +
                "\nОтчество: " + patronymic + "\nНомер кредитной карточки: " + number_cart +
                "\nНомер банковской карточки: " + number_bank_account;
    }





}
