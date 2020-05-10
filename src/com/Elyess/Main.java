package com.Elyess;

import java.io.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    String text = null ;
    try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("Lab3.txt")) )){
          while (scanner.hasNextLine()) {
            text = scanner.nextLine();
          }
          if (text != null) {
          System.out.println("the first Character in the string is : "+ text.charAt(0));
          }
      } catch (IOException e ){
      e.printStackTrace();
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("String.txt"));
          BufferedWriter IntWriter = new BufferedWriter(new FileWriter("Integer.txt"))){
      Scanner scanner = new Scanner (System.in);
      System.out.println("Please enter the text you want to include in String.txt");
      String input  = scanner.nextLine();
      writer.write(input);
      String IntInput = scanner.nextLine();
      IntWriter.write(IntInput);
    }

  }
}
