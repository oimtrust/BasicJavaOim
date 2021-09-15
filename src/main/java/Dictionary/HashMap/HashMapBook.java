package Dictionary.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBook {
    public static void main(String[] args) {
        HashMap<String, Book> books = new HashMap<>();

        Book javaBook   = new Book("Tutorial Java", "Cilcy Book");
        Book qaBook     = new Book("Tutorial Automation Test", "Cilcy Book");
        Book devBook    = new Book("Tips & Trik menjadi developer yang baik", "SekolahQA");

        books.put("java", javaBook);
        books.put("qa", qaBook);
        books.put("dev", devBook);

        for (Map.Entry b : books.entrySet()) {
            Book book = (Book) b.getValue();
            System.out.println(b.getKey() + ": " + book.getTitle());
        }
    }
}
