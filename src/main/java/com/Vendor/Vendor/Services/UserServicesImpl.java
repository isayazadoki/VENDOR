package com.Vendor.Vendor.Services;

import com.Vendor.Vendor.Entity.User;
import com.Vendor.Vendor.Repository.UserRepository;
import jakarta.transaction.UserTransaction;

import java.util.List;
import java.util.Optional;

public class UserServicesImpl implements UserServices{
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long UserId) {
        Optional<User>optionalUser=userRepository.findById(UserId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existinguisher=userRepository.findById(user.getVendorId()).get();
        existinguisher.setAddress(user.getAddress());
        existinguisher.setCity(user.getCity());
        existinguisher.setCountry(user.getCountry());
        existinguisher.setDeliveryTerms(user.getDeliveryTerms());
        existinguisher.setPricing(user.getPricing());
        existinguisher.setDeliverySchedule(user.getDeliverySchedule());
        existinguisher.setMinimumOrderQuantity(user.getMinimumOrderQuantity());
        existinguisher.setPaymentMethod(user.getPaymentMethod());
        existinguisher.setPostalCode(user.getPostalCode());
        existinguisher.setVendorId(user.getVendorId());
        existinguisher.setProduct(user.getProduct());
        existinguisher.setLeadTime(user.getLeadTime());
        existinguisher.setProvinceState(user.getProvinceState());
        existinguisher.setVendorName(user.getVendorName());
        existinguisher.setQualityStarndard(user.getQualityStarndard());
        existinguisher.setLeadTime(user.getLeadTime());
        User updateUser=userRepository.save(existinguisher);
        return updateUser;

    }

    @Override
    public void deleteUser(Long userId) {

    }
}
