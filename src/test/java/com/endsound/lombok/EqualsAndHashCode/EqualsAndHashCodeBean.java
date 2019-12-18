package com.endsound.lombok.EqualsAndHashCode;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class EqualsAndHashCodeBean {
    private String name;
    private Integer age;
}
