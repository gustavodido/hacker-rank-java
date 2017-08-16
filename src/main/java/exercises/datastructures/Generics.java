package exercises.datastructures;

import static java.lang.System.out;

public class Generics {

    // Custom Code

    private class Printer {
        <T> void printArray(T[] array) {
            for (T anArray : array) {
                out.println(anArray);
            }
        }
    }

    public void solve() {
        // Given code

        Printer myPrinter = new Printer();

        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};

        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }

}
