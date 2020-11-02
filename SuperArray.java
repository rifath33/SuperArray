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
    size = counter;
    return size;
  }

  public int dataLength(){
    return data.length;
  }

  public boolean add(String element){
    data = new String[data.length+1];
    data[data.length-1] = element;
    return (data[data.length-1] == element);
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    data[index] = element;
    return data[index];
  }

  private void resize(){ // resizes by 10
    String[] newArray = new String[data.length+10];
    for(int i = 0; i<data.length; i++){
      newArray[i] = data[i];
    }
    data = newArray;
  }

}
