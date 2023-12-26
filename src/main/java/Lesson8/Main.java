package Lesson8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static class MyCustomUncheckedException extends RuntimeException {
        public MyCustomUncheckedException(String message, Throwable cause) {
            super(message, cause);
        }

        public static void myHomeWork() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("testfile.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "IOException occurred: " + e.getMessage(), e);
                throw new MyCustomUncheckedException("My custom unchecked exception occurred.", e);
            }
        }

        public static void main(String[] args) {
            myHomeWork();
        }
    }
}


