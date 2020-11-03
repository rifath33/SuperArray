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

  public int dataLength(){
    return data.length;
  }

  public boolean add(String element){
    if(size<=data.length-1){
    data[size] = element;
    size++;
    }
    else{
      resize();
      data[size] = element;
      size++;
    }

    return (data[size-1] == element);

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

  public boolean isEmpty(){
    return (size()==0);
  }

  public void clear(){
    size = 0;
    data = new String[10];
  }

  public String toString(){
    String result = "";
    return result;
    // working on it
  }

  public boolean contains(String s){
    int counter = 0;
    for(int i = 0; i < data.length; i++){
      if(data[i].equals(s))
      counter++;
    }
    return(counter>0);
  }

}
