package com.Vendor.Vendor.Controller;

import com.Vendor.Vendor.Entity.User;
import com.Vendor.Vendor.Services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/c")
public class UserController {
    private UserServices userServices;
    //buid create   User Rest API
    @PostMapping
    public ResponseEntity<User>createUser(@RequestBody User user){
        User savedUser=userServices.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    //build get User by id REST API
    //http://localhost:8080/api/VendorUser/1
    @GetMapping("{id}")
    public  ResponseEntity<User>getAllUserById(@PathVariable("id")Long userId){
        User user =userServices.getUserById(userId);
        return new ResponseEntity<>(user,HttpStatus.OK);

    }
    //Build Update user REST API
    @PutMapping("{id}")
    //http://localhost:8080/api/VendorUser/1
    public ResponseEntity<User>updateUser(@PathVariable("id")Long userId,@RequestBody User user){
        user.setVendorId(userId);
        User updatedUser=userServices.updateUser(user);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);
    }
    // Build Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteUser(@PathVariable("id") Long userId){
        userServices.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted!",HttpStatus.OK);
    }


}
