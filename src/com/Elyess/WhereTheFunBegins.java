package com.Elyess;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WhereTheFunBegins {

  static String text = null;
  private static Object FileReader;

  public static void main(String[] args) throws IOException {

  Scanner reader = new Scanner(System.in) ;
  try {
     reader = new Scanner(new FileReader("Lab3.txt"));
  } catch (IOException e) {
    e.printStackTrace();
  }

  write("frequency.txt",count(reader));
  System.out.println("the most frequent character is : "+ MostFrequent(count(reader)));
  outputHisto(count(reader));
}

public static void write (String s, Integer[] a){
  try (BufferedWriter writer = new BufferedWriter(new FileWriter(s))){
    char c ;
    for (c = 'a' ; c <= 'z' ; ++c) {
      writer.write(c + ": " + a[c] + "\n");
    }
  } catch (IOException e) {
    e.printStackTrace();
  }
}



public static Integer[] count (Scanner reader) {
  Integer[] characters = new Integer['z' + 1];
  Arrays.fill(characters,0);
  try {
    while (reader.hasNextLine()) {
      text = reader.nextLine();
    }
  
   
    for (int i = 0; i < text.length(); i++) {
      String lowerCased= text.toLowerCase();
      characters[lowerCased.charAt(i)]++ ;
    }
    return characters ;
    } finally {
    //do something
    }
}
public static char MostFrequent (Integer[] array) {
  int max= 0 ;
  char maxChar = 'a' ;
  for (char c = 'a' ; c <= 'z' ; ++c ) {
    if (array [c] > max ) {
      max = array [c] ;
      maxChar = c ;
    }
  }
  return maxChar ;
}

public static void outputHisto (Integer [] array) {
  for (char c = 'a' ; c <= 'z' ; ++c ){
    if (array[c] != 0) {
      System.out.print(c+ ": ");
      for (int i= 0; i<array[c] ; i++){
        System.out.print("*");
      }
      System.out.println();
    }
    }

}

}
