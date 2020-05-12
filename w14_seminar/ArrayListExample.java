import java.util.ArrayList;

public class ArrayListExample {
        public static void main(String[] args) {
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                arrayList.add(1);
                arrayList.add(2);
                System.out.println(arrayList.size()); // 2

                arrayList.add(3);
                arrayList.add(4);
                // loend: 1, 2, 3, 4
                System.out.println(arrayList.size()); // 4

                System.out.println(arrayList.get(1)); // 2 (value is found by index)

                arrayList.remove(1); // element with given index is removed
                // The rest of the list is shifted:
                // List: 1, 3, 4

                arrayList.add(1, 2); // Adding value 2 into the index 1.
                // All elements are again shifted:
                // List: 1, 2, 3, 4

                arrayList.set(1, 7); // Switching the value of the given index:
                // List: 1, 7, 3, 4

                arrayList.clear(); // Clear the entire list

                // loome arrayList'i elementidega 1..10
                for (int i = 0; i < 10; i++) {
                        arrayList.add(i + 1);
                }

                // Printing out the values of list.
                for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println(arrayList.get(i));
                }
        }
}
