package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterVSFileWriter {

    public static void main(String[] args) {
        //creating object of class File using path - is not the same as creating file
        File filePrintWriter = new File("printwriter.txt");
        File fileFileWriter = new File("filewriter.txt");

        String newLine = System.getProperty("line.separator");

        try  {
            //creating object of PrintWriter class with File object as parameter
            PrintWriter  printWriter = new PrintWriter(filePrintWriter);
            //using methods and close write inherrited from parent Writer

            //print string and then terminate the line
            printWriter.println("I love Java");
            //method to terminate the current line by writing the line separator string

            //print an integer and then terminate the line
            printWriter.println(100);

            //print a floating-point number and then terminate the line
            printWriter.println(10.5);

            //print a boolean value and then terminate the line
            printWriter.println(true);
            //unicode character for
            //printWriter.append('\u263A');
            //printWriter.println();
            //printWriter.append('\u27FF');
            //printWriter.println();
            //ASCII
            //printWriter.write(33);
            //printWriter.println();
            //method to write a formatted string to this writer using the specified format string and arguments
            //printWriter.printf("My name is %s", "Awesome!");


            /*Closes the stream and releases any system resources associated with it. It needs to be done
            to flush buffer*/

            printWriter.close();


            //creating object of FileWriter class with File object as parameter
            //FileWriter fileWriter =  new FileWriter(fileFileWriter);
            //using method write and close obtained throw multilevel inheritance from Writer

            /*Closes the stream and releases any system resources associated with it.It needs to be done
            to flush buffer*/

            //fileWriter.write("I love Java");

            //fileWriter.write(65);
            //fileWriter.write(10.5);
            //fileWriter.write(true);
            //fileWriter.append(newLine).append('\u263A').append(newLine).append('\u270C').append(newLine);
            //fileWriter.append(newLine).append('\u27FF');
            //fileWriter.write(33);
            //fileWriter.write(10);
            //format() method of String class returns a formatted string using the specified format string and arguments
            //fileWriter.append(String.format("My name is %s", "Awesome!"));

            //fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
