import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Ingo");

        // This does not work, you can't make lists from primitives:
        // ArrayList<int> intArrayList = new ArrayList<int>();

        // So you would have to do something like this (a wrapper class for int):
        ArrayList<IntClass> intArrayList = new ArrayList<>();
        intArrayList.add(new IntClass(54));

        // But there is always a Java built in wrapper class for that:
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(Integer.valueOf(i));
        }

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(i + " --> " + integers.get(i).intValue());
        }

        // Or with unboxing:
        ArrayList<Integer> integers2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers2.add(i);
        }

        for (int i = 0; i < integers2.size(); i++) {
            System.out.println(i + " --> " + integers2.get(i));
        }

        Integer myIntValue = 56; // = Integer.valueOf(56);
        int myInt = myIntValue; // = myIntValue.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10 ; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            System.out.println(i + " --> " + myDoubleValues.get(i));
        }
    }
}
