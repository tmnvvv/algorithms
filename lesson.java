package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class lesson {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(22);
        list.add(29);
        list.add(62);
        list.add(461);
        list.add(4);
        list.add(0);
        list.add(77);
        list.add(54);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}