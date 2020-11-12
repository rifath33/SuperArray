import java.io.*;
import java.util.*;

public class Tester{
  public static void main(String[] args){

    SuperArray words = new SuperArray();

    words.add("I");
    words.add("am");
    words.add("Rifath");
    words.add("Hossain");
    words.add("the greatest");
    System.out.println(words.toString());
    System.out.println(Arrays.toString(words.data));

    System.out.println(words.remove(2));
    System.out.println(words.toString());
    System.out.println(Arrays.toString(words.data));

    System.out.println(words.remove(3));
    System.out.println(words.toString());
    System.out.println(Arrays.toString(words.data));

    // System.out.println(words.remove(1));
    // System.out.println(words.toString());
    // System.out.println(Arrays.toString(words.data));

    // MAKE data PRIVATE when you're done!!!!!

    System.out.println("_____________________________________________________");

  }
}
