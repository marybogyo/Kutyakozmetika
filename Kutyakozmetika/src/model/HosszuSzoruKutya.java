
package model;

public class HosszuSzoruKutya extends Kutya {
   
    public HosszuSzoruKutya(String KutyaNev, Meret meret){
        super(KutyaNev, meret);
        this.ido=30;
    }
        @Override
        public void setKoromvagva() {
            System.out.println("Hosszú szőrű kutya körme levágva!");
            
            super.setKoromvagva();
    }

        @Override
    public void setMegnyirt() {
            System.out.println("Hosszú szőrű kutya megnyírva!");
            super.setMegnyirt();
    }

        @Override
    public void setTiszta() {
            System.out.println("Hosszú szőrű kutya megfürdetve!");
            super.setTiszta();
    }
    
}
