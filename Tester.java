import java.io.*;
import java.util.*;

public class Tester{
  public static void main(String[] args){

    SuperArray words = new SuperArray();
    System.out.println(words.size());
    words.add("I");
    words.add("am");
    words.add("Rifath");
    words.add("Hossain");
    words.add("Kutha");
    System.out.println(words.size());
    System.out.println(words.toString());

    System.out.println(Arrays.toString(words.data));

    System.out.println("_____________________________________________________");

    // you can use dataLength() to help you debug




  }
}
