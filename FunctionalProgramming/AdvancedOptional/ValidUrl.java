package FunctionalProgramming.AdvancedOptional;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Predicate;

public class ValidUrl {


    Predicate<String> isValidUrl = url -> {
        try {
            new URL(url);
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    };
}
