package com.muhammet.springboottest.controller;

import com.muhammet.springboottest.entity.UserProfile;
import com.muhammet.springboottest.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping("/add-user")
    public ResponseEntity<Boolean> addUser(String ad, String adres, String telefon){
        UserProfile userProfile = UserProfile.builder()
                .ad(ad)
                .adres(adres)
                .telefon(telefon)
                .build();
        boolean isSave = userProfileService.save(userProfile);
        return ResponseEntity.ok(isSave);
    }
}
