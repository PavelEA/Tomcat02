package dev.PavelEA.tomcat01.servlet;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String,User> users = new HashMap<>();

    public void save(User user){
        users.put(user.getUsername(), user);
    }
    public User fetchByUsername(String username){
        return users.get(username);
    }
    public boolean isExists(String username){
        return users.containsKey(username);
    }
}
