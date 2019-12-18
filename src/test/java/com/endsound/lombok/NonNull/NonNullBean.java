package com.endsound.lombok.NonNull;

import lombok.NonNull;

public class NonNullBean {
    private String name;

    public NonNullBean(@NonNull String name){
        this.name = name;
    }
}
