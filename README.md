
# Serialization and Deserialization in Java

## <a herf="https://docs.google.com/document/d/14_JW9kPnEoGdL17y2PjVB4Q1896TbodHAPBZmCclz9U/edit?usp=sharing">Visit Refer to my Research Documentation</a>

### Serialization

Serialization in Java refers to the process of converting an object into a format that can be easily stored or transmitted. This format is typically a stream of bytes. Objects that implement the `Serializable` interface can be serialized. This process is useful for tasks such as saving object state to disk or sending objects over a network.

### Example:

```java
import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        
        YourObject object = new User();

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("Your file path to create a Serialization object / your_file_name.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(object);

            fileOutputStream.close();
            objectOutputStream.close();

            System.out.println("Object Serialization successfully >> ");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
```

### Deserialization

Deserialization is the process of reconstructing an object from its serialized state (byte stream). Using `ObjectInputStream`, Java can read serialized objects back into memory. This is essential for tasks such as reading saved objects from disk or receiving objects over a network.

### Example:

```java
import java.io.*;

public class Deserialization {

    public static void main(String [] args) {

        YourObject object = null;

        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream("< Your file path in Object.ser >");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            object = (<YourObject Type>) in.readObject();
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
```

### Key Points:

- **Serializable Interface**: Implement `Serializable` to mark a class as serializable.
- **ObjectOutputStream** and **ObjectInputStream**: Used to serialize and deserialize objects, respectively.
- **Handling Exceptions**: Always handle `IOException` and `ClassNotFoundException` when working with serialization and deserialization.

Serialization and deserialization are fundamental for data persistence and communication between Java applications. They provide a straightforward way to save and retrieve complex object structures.