/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpr;

/**
 *
 * @author user
 */
public class Ucenik {
    public String ime;
    public String prezime;
    public String datum;
    public String skgod;
    public String razred;
    public String broj;
    
    Ucenik(String pre,     String im,  String dat,  String skgodi,  String br,    String raz ){
        prezime = pre;
        ime = im;
        datum = dat;
        skgod = skgodi;
        razred = raz;
        broj = br;
    }
}
