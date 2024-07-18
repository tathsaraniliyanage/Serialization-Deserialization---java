package lk.ijse.serializationAndDeserialization;

import java.io.*;

public class Deserialization {

    public static void main(String [] args) {

        User user = null;

        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream("C:\\Users\\prabo\\IdeaProjects\\serialization and deserialization\\serialization\\src\\main\\java\\lk\\ijse\\serialization\\user.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID: "+serialVersionUID);

        System.out.println("name: " + user.name);
        System.out.println("password: " + user.password);


    }
}
