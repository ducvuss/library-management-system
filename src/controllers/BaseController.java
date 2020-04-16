package controllers;

import java.io.BufferedReader;
import java.io.FileReader;

public class BaseController {
    public BaseController(String filepath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Failed to read from File");
        }
    }
}