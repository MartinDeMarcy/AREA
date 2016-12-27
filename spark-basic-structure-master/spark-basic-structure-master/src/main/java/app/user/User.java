package app.user;

import lombok.*;

@Value // All fields are private and final. Getters (but not setters) are generated (https://projectlombok.org/features/Value.html)
public class User {
    String username;
    String salt;
    String hashedPassword;
    
    public User(String name, String s, String h)
    {
        username = name;
        salt = s;
        hashedPassword = h;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getSalt()
    {
        return salt;
    }
    
    public String getHashedPassword()
    {
        return hashedPassword;
    }
}
