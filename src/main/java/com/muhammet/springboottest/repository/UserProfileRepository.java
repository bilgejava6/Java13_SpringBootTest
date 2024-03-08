package com.muhammet.springboottest.repository;

import com.muhammet.springboottest.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
