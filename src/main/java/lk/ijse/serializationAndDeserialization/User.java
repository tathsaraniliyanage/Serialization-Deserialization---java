package lk.ijse.serializationAndDeserialization;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;
    transient int age;

    public String getUser() {
        return "name : "+name+"\npassword : "+password+"\nage : "+age;
    }
}
