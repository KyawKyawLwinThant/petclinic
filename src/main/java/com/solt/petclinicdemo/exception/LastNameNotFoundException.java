package com.solt.petclinicdemo.exception;

public class LastNameNotFoundException extends RuntimeException {
  public LastNameNotFoundException(String name){
    super(name);
  }
}
