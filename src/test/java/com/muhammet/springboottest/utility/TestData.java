package com.muhammet.springboottest.utility;

import com.muhammet.springboottest.entity.UserProfile;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    public static UserProfile GET_ONE_USER(){
        return UserProfile.builder()
                .id(1L)
                .ad("Muhammet")
                .adres("Ankara")
                .telefon("0 55 999 87")
                .build();
    }

    public static List<UserProfile> GET_ALL(){
        List<UserProfile> userProfileList = new ArrayList<>();
        userProfileList.add(UserProfile.builder().id(1L).ad("Muhammet").adres("Ankara").telefon("0 555 666 9777").build());
        userProfileList.add(UserProfile.builder().id(2L).ad("Demet").adres("İzmir").telefon("0 444 666 9777").build());
        userProfileList.add(UserProfile.builder().id(3L).ad("Hakan").adres("Ankara").telefon("0 888 666 9777").build());
        userProfileList.add(UserProfile.builder().id(4L).ad("Tahsin").adres("Bursa").telefon("0 543 666 9777").build());
        userProfileList.add(UserProfile.builder().id(5L).ad("Ayşe").adres("Samsun").telefon("0 542 666 9777").build());
        return userProfileList;
    }
}
