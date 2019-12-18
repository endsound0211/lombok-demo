package com.endsound.lombok.Builder;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class BuilderBean {
    private String name;
    private Integer age;
    @Singular("phone")
    private List<String> phone;
}
