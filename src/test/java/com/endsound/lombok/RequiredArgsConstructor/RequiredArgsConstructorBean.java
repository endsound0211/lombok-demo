package com.endsound.lombok.RequiredArgsConstructor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class RequiredArgsConstructorBean {
    private final String name;
    private Integer age;
}
