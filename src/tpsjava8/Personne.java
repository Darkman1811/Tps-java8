/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsjava8;

/**
 *
 * @author LaptopWin
 */
class Personne implements Comparable{
    private int id;
    private String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Personne() {
    }

    public Personne(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public int compareTo(Object o) {
        Personne pers=(Personne)o;
        if(this.id>pers.getId()){
            return -1;
        }
        else{
            return 1;
        }
                }
    
}
