package base;

import org.joda.time.DateTime;

/**
 * Created by KX on 29/01/2016.
 */
public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
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
    public int getAge() {
        return age;
    }

    public void setAge(int annee_de_naissance) {
        this.age = new DateTime().getYear() - annee_de_naissance;
    }
}