public class SuperArray{
  public String[] data;               // this is a field
  private int size; // NEXT AVALIBLE SLOT!!!!!!

  public SuperArray(){
    data = new String[10];
  }

  public void updateSize(){
    int nonNullIndexCounter = 0;
    for (int i = 0; i < data.length; i ++){
        if(data[i]!=null)
        nonNullIndexCounter ++;
      }
    size=nonNullIndexCounter;
  }

  public int size(){
    updateSize();
    return size;
  }

  public int dataLength(){
    return data.length;
  }

  public boolean add(String element){
    updateSize();
    if(size == data.length){
      resize();
      add(element);
    }
    else data[size] = element;
    updateSize();
    return(data[size-1].equals(element));
  }

  public String get(int index){ // index is within 0–(size-1)
    return data[index];
  }

  // only for replacing old values!
  public String set(int index, String element){ // index is within 0–(size-1)
    data[index] = element;
    return data[index];
  }

  private void resize(){
    String[] newArray = new String[data.length * data.length];
    for(int i = 0; i<data.length; i++){
      newArray[i] = data[i];
    }
    data = newArray;
  }

  public void clear(){
    for(int i = 0; i<data.length; i++){
      data[i] = null;
    }
    updateSize();
  }

  public boolean isEmpty(){
    updateSize();
    return(size ==0);
  }

  public String toString(){
    updateSize();

    String result = "[";
    for(int i = 0; i < size; i++){
      if(i < size-1)
      result = result + data[i] + ", ";
      else result = result + data[i];
    }
    result = result + "]";
    return result;
  }

  public boolean contains(String s){
    updateSize();
    int counter = 0;
    for(int i = 0; i<size; i++){
      if(data[i].equals(s))
      counter++;
    }
    return(counter > 0);
  }

  public void add(int index, String element){
    updateSize();

    if(data[index] != null){ // if there's text there...

      if(index <= size-1){
      for(int i = size; i>index-1; i--){
        data[i] = data[i-1]; // shift it all to the right!
      }
      data[index] = element; // and put element where you want it
      updateSize();
      }

    }
    else{ // if there is no text there...
      data[index] = element;
    }

  }

  public String remove(int index){
    updateSize();
    String memory = data[index];
    if(index == size-1){
    data[index] = null;
    for(int i = index; i+1<size; i++){
      data[i] = data[i+1];
    }
    }
    else{
      if(index < size-1){
        data[index] = null;
        for(int i = index; i+1<size+1; i++){
        data[i] = data[i+1];
      }
      data[size] = null;
      updateSize();
    }
    }
    updateSize();
    return memory;
  }

}
