package com.Vendor.Vendor.Repository;

import com.Vendor.Vendor.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
