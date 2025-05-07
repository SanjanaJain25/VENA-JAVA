package FunctionalProgramming.CustomTypedAndNestedStreams;
import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    String category;
    double rating;

    Product(String name, String category, double rating) {
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getRating() {
        return rating;
    }
}



public class Question38 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("iPhone", "Electronics", 4.6),
                new Product("Galaxy", "Electronics", 4.5),
                new Product("MacBook", "Electronics", 4.8),
                new Product("T-Shirt", "Clothing", 4.1),
                new Product("Jeans", "Clothing", 4.4),
                new Product("Harry Potter", "Books", 4.9),
                new Product("Java Basics", "Books", 4.7)
        );

        Map<String, String> highestRatedByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::getRating)),
                                opt -> opt.map(Product::getName).orElse("N/A")
                        )
                ));

        System.out.println("Highest-rated product in each category:");
        highestRatedByCategory.forEach((category, name) ->
                System.out.println(category + " → " + name)
        );
    }
}
