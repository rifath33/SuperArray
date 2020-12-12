public class SuperArray{
  private String[] data;
  private int size; // the current size

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if(initialCapacity < 0)
    throw new IllegalArgumentException("Initial Capacity cannot be negative.");

    data = new String[initialCapacity];
    size = 0;
  }

  //depends on workign size
  public int size(){
    return size;
  }

  //depends on working size
  public boolean add(String element){
		if (data.length == size) resize();
		data[size] = element;
		size++;
		return true;
  }

  public void add(int index, String element){
    if (index < 0 || index > size())
    throw new IndexOutOfBoundsException("Index " + index + " is out of range.");

    if (data.length == size)
    resize();
		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = element;
		size++;
  }

  public String remove(int index){

    if(index < 0 || index >= size())
    throw new IndexOutOfBoundsException("Index " + index + " is out of range.");
    String memory = get(index);
		for (int i = index; i < size - 1; i++) {
			set(i, get(i+1));
		}
		size--;
		return memory;
  }

  public String get(int index){
    if(index < 0 || index >= size())
    throw new IndexOutOfBoundsException("Index " + index + " is out of range.");
    return data[index];
  }

  public String set(int index, String element){
    if(index < 0 || index >= size())
    throw new IndexOutOfBoundsException("Index " + index + " is out of range.");
    String memory = data[index];
    data[index] = element;
    return memory;
  }

  private void resize(){
    String[] newArray = new String[size()+10];
    for(int i = 0; i < data.length; i++){
      newArray[i] = data[i];
    }
    data = newArray;
  }

  public void clear(){
    String[] newData = new String[size()];
    data = newData;
  }

  public boolean isEmpty(){
    return(size()==0);
  }

  public String toString(){
    String result = "[";
    for(int i = 0; i < size(); i++){
      if(i < size()-1)
      result = result + data[i] + ", ";
      else result = result + data[i];
    }
    return result + "]";
  }

  public boolean contains(String s){
    int counter = 0;
    for(int i = 0; i < size(); i++){
      if( data[i].equals(s) )
      counter++;
    }
    return(counter>0);
  }

  public int indexOf(String s){
    for (int i = 0; i < size(); i ++) {
      if (data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }

  public String[] toArray(){
    String[] result = new String[size()];
    for(int i = 0; i < size(); i++){
      result[i] = get(i);
    }
    return result;
  }

}
