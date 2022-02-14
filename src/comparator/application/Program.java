package comparator.application;

import comparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Comparator<Product> comp = (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());

        list.sort(comp);

        list.forEach(System.out::println);
    }
}
