package application;

import entities.Product;
import util.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        String filePath = "C:\\temp\\in.csv";
        List<Product> list = new ArrayList<>();
        new ProductService().readingCsv(filePath, list);

        int qtd = 0;
        double total = 0.0;

        for (Product item : list) {
            total += item.getPrice();
            qtd++;
        }
        double media = total / qtd;
        System.out.println(media);
        List<Product> item = list.stream().filter(p -> p.getPrice() <= media).sorted((p1, p2) -> p2.getName().toUpperCase().compareTo(p1.getName().toUpperCase())).collect(Collectors.toList());
        item.forEach(System.out::println);
    }
}
