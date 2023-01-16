package com.hyomee.observer.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class NewVO {
    private String subject;
    private String  side;
    private String  contents;
}
