/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsjava8;

import com.sun.jmx.snmp.BerDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
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
      
                
        Stream<Integer> stream=Stream.generate(() -> {return new Random().nextInt(100 - 10) + 10;}).limit(2000);
        //Map<Integer,Long> mp=stream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Boolean,List<Integer>> mp=stream.collect(Collectors.groupingBy(n->n.intValue()>50,Collectors.toList()));
        
        System.out.println(mp);
    }

}//(oldValue,newValue)->oldValue>newValue?oldValue:newValue

