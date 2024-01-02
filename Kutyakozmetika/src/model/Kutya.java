
package model;


public class Kutya {
    protected static int ido;
    protected Meret meret;
    protected String kutyaNeve;
    protected boolean tiszta;
    protected boolean megnyirt;
    protected boolean koromvagva;

    public String getKutyaNeve() {
        return kutyaNeve;
    }

    public void setKoromvagva() {
        System.out.println("Körömvágás ideje: " + 5 + " perc");
        this.koromvagva=true;
    }

    public void setMegnyirt() {
       System.out.println("Nyírás ideje: " + getSzamitottIdo()/2 + " perc");
       this.megnyirt=true;
    }

    public void setTiszta() {
        System.out.println("Tisztítás ideje: " + getSzamitottIdo()/2 + " perc");
        this.tiszta=true;
    }
    
    public Kutya(String kutyaNeve, Meret meret){
       this.kutyaNeve=kutyaNeve;
       this.meret=meret;
    }
    
     public enum Meret {
        KISTESTU, NORMALTESTU, NAGYTESTU
    }  
     
     public int getSzamitottIdo(){
         switch (meret) {
             case KISTESTU -> {
                 return (int)(ido*0.75);
            }
             case NORMALTESTU -> {
                 return ido;
            }
             case NAGYTESTU -> {
                 return (int)(ido*1.25);
            }
             default -> throw new AssertionError();
         }
     }
}
