package com.vanzaga.multiclassexample;

import com.vanzaga.multiclassexample.MainClasses.User;
import com.vanzaga.multiclassexample.MainClasses.UserAddress;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataManager implements Serializable {
    private static DataManager instance;
    private List<User> users;
    private List<UserAddress> userAddresses;

    private DataManager() {
        users = new ArrayList<>();
        userAddresses = new ArrayList<>();
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addUserAddress(UserAddress address) {
        userAddresses.add(address);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<UserAddress> getUserAddresses() {
        return userAddresses;
    }
}