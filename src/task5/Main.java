package task5;

import java.time.LocalDate;

/**
 * Created by Lenovo on 14.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("PC", "Dobry", "Taki fajny, że hej");
        Product product2 = new Product("Samochód", "Niemiecki", "Niemiec płakał, jak sprzedawał");

        Guarantee guarantee1 = new Guarantee(product1, LocalDate.of(2012, 5,5));
        Guarantee guarantee2 = new Guarantee(product2, LocalDate.of(2019, 8,1));

        if(!guarantee1.isValid()){
            System.out.println("Gwarancja produktu 1 sie skonczyla");
        }
        if(!guarantee2.isValid()){
            System.out.println("Gwarancja produktu 2 sie skonczyla");
        }
    }

}
