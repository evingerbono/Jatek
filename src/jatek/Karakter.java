package jatek;

import java.util.ArrayList;

public class Karakter {
    private int eletero, szerencse, ugyesseg;
    private ArrayList<Targy> felszereles;

    public Karakter(int eletero, int szerencse, int ugyesseg) {
        this.eletero = eletero;
        this.szerencse = szerencse;
        this.ugyesseg = ugyesseg;
        this.felszereles = new ArrayList<>();
    }

    public void Felvesz(Targy nev) {
        felszereles.add(nev);
    }

    public void Felvesz(Targy nev, int db) {
        for (int i = 0; i < db; i++) {
            felszereles.add(nev);
        }
    }

    private boolean Nins(String nev) {
        for (Targy targy : felszereles) {
            if (targy.getNev().equals(nev)) {
                return true;
            }
        }
        return false;
    }

    public void Hasznal(String nev) {
        if (Nins(nev)==false) {
            System.out.println("Nincs ilyen tárgy: " + nev);
        } else {
            for (int i = 0; i < felszereles.size(); i++) {
                if (felszereles.get(i).getNev().equals(nev)) {
                    felszereles.remove(i);
                }
            }
            System.out.println("Használ " + nev);
        }
    }

    public void Hasznal(String nev, int db) {
        if (Nins(nev)==false) {
            System.out.println("Nincs ilyen tárgy: " + nev);
        } else {
            int db2 = 0;
            for (int i = 0; i < felszereles.size(); i++) {
                if (felszereles.get(i).getNev().equals(nev)) {
                    db2++;
                }
            }

            if (db > db2) {
                System.out.println("Nincs ennyi " + nev + " tárgyad");
            } else {
                System.out.println("Használ " + db + "db " + nev);
                for (int i = 0; i < felszereles.size() && db2 > 0;) {
                    if (felszereles.get(i).getNev().equals(nev)) {
                        felszereles.remove(i);
                        db2--;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public void Hasznal(String nev, int db, boolean eleg) {
        if (eleg == false) {
            System.out.println("Nem használtál tárgyat");
        } else {
            Hasznal(nev, db);
        }
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", szerencse=" + szerencse + ", ugyesseg=" + ugyesseg + ", felszereles=" + felszereles + '}';
    }
}
