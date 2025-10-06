package com.dcl.accommodate.repository;

import com.dcl.accommodate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


public interface UserRepo extends JpaRepository<User, UUID> {
}
