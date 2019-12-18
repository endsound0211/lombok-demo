package com.endsound.lombok.With;

import lombok.Data;
import lombok.With;

@Data
public class WithBean {
    @With
    private final String name;
    private final Integer age;
}
