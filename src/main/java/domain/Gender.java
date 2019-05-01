package domain;

import lombok.Getter;

@Getter
public enum Gender {

    MALE("MALE"),
    FEMALE("FEMALE");

    String gender;

    Gender(String gender) {
        this.gender = gender;
    }
}
