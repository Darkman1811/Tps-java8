/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsjava8;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author LaptopWin
 */
public class TpsJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Personne> q=new LinkedList<>();
        q.add(new Personne(3, "Abdoualye Diaw"));
        q.add(new Personne(1, "Yacine Diaw"));
        q.add(new Personne(2, "Fatou Diop"));

        System.out.println(q.size());

        while (q.peek() != null) {
            Personne pers = q.peek();
            System.out.println(pers.getId() + "-" + pers.getNom());
            q.remove();
        }
    }
    
}
