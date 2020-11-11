public class SuperArray{
  public String[] data;               // this is a field
  private int size; // NEXT AVALIBLE SLOT!!!!!!

  public SuperArray(){
    data = new String[10];
  }

  public void updateSize(){
    int nonNullIndexCounter = 0;
    for (int i = 0;(data[i] != null); i ++){
        nonNullIndexCounter ++;
      }
    size = nonNullIndexCounter;
  }

  public int size(){
    updateSize();
    return size;
  }

  public int dataLength(){
    return data.length;
  }

  public boolean add(String element){
    data[size] = element;
    updateSize();
    return(data[size-1] == element);
  }

  public String get(int index){ // index is within 0–(size-1)
    return data[index];
  }

  // only for replacing old values!
  public String set(int index, String element){ // index is within 0–(size-1)
    data[index] = element;
    return data[index];
  }

  private void resize(){ // resizes by 10
    String[] newArray = new String[data.length * data.length];
    for(int i = 0; i<data.length; i++){
      newArray[i] = data[i];
    }
    data = newArray;
  }

}
