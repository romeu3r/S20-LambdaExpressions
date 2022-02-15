package util;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.MissingFormatArgumentException;

public class ProductService {

    public void readingCsv(String path, List<Product> list) {
        if (path.equals(""))
            throw new MissingFormatArgumentException("Invalid path!");
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
