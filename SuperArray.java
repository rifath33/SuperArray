public class SuperArray{
  private String[] data;
  private int size; // the current size

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  //depends on workign size
  public int size(){
    int counter = 0;
    for(int i = 0; i < data.length; i++){
      if(data[i]!=null)
      counter++;
    }
    size = counter;
    return size;
  }

  //depends on working size
  public boolean add(String element){
    if(size() == data.length)
    resize();

    data[size()] = element;
    return(data[size()-1]==element);
  }

  // public boolean add(int index, String element){
  //
  // }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String memory = data[index];
    data[index] = element;
    return memory;
  }

  private void resize(){
    String[] newArray = new String[size()*size()];
    for(int i = 0; i < data.length; i++){
      newArray[i] = data[i];
    }
    data = newArray;
  }

  public void clear(){
    for(int i = 0; i < size(); i++){
      data[i]=null;
    }
  }

  public boolean isEmpty(){
    size();
    return(size==0);
  }

  public String toString(){
    String result = "[";
    for(int i = 0; i < size(); i++){
      if(i < size()-1)
      result = result + data[i] + ", ";
      else result = result + data[i];
    }
    return result;
  }

}
