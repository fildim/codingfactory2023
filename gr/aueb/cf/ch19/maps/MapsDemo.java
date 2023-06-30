package gr.aueb.cf.ch19.maps;

import gr.aueb.cf.ch19.sorting.Product;

import java.util.*;
import java.util.stream.Collectors;

public class MapsDemo {

    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>(){{
            put("GR", "Greece");
            put("FR", "France");
            put("USA", "United States Of America");
        }};

        Map<String, String> countries2 = Map.of("Gr" , "Greece", "Fr", "France");

        Map<Integer, Product> products = new HashMap<>() {{
           put(1, new Product("Apples", 10.5, 10));
           put(2, new Product("Oranges", 8.5, 8));
           put(3, new Product("Milk", 12.5, 15));
           put(4, new Product("Apples", 5.5, 5));
        }};

        Map<String, Object> criteria = new HashMap<>() {{
            put("description", "Oranges");
            put("price", 8.5);
        }};

        String choice = products.values().stream()
                .filter(product -> product.getDescription().equals(criteria.get("description"))
                        && (Double.compare(product.getPrice(), (double) criteria.get("price"))) >= 0 )
                .map(Product::toString)
                .collect(Collectors.joining(" , "));

        String strProducts =products.entrySet().stream()
                .filter(entry -> entry.getValue().getDescription().equals("Apples"))
                .map(Object::toString)
                .collect(Collectors.joining(" , "));


//        countries.put("GR", "Greece");
//        countries.put("FR", "France");
//        countries.put("USA", "United States Of America");

        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        countries.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
