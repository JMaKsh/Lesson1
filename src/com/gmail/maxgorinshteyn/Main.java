package com.gmail.maxgorinshteyn;

import java.lang.reflect.*;

public class Main{

    public static void main(String[] args) {

        Class testclass = Test.class;
        Method[] methods = testclass.getDeclaredMethods();
        for (Method method : methods) {
            try {
                if (method.isAnnotationPresent(TestAnnotation.class)) {
                    TestAnnotation tan = method.getAnnotation(TestAnnotation.class);
                    method.invoke(null, tan.param1(), tan.param2());
                }
                else {
                    method.invoke(null);
                }
                }catch(IllegalAccessException | InvocationTargetException e){
                    System.out.println("Something goes wrong");
                }
            }

        }
    }


