package r9_IO_NIO.programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Valery");
        employees.add("Diana");
        employees.add("Mihail");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("E:\\employees1.bin")
        )

                ){
            outputStream.writeObject(employees);
            System.out.println("Done!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
