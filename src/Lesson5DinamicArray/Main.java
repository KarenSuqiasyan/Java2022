package Lesson5DinamicArray;

public class Main {

    public static void main(String[] args) {

        DynamicArrayList<String> dynamicArrayList = new DynamicArrayList();

        dynamicArrayList.addElement("12");
        dynamicArrayList.addElement("22");
        dynamicArrayList.addElement("35");
        dynamicArrayList.addElement("dghj");
        dynamicArrayList.addElement("dghj");

        for (int i = 0; i < dynamicArrayList.getArraySize(); i++) {
            System.out.print(dynamicArrayList.getArray()[i] + " ");
        }
        System.out.println();
        System.out.println("array size " + dynamicArrayList.getArraySize());
        System.out.println("number of elements " + dynamicArrayList.getCount());

    }
}
