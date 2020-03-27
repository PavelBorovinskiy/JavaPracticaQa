package ru.pavel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Collections {
  public static void main(String[] args) {
    String[] list =  {"Java","PHP"};
    for (String l : list ){
      System.out.println(l);


    }
    List<String> list1 = new ArrayList<String>();
    list1.add("1");
    for( String st : list1){
      System.out.println(list1);
    }
  }
}
