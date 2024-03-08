package com.muhammet.springboottest.service;

import com.muhammet.springboottest.entity.UserProfile;
import com.muhammet.springboottest.repository.UserProfileRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.muhammet.springboottest.utility.TestData.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class UserProfileServiceTest {
    /**
     * UnitTest: sadece methodd içinde yazılan kodun, dış etmenlerden
     * bağımsız kontrol edildiği durumdur.
     */
    @InjectMocks
    private UserProfileService userProfileService;
    @Mock
    private UserProfileRepository repository;

    @Test
    void savedUserAndThrowException() {
        UserProfile user = UserProfile.builder()
                .id(5L)
                .telefon("0 555 999 8887")
                .ad("Muhammet")
                .adres("Ankara")
                .build();
        when(repository.findAll()).thenReturn(GET_ALL());
        Exception exception =
                assertThrows(RuntimeException.class,()-> userProfileService.save(user));
        assertEquals("Bu Kullanıcı zaten kayıtlıdır", exception.getMessage());

    }

    @Test
    void saveUser(){
        UserProfile user = UserProfile.builder()
                .id(5L)
                .telefon("0 555 999 8887")
                .ad("Zeki")
                .adres("Ankara")
                .build();
        when(repository.findAll()).thenReturn(GET_ALL());
        boolean isSave = userProfileService.save(user);
        assertTrue(isSave);
    }
}