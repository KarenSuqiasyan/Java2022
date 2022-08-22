package Lesson5DinamicArray;

public class DynamicArrayList<T> {
    private Object[] array = (T[]) new Object[1];
    private int count = 0;
    private int arraySize = 1;
    public int getCount() {
        return count;
    }
    public int getArraySize() {
        return arraySize;
    }
    public Object[] getArray() {
        return array;
    }
    public void addElement(T a) {
        if (count == arraySize) {
            createNewArray();
        }
        array[count] = a;
        count++;
    }
    public void createNewArray() {
        Object[] newArray;
        newArray = new Object[arraySize * 2];
        {
            for (int i = 0; i < arraySize; i++) {
                newArray[i] = array[i];
            }
        }
        array = (T[]) newArray;
        arraySize = arraySize * 2;
    }
}
