public class SuperArray{
  private String[] data;               // this is a field
  private int size; //The current size  // this is a field

  public SuperArray(){
    data = new String[10];
  }

  public int size(){
    int counter = 0;
    for (int i = 0; i < data.length; i ++)
        if (data[i] != null)
        counter ++;
    return counter;
  }

  public boolean add(String element){
    data[data.length-1] = element;
    return(data[data.length-1] == element);
  }

}
