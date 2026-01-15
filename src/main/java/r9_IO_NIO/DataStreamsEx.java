package r9_IO_NIO;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        try(DataOutputStream outputStream = new DataOutputStream
                (new FileOutputStream("E:\\f_my_test.bin"));
            DataInputStream inputStream = new DataInputStream
                    (new FileInputStream("E:\\f_my_test.bin"));
            ){
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1_000_000L);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(123.456);
            outputStream.writeUTF("Hello moto!");

            // порядок имеет значение
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readUTF());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
