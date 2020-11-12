public class SuperArray{
  public String[] data;               // this is a field
  private int size; // NEXT AVALIBLE SLOT!!!!!!

  public SuperArray(){
    data = new String[10];
  }

  public void sizeUpdater(){
    int nonNullIndexCounter = 0;
    for (int i = 0; i < data.length; i ++){
        if(data[i]!=null)
        nonNullIndexCounter ++;
      }
    size=nonNullIndexCounter;
  }

  public int size(){
    sizeUpdater();
    return size;
  }

  public int dataLength(){
    return data.length;
  }

  public boolean add(String element){
    if(size == data.length){
      resize();
      add(element);
    }
    else data[size] = element;
    return(data[size] == element);
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



}
