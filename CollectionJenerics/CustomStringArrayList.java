package CollectionJenerics;

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private final int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        size = 10;
        capacity = 10;
        elements = new String[capacity];
    } // CustomStringArrayList(int, int, String[]) constructor

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        } // for

    } // main(String[]) method

    public void add(String s) {
            Arrays.fill(elements, s);
            if(size == capacity) {
                grow();
            }
//        System.out.println(Arrays.toString(elements));
    } // add(String) method

    private void grow(){
        size = (int) (1.5 * capacity);
        String[] arr = new String[size];
        elements = arr;
        System.out.println(arr.toString());
    } // grow() method

} // MyArrayListDemo class