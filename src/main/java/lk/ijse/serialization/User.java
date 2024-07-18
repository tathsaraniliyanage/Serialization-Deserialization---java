package lk.ijse.serialization;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;
    int age;

    public String getUser() {
        return "name : "+name+"\npassword : "+password+"\nage : "+age;
    }
}
