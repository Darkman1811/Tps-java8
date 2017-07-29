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
        Optional<String> str=Optional.ofNullable("Hello");
        str.ifPresent(System.out::println);
        
        Optional<String> str2=Optional.ofNullable(null);
        str2.ifPresent(System.out::println);
        IntStream.of(1,4,56,6,12,57).filter(n->n%2==1).max().ifPresent(System.out::println);
        IntStream.of(10,4,56,6,12,58).filter(n->n%2==1).max().ifPresent(System.out::println);
        
    }

}
