/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettest;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class ProjetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Boujour et bienvenue");
        // déclaration
        int note;
        
        // initilisation
        note=10;
        
        // déclaration + assignation de la variable
        int qte =12;
        
        // Déclaration de plusieurs variables
        int var1,var2,var3;
        
        //Affichage des valeurs des variables
        System.out.println(note);
        
        //Var boolean
        boolean trouver;
        trouver = false;
        System.out.println(trouver);
        
        // var char
        char c = 'b';
        System.out.println('b');
        
        //var string
        String chaine = "J'ai les nouilles";
        System.out.println("chaine");
        
        //note = Integer.parseInt(car);
        System.out.println(note);
        
        //lire les données du clavier
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un entier");
        int valeurClavier;
        valeurClavier =  clavier.nextInt();
        System.out.println("La valeur est de :" + valeurClavier);
        
        ///new Scanner(System.in);
        System.out.println("Entrez une phrase");
        clavier.nextLine();
        String valeurClavierString;
        valeurClavierString = clavier.nextLine();
        System.out.println("La valeur est : " + valeurClavierString);
         
       // new Scanner(System.in);
        System.out.println("Appuyez sur une touche de votre clavier");
        char carac ;
        carac = clavier.next().charAt(0);
        System.out.println("La valeur est :" + carac);
       
        //TP1
        
        int heure,minute,seconde,tempsEcoule;
        tempsEcoule = 3700;
        seconde = (tempsEcoule/60)%60;
        minute = (tempsEcoule/60)%60;
        heure = (tempsEcoule/3600)%60;
        
        System.out.println("Le temps écoulé est de " +tempsEcoule+ " :" +heure+ " h" +minute+ " m" +seconde+ " s");
        
        //TP2
        /*Declaration des variables*/
        final int TVA = 20;
        double pu;
        int qte;
        /*initialisations des variables*/
        qte = 10;
        pu = 125;
        pttc = (pu*qte)*TVA;
        
        //TP3 :  permutation
       /* 
        int a,b,c;
        
        a = 5;
        b = 10;
        System.out.println("Avant la permutaion, a : " +a+ "et b : " +b+);
        c =a;
        a=b;
        b=c;
        
        System.out.println("Apres la permutaion, a : " +a+ "et b : " +b+);*/
    
    }
    
}
