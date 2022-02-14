package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Predicate<Product> pred = p -> p.getPrice() >= 1000;
        list.removeIf(pred);

        list.forEach(System.out::println);
    }
}
