/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        List <Integer> numbers=Arrays.asList(1,2,3,4,5);
        Stream<Integer> st0=numbers.stream();
        Stream<Integer> st1=st0.filter(n->n%2==1);
        Stream<Integer> st2=st1.map(n->n*n);
                       //.reduce(0, Integer::sum);
       // Integer red=st2.reduce(0,(n1,n2)->n1+n2);  //Seul un des deux peux etre executé sinon on recoit un illegal state exception
        Integer red=st2.reduce(0, (n1,n2)->n1-n2);
        System.out.println(red);
    }
    
}
