
package main;

import model.Kutya;
import model.Kutyakozmetika;
import model.HosszuSzoruKutya;
import model.RovidSzoruKutya;

public class KutyakozmetikaProgram {

    private Kutyakozmetika kutya;
    
    public static void main(String[] args) {
      new KutyakozmetikaProgram();
      
    }
    
    public KutyakozmetikaProgram(){
        kutya = new Kutyakozmetika(4);
        kutya.fogad(new HosszuSzoruKutya("János", Kutya.Meret.KISTESTU));
        kutya.fogad(new RovidSzoruKutya("Gergő", Kutya.Meret.NAGYTESTU));
        kutya.fogad(new RovidSzoruKutya("Orsi", Kutya.Meret.NORMALTESTU));
        kutya.fogad(new HosszuSzoruKutya("Pindur", Kutya.Meret.KISTESTU));
               
        System.out.println("-Kutyák fürdetése: ");
        kutya.furdet();
        
        System.out.println("-Kutyák körömvágása: ");
        kutya.Koromvagas();
        
        System.out.println("-Kutyák nyírása: ");
        kutya.Nyiras();
        
        System.out.println("-Kutyák kiadva: ");
        kutya.kiad("Orsi");
        
        System.out.println("-Kutyák kiadva: ");
        kutya.kiad("Pumi");
        
    }
}
