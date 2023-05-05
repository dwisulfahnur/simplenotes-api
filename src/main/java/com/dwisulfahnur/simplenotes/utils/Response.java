package com.dwisulfahnur.simplenotes.utils;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Response<T> {
    private String message;
    private T data;
}
