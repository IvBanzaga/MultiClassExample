package com.vanzaga.multiclassexample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.vanzaga.multiclassexample.MainClasses.User;
import com.vanzaga.multiclassexample.MainClasses.UserAddress;

public class DataManager implements Serializable {
    private List<User> users;
    private List<UserAddress> userAddresses;

    public DataManager() {
        users = new ArrayList<>();
        userAddresses = new ArrayList<>();
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