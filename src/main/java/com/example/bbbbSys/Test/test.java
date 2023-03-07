package com.example.bbbbSys.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

public class test {

    public static void main(String[] args) throws UnknownHostException {

//        String a = new String("aa");
//        String b = new String("aa");
//        LinkedList<Integer> objects = new LinkedList<>();
//        objects.add(1);
//        objects.add(2);
//        objects.add(3);
//        Iterator<Integer> iterator = objects.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
////        }
//        List linkedList = new LinkedList();
//        Set<Integer> set = new HashSet<>();
//        Map hashMap = new TreeMap();
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr);


    }
}
