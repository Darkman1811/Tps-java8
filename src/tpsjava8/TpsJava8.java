/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        //IntStream  stream= IntStream.iterate(1, n->n+1);
        Stream  stream= Stream.generate(new Random()::nextInt).limit(10);        
       // stream.forEach(System.out::println);
        
        stream= Stream.generate(new Random()::nextBoolean).limit(10);        
      //  stream.forEach(System.out::println);
        
        stream=Stream.generate(()->{ 
            Random r=new Random();
            int Low = 10;
int High = 100;
int re = r.nextInt(High-Low) + Low;
return re;
                });
 stream.limit(20).forEach(System.out::println);      
        
    }

}
