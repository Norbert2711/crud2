package com.crud2.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {

    private Long id;
    private String title;
    private String content;
    private String test;

}
