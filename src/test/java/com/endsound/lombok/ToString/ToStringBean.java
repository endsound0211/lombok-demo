package com.endsound.lombok.ToString;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ToStringBean {
    private String name;
    private Integer age;
}
