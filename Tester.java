public class Tester{
  public static void main(String[] args){

    SuperArray Rifath = new SuperArray();
    System.out.println(Rifath.add("kutha"));
    System.out.println(Rifath.add("hello"));
    System.out.println(Rifath.add("kutha"));
    System.out.println(Rifath.add("hello"));
    System.out.println(Rifath.add("kutha"));
    System.out.println(Rifath.add("hello"));
    System.out.println(Rifath.add("kutha"));
    System.out.println(Rifath.add("hello"));
    System.out.println(Rifath.add("kutha"));
    System.out.println(Rifath.add("hello"));
    System.out.println(Rifath.dataLength());
    System.out.println(Rifath.add("kutha"));
    System.out.println(Rifath.dataLength());

    System.out.println("Mr. K's test.... _______");

    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }

  }
}
