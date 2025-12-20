package r4_collection.list_interface;

import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Valery");
        stack.push("Diana");
        stack.push("Misha");
        stack.push("Katya");
        System.out.println(stack);

        System.out.println(stack.pop());    // возвращаем последний элемент и удаляем
        System.out.println(stack);

        // если стек пуст, то будет исключение, поэтому проверка
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println(stack);

        }

        stack.push("Valery");
        stack.push("Diana");
        stack.push("Misha");
        stack.push("Katya");
        System.out.println(stack.peek());       // вывод верхнего (последнего) элемента без удаления
        System.out.println(stack);

    }
}
