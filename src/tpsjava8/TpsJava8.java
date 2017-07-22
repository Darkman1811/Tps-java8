/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsjava8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LaptopWin
 */
public class TpsJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("hello word laye diaw");
        List<String> lst=new ArrayList<>();
        lst.add("Dodo");
        lst.add("laye diaw");
        lst.add("Fatou diop");
        lst.add("Yacine Diop");
        System.out.println("size before"+lst.size());
        lst.removeIf((String el)->{ return el.contains("diop"); });
        System.out.println("size before"+lst.size());

    }
    
}
