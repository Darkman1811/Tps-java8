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
         String str=Stream.of("Dakar","Thies","Diourbel","Dakar")
                                  .distinct()
                                  .filter(n->n.contains("r"))
                                  .map(n->n.concat("e"))
                                  .map((n)->{System.out.println(n);return n;})
                                  .reduce("",(s1,s2)->s1.concat(" - ").concat(s2));
       System.out.println(str);                           
         
    }
    
}
