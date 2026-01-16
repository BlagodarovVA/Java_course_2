package r9_IO_NIO.programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Audi Q7", "grey");
        Employee employee = new Employee("Mariya", "IT", 28, 500, car);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("E:\\employees2.bin")
        )){
            outputStream.writeObject(employee);
            System.out.println("Done!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
