package com.module.project01;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    private static final String a="dd";
    public static final int n = 2;
    public static final int n1 =3;
    public static final String s = "dd";



    public static void main(String[] args) {
        System.out.println("skdlf");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        int num = 10;
        System.out.println("num = " + num);

        String[] arr = new String[]{"1","3","3"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        ArrayList list = new ArrayList();
        list.add(12);
        list.add(33);
        list.add(44);

        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }



    public void openle(){

       String a = "sdf ";
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(33);
        list.add(44);

        if (list == null) {
            
        }

        if (list != null) {

        }

    }
}
