package application;

import entities.Product;
import util.UppercaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> item = list.stream().map(Product::staticUppercaseName).collect(Collectors.toList());

        item.forEach(System.out::println);

    }
}
