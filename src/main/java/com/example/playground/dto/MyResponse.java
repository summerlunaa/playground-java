package com.example.playground.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@Jacksonized
@Builder
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MyResponse {
    @Getter(AccessLevel.NONE)
    boolean isGood;

    public Boolean getIsGood() {
        return isGood;
    }
}
