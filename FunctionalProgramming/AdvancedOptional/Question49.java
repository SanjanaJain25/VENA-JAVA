package FunctionalProgramming.AdvancedOptional;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;



public class Question49 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList(
                "https://google.com",
                "ftp://fileserver.com",
                "invalid-url",
                "http://example.org/page",
                "just-text"
        );

        Predicate<String> isValidUrl = url -> {
            try {
                new URL(url);
                return true;
            } catch (MalformedURLException e) {
                return false;
            }
        };

        // Filter only valid URLs
        List<String> validUrls = urls.stream()
                .filter(isValidUrl)
                .collect(Collectors.toList());

        // Print valid URLs
        validUrls.forEach(System.out::println);
    }
}
