package com.piyushpriyadarshi.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<String> empList= Arrays.asList("piyush", "Aman","Keshav","Azitab");
        Map<Character,Integer> countermap=new LinkedHashMap<Character,Integer>();
        empList.stream()
                .map(name->{
                    char[] arr=name.toCharArray();
                    for (char ch: arr) {
                       if(countermap.containsKey(ch)) {
                           countermap.put(ch,countermap.get(ch)+1);
                       }
                       else{
                           countermap.put(ch,1);
                       }
                    }
                    return name.toUpperCase();
                })
                .forEach(System.out::println);
        System.out.println("countermap = " + countermap);
    }
}
