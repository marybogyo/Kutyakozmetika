
package model;

public class RovidSzoruKutya extends Kutya {
    public RovidSzoruKutya(String KutyaNev, Meret meret){
        super(KutyaNev,  meret);
        this.ido=15;
    }
    @Override
        public void setKoromvagva() {
            System.out.println("Rövid szőrű kutya körme levágva!");
            super.setKoromvagva();
    }

    @Override
    public void setMegnyirt() {
            System.out.println("Rövid szőrű kutya megnyírva!");
            super.setMegnyirt();
    }

    @Override
    public void setTiszta() {
            System.out.println("Rövid szőrű kutya megfürdetve!");
            super.setTiszta();
    }
}
