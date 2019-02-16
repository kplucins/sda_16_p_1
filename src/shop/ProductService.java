package shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void showListOfProducts(){
        products.stream()
                .map(Product::view)
                .forEach(System.out::println);
    }

    public void addAll(Product ... products){
        this.products.addAll(Arrays.asList(products));
    }
}
