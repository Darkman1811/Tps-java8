/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author LaptopWin
 */
public class TpsJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Using Streams");
        //Stream(int)->Stream(Stream(int,qrt))
        Stream.of(1,2,3).map(n->Stream.of(n,n*n)).forEach(System.out::println);
        
        //Conciderer la valeur renvoyé comme un stream et lui appliquer les bonnes methodes
         Stream.of(1,2,3).map(n->Stream.of(n,n*n)).forEach(e->e.forEach(System.out::println));
         
         //Using flatMap
         Stream.of(1,2,3).flatMap(n->Stream.of(n,n*n)).forEach(System.out::println);
        
         String[] strs1={"Dakar","Diourbel","Thies"};
         String[] strs2={"Goloulou","Dioubola","Tinon"};
         String[] strs3={"Sissi","Sassilou","Simai"};
        
         List<String[]> pays=new ArrayList<>();
         pays.add(strs1);
         pays.add(strs2);
         pays.add(strs3);
         //if the inner element is not a stream you need to convert it to a stream
         pays.stream().flatMap(n->Arrays.stream(n)).forEach(System.out::println); //if the inner element is not a stream
         
    }

}
