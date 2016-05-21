package com.gmail.maxgorinshteyn;

 public class Test {

     @TestAnnotation(param1 = 4,param2 = 3)
     public static void annotatedTest1(int a, int b){
         System.out.println("Annotated method1: a="+a+", b="+b);

     }
     public static void nonannotatedTest(){
         System.out.println("NonAnnotated method");
     }

     @TestAnnotation(param1 = 2,param2 = 5)
     public static void annotatedTest2(int a, int b){
         System.out.println("Annotated method2: a="+a+", b="+b);
     }
 }

