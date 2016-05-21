package com.gmail.maxgorinshteyn;

import java.lang.annotation.*;

@Target(value=ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    int param1();
    int param2();
}
