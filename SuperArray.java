public class SuperArray{
  private String[] data;               // this is a field
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
      data[size]=(element);
    }
    else data[size] = element;
    updateSize();
    return(data[size-1].equals(element));
  }

  public String get(int index){ // index is within 0–(size-1)
    updateSize();
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " is out of range");
    }

    return data[index];
  }

  // only for replacing old values!
  public String set(int index, String element){ // index is within 0–(size-1)
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " is out of range");
    }

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

  public SuperArray(int initialCapacity){
    if(initialCapacity < 0){
    throw new IllegalArgumentException("InitialCapacity " + initialCapacity
    + " cannot be negative");
    }

    data = new String[initialCapacity];

  }

  public void add(int index, String element){
    updateSize();

    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Index " + index + " is out of range");
    }

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

    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " is out of range");
    }

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

  public int indexOf(String s){
    updateSize();
    int indexCounter = -1;
    int isPresent = 0;
    for(int i = 0;( (i < size) && (isPresent != 1) ); i++){
      indexCounter++;
      if(data[i].equals(s))
      isPresent = 1;
    }
    if(isPresent == 0)
    indexCounter = -1;
    return indexCounter;
    }

    public String[] toArray(){
      updateSize();
      String[] result = new String[size];
      for(int i = 0; i<size; i++){
        result[i] = data[i];
      }
      return result;
    }

    public int lastIndexOf(String value){
      updateSize();
      int indexCounter = -1;
      int isPresent = 0;
      for(int i = size-1;( (i > -1) && (isPresent != 1) ); i--){
        indexCounter=i;
        if(data[i].equals(value))
        isPresent = 1;
      }
      if(isPresent == 0)
      indexCounter = -1;
      return indexCounter;
    }

    public boolean equals(SuperArray other){
      String workingString = toString();
    return( workingString.equals(other.toString()) ) ;

    }

}
