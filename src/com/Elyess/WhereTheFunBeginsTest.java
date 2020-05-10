package com.Elyess;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.Test;

public class WhereTheFunBeginsTest {

  @Test
  public void mostFrequent() {
    WhereTheFunBegins mostFrequent = new WhereTheFunBegins() ;
    Integer[] characters = new Integer['z' + 1];
    Arrays.fill(characters, 0);
    characters['b'] = 5 ;
    char c = mostFrequent.MostFrequent(characters) ;
    assertEquals('b',c);
  }

  @Test
  public void Read () throws FileNotFoundException {
    WhereTheFunBegins read = new WhereTheFunBegins();
    Integer[] characters = new Integer['z' + 1];
    Arrays.fill(characters, 0);
    characters['a'] = 1 ;
    Scanner scanner = new Scanner(new FileReader("ForTesting.txt"));
    assertEquals( characters,read.count(scanner) );
  }
}

