package com.luv2code.shool.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ObjectNotFoundException extends RuntimeException{
    private  String message;
    private  String source;
}
