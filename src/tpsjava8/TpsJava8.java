/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
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
        //Duplicate Key problem
        /*Map<Integer,Integer> ma= stream.collect(Collectors.toMap(n->n.intValue(), n->n.intValue()*n.intValue()));
        ma.forEach((k,v)->System.out.println(k));
        */
        //Using a merger to solve duplicate key probleme
        Map<Integer,Integer> maval= stream.collect(Collectors.toMap(n->n.intValue(), n->n.intValue()*n.intValue(),(oldValue,newValue)->oldValue+newValue));
        maval.forEach((k,v)->System.out.println(k+" - "+v));
         
    }

}

