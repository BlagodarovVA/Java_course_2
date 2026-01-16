package r9_IO_NIO.programmer2;

import r9_IO_NIO.programmer1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee bestEmployee;

        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("E:\\employees2.bin"))
        ) {
            bestEmployee = (Employee) inputStream.readObject();
            System.out.println(bestEmployee);
            System.out.println("Deserialization done!");

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
