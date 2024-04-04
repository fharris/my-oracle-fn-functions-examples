package com.example.fn;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;

public class HelloFunction {


   /*  Sachin Pikle example!  */

    private String fileName = "/tmp/mytextfileintmp.txt";
    
    public String handleRequest(String input) throws Exception{
        System.out.println("Entered Java File write/read example");
        String name = (input == null || input.isEmpty()) ? "world"  : input;
        writeToFile(name);
        String nameFromFile = readFromFile();
        return "NameFromFile=" + nameFromFile + "!";
    }

    private void writeToFile(String str) throws IOException {
        System.out.println("Entered writeToFile(" + str + ")");
        Path path = Paths.get(fileName);

        Files.write(path, str.getBytes());

    }

    private String readFromFile() throws IOException {
        System.out.println("Entered readFromFile()");
        Path path = Paths.get(fileName);

        String read = Files.readAllLines(path).get(0);
        System.out.println("Value from file " + read);
        return read;

    }




}