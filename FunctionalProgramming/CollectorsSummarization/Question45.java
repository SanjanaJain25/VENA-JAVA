package FunctionalProgramming.CollectorsSummarization;

import java.util.*;
import java.util.stream.*;

class Book {
    private String title;
    private double price;
    private double rating;

    public Book(String title, double price, double rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }
}

class BookSummary {
    private long totalCount;
    private double averageRating;
    private double totalPrice;

    public BookSummary(long totalCount, double averageRating, double totalPrice) {
        this.totalCount = totalCount;
        this.averageRating = averageRating;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "BookSummary{" +
                "totalCount=" + totalCount +
                ", averageRating=" + averageRating +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
public class Question45 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java Basics", 499.0, 4.5),
                new Book("Spring Boot", 699.0, 4.7),
                new Book("Effective Java", 799.0, 4.9)
        );

        long totalCount = books.size();
        double averageRating = books.stream()
                .mapToDouble(Book::getRating)
                .average()
                .orElse(0.0);
        double totalPrice = books.stream()
                .mapToDouble(Book::getPrice)
                .sum();

        BookSummary summary = new BookSummary(totalCount, averageRating, totalPrice);
        System.out.println(summary);
    }
}