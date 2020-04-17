import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;

import controllers.BaseController;
import database.Database;
import models.Book;

public class App {

    public static void main(String[] args) throws IOException {

        String filepath = "resources/inputfiles/books.csv";

        System.out.println("test".hashCode());
        System.out.println("test".hashCode());

        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println(hashMap.get("test"));
        hashMap.put("test", 2);
        System.out.println(hashMap.get("test"));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("1", "Test", "1", "1"));
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("resources/books"))) {
            stream.writeObject(books);
        } catch (Exception ex) {
            System.out.println("Failed to write data");
        }

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream("resources/books"))) {
            ArrayList<?> booksResult = (ArrayList<?>) stream.readObject();
            for (Object item : booksResult) {
                Book book = (Book) item;
                System.out.println(book.getTitle());
            }
            // System.out.println(booksResult.get(0).getTitle());
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Failed to read data");
        }
 
    }
}