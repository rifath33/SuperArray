import java.io.*;
import java.util.*;

public class Demo{

  public static void removeDuplicates(SuperArray s){
    String[] clone = s.toArray();

    for(int i = 0; i < clone.length; i++){
      for(int f = clone.length-1; f>i; f--){
        if((clone[f]).equals(clone[i]))
        s.data[f] = "duplicate";
      }
      //clone = s.toArray()
    }

    for(int i = clone.length-1; i > 0; i--){
      if(s.data[i].equals("duplicate"))
      s.remove(i);
    }

  }

// [kani, uni, ebi, una, una, ebi, kani, una, una, ebi, toro]
// [kani, uni, ebi, una, una, ebi, una, una, ebi, toro]
// [kani, uni, ebi, una, una, ebi, una, una, ebi, toro]


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
