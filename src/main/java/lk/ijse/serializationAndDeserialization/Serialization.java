package lk.ijse.serializationAndDeserialization;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        User user = new User();

        user.name = "Prabodha";
        user.password = "P1234";
        user.age = 23;

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\prabo\\IdeaProjects\\serialization and deserialization\\serialization\\src\\main\\java\\lk\\ijse\\serialization\\user.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(user);

            fileOutputStream.close();
            objectOutputStream.close();

            System.out.println("Object Serialization successfully >> ");

            long version = ObjectStreamClass.lookup(User.class).getSerialVersionUID();
            System.out.println(version);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}