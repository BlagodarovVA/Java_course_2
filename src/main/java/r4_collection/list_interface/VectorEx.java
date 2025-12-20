package r4_collection.list_interface;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Valery");
        vector.add("Diana");
        vector.add("Katya");
        vector.add("Mihail");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(3);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
