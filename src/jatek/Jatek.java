package jatek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jatek {

    public static void main(String[] args) {

        Targy t1 = new Targy("Lándzsa", "Fegyver");
        Targy t2 = new Targy("Poti", "Gyógyszer");
        Karakter k1 = new Karakter((dobas() + dobas()), dobas(), dobas());
        System.out.println(k1.toString());
        k1.Felvesz(t1);
        k1.Felvesz(t2, 4);
        System.out.println(k1.toString());
        k1.Hasznal("Kard");
        k1.Hasznal("Poti", 3);
        //k1.Hasznal("Poti", 31);
        k1.Hasznal("Lándzsa", 1, false);
        //k1.Hasznal("Lándzsa", 1, true);
        k1.Hasznal("Lándzsa", 5, true);

        try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("karakter.bin"))) {
            objKi.writeObject(k1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static int dobas() {
        int ertek = (int) (Math.random() * 6) + 1;
        ertek += 6;
        return ertek;
    }

}
