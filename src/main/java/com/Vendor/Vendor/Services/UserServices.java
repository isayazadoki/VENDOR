package com.Vendor.Vendor.Services;

import com.Vendor.Vendor.Entity.User;

import java.util.List;

public interface UserServices {
    User createUser(User user);
    User getUserById(Long UserId);
    List<User>getAllUsers();
    User updateUser(User user );
    void deleteUser(Long userId);
}
