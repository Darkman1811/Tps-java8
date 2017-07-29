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
 * @author super
 */
public class Personne {
    private String nom;
    private String prenom;
    private Integer age;
    private  List<Personne> personnes;

    public Personne() {
        super();
        this.personnes=new ArrayList();
        this.personnes.add(new Personne("Abdoulaye","Diaw",30));
        this.personnes.add(new Personne("Fatou","Diop",56));
        this.personnes.add(new Personne("Yacine","Diop",24));
    }

    public Personne(String nom, String prenom, Integer age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public  List<Personne> getPersonnes() {
        return personnes;
    }

    public  void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }


    
    
}
