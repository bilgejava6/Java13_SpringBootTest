package com.muhammet.springboottest.service;

import com.muhammet.springboottest.entity.UserProfile;
import com.muhammet.springboottest.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository repository;

    public boolean save(UserProfile userProfile){
        List<UserProfile> userList = repository.findAll();
        Optional<UserProfile> optionalUserProfile =  userList.stream()
                .filter(x-> x.getAd().equalsIgnoreCase(userProfile.getAd()))
                .findAny();
        if(optionalUserProfile.isPresent())
            throw  new RuntimeException("Bu Kullanıcı zaten kayıtlıdır");
        repository.save(userProfile);
        return true;
    }


}
