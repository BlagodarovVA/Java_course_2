package r4_collection.list_interface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {

        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()){
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reversIterator.hasPrevious()){
            if(iterator.next() != reversIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("String '" + s +  "' is Palindrome: " + isPalindrome);
    }
}
