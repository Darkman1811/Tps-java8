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
        //Ne marche pas parceque le stream renvoyé par le map ne posséde pas l'impementation du reduce avec les 3 paramétres
        //Integer sum=new Personne().getPersonnes().stream().map(Personne::getAge).reduce(0,(partialSum,personne)->partialSum+personne.getAge() ,Integer::sum);
        Integer sum=new Personne().getPersonnes().stream().reduce(0,(partialSum,personne)->partialSum+personne.getAge() ,Integer::sum);
                //The third parameter is never used because this is not a paralelle stream
                //sum=new Personne().getPersonnes().stream().reduce(0,(partialSum,personne)->partialSum+personne.getAge() ,(a,b)->{System.out.println(b);return a+b;});
                //This time the third parameter is used to combine the results of the differents threads because this is a paralellStream
                //sum=new Personne().getPersonnes().parallelStream().reduce(0,(partialSum,personne)->partialSum+personne.getAge() ,(a,b)->{System.out.println(b);return a+b;});
                //sum=new Personne().getPersonnes().parallelStream().reduce(0,(partialSum,personne)->partialSum+personne.getAge() ,(a,b)->{System.out.println(Thread.currentThread().getName());return a+b;});
                //sum=new Personne().getPersonnes().parallelStream().reduce(0,(partialSum,personne)->{System.out.println(Thread.currentThread().getName());return partialSum+personne.getAge();} ,(a,b)->{System.out.println(Thread.currentThread().getName());return a+b;});
                
                
        Stream<Integer> stream=Stream.generate(() -> {return new Random().nextInt(100 - 10) + 10;}).limit(2000);
        List<Integer> lst=stream.collect(Collectors.toList());
        //Combiner trace
        /*
        lst.parallelStream().reduce(0,
                                   (partialSum,val)->{return partialSum+val;},
                                    (a,b)->{System.out.println(Thread.currentThread().getName());return a+b;});
        */
        //SubThread Trace
        lst.parallelStream().reduce(0,
                                   (partialSum,val)->{System.out.println(Thread.currentThread().getName());return partialSum+val;},
                                    (a,b)->{return a+b;});
       
         
    }

}

