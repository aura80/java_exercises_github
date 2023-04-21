package java_exercises_github.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
    public static void main(String[] args) {

        try{
            fileExceptionThrows();
        } catch (FileNotFoundException e) {
            System.out.println(e + " ! ");
        }

        fileExceptionTryCatch();

        multipleException();

        customTryCatchFinally();

    }

    // checked exception with throws
    private static void fileExceptionThrows() throws FileNotFoundException {
        File file = new File("exercises_file.txt");
        FileInputStream inputStream = new FileInputStream(file);
    }

    // checked exception with try - catch
    private static void fileExceptionTryCatch() {
        File file = new File("exercises_file2.txt");

        try {
            FileInputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(e + " !!");
        }
    }

    // checked exception with multiple exceptions
    private static void multipleException() {
        File file = new File("exercises_file3.txt");

        try {
            FileInputStream inputStream = new FileInputStream(file);
            Thread.sleep(15);
            new FileReader("exercises_file3.txt");
        } catch (InterruptedException | FileNotFoundException e) {
            System.out.println(e + " !!!");
        }
    }

    // checked exception with custom exception and try-catch-finally block
    private static void customTryCatchFinally() {
        File file = new File("abc.txt");
        if (!file.isFile()) {
            try {
                throw new FileIncorrectCustomException("    Not a file !");
            } catch (FileIncorrectCustomException e) {
                System.out.println(e);
            } finally {
                System.out.println("Cleanup operations!");
            }
        }
    }
}
