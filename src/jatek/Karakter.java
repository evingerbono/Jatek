package jatek;

import java.util.ArrayList;

public class Karakter {
    private int eletero, szerencse, ugyesseg;
    private ArrayList<Targy> felszereles;

    public Karakter(int eletero, int szerencse, int ugyesseg) {
        this.eletero = eletero;
        this.szerencse = szerencse;
        this.ugyesseg = ugyesseg;
    }

    public int getEletero() {
        return eletero;
    }

    public int getSzerencse() {
        return szerencse;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }
    
    public void Felvesz(Targy nev){
        felszereles.add(nev);
    }
    public void Felvesz(Targy nev, int db){
        for (int i = 0; i < db; i++) {
            felszereles.add(nev);
        }
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", szerencse=" + szerencse + ", ugyesseg=" + ugyesseg + ", felszereles=" + felszereles + '}';
    }
    
}
