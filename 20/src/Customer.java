public class Customer {

    int id;
    String surname;
    String name;
    String patronymic;
    String address;
    int number_cart;
    int number_score;


    public Customer(int id,
                    String surname,
                    String name,
                    String patronymic,
                    String address,
                    int number_cart,
                    int number_score){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.number_cart = number_cart;
        this.number_score = number_score;
    }


    @Override
    public String toString() {
        return this.id + " " +  this.surname + " " + this.name + " " + this.patronymic;
    }

    public void add(String surname){

        System.out.println(surname);

    }

}
