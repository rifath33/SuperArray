import java.io.*;
import java.util.*;

public class Demo{

  public static void removeDuplicates(SuperArray s){
    String[] clone = s.toArray();

    for(int i = 0; i < clone.length; i++){
      for(int f = clone.length-1; f>i; f--){
        if((clone[f]).equals(clone[i]))
        clone[f] = "duplicate";
      }
      //clone = s.toArray()
    }

    for(int i = clone.length-1; i > 0; i--){
      if(clone[i].equals("duplicate"))
      s.remove(i);
    }

  }

  // public static SuperArray findOverlap(SuperArray a, SuperArray b){
  //
  // }
  //
  // public int lastIndexOf(String s){
  //   for(int i = s.data)
  // }


  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }

}
