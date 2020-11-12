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
    words.add("there ever");
    words.add("was");
    System.out.println(words.toString());
    System.out.println(Arrays.toString(words.data));
    System.out.println(
    (Arrays.toString(
    words.toArray()
    ))
    );
    System.out.println(words.size());
    words.remove(6);
        System.out.println(words.toString());
    // MAKE data PRIVATE when you're done!!!!!

    System.out.println("_____________________________________________________");


  }
}
