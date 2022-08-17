package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv" , 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Hd Case", 80.90));

        list.forEach(Product::staticPriceUpdate);

        list.forEach(System.out::println);
    }
}