package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(y == 0){
                throw new WrongInputPassedException("My own exception");
            }

            System.out.println(x / y);

            File file = new File("filename");
            FileReader fileReader = new FileReader(file);
            fileReader.read();
        }
        catch (ArithmeticException e){
            System.out.println("Got Arithmetic Exception");
        }
        catch(FileNotFoundException e){
            System.out.println("Got FileNotFoundException");
        }
        catch(Exception e){
            System.out.println("Got general exception");
        }

        finally {
            System.out.println("finally block");
        }

        System.out.println("After all the catch blocks");
    }
}
