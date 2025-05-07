package FunctionalProgramming.CustomTypedAndNestedStreams;
import java.util.*;
import java.util.*;
import java.util.stream.*;

class Item {
    String name;

    Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Orders {
    List<Item> items;

    Orders(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}



public class Question36 {
    public static void main(String[] args) {
        // Sample orders with items
        List<Orders> orders = Arrays.asList(
                new Orders(Arrays.asList(new Item("Apple"), new Item("Banana"))),
                new Orders(Arrays.asList(new Item("Orange"), new Item("Grapes"))),
                new Orders(Arrays.asList(new Item("Mango"), new Item("Pineapple")))
        );


        List<String> itemNames = orders.stream()
                .flatMap(order -> order.getItems().stream()) //
                .map(Item::getName)
                .collect(Collectors.toList());

        System.out.println("All item names: " + itemNames);
    }
}
