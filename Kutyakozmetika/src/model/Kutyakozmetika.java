
package model;


public class Kutyakozmetika {
    
    private Kutya[] kutyak;
    private int kutyakDb;

    public Kutyakozmetika() {
        this(5);
    }

    public Kutyakozmetika(int db) {
        kutyakDb = 0;
        kutyak = new Kutya[db];
    }
    
    public void fogad(Kutya kutya){
        if(kutyakDb < kutyak.length){
            kutyak[kutyakDb++] = kutya;
        }else{
            System.out.println("A kutyakozmetika megtelt!");
        }
    }
    
    public void furdet(){
        for (Kutya kutya : kutyak) {
            if(kutya != null){
                kutya.setTiszta();
            }
        }
    }
    
    public void Nyiras(){
       for (Kutya kutya : kutyak) {
            if(kutya != null){
                kutya.setMegnyirt();
            }
        } 
        
    }
    
    public void Koromvagas(){
        for (Kutya kutya : kutyak) {
            if(kutya != null){
                kutya.setKoromvagva();
            }
        }
    }
    

public void kiad(String kutyaNeve){
        int i = 0;
        while( i < kutyakDb && (kutyak[i] == null || !(kutyak[i].getKutyaNeve().equals(kutyaNeve)) )){
            i++;
        }
        if(i < kutyakDb){
            System.out.println(String.format("Kiadva %s kutya!", kutyaNeve));
            kutyak[i] = null;
        }else{
            System.out.println("Nincs ilyen kutya a Kutyakozmetikában!");
        }
    }
}
