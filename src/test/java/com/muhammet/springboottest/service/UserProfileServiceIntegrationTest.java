package com.muhammet.springboottest.service;

import com.muhammet.springboottest.entity.UserProfile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserProfileServiceIntegrationTest {
    /**
     * IntegrationTest: Gerçek sistemi ayağa kaldırarak test yapar.
     */
    @Autowired
    private UserProfileService userProfileService;

    @Test
    void saveTest(){
        UserProfile userProfile = UserProfile.builder()
                .ad("Bahadır")
                .telefon("0 555 999 8877")
                .adres("İzmir")
                .build();
        boolean isSave = userProfileService.save(userProfile);
        Assertions.assertTrue(isSave);
    }
}
