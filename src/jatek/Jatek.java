package jatek;


public class Jatek {

    public static void main(String[] args) {

        Targy t1 = new Targy("Lándzsa", "Fegyver");
        Targy t2 = new Targy("Poti", "Gyógyszer");
        Karakter k1 = new Karakter((dobas() + dobas()),dobas(), dobas());
        System.out.println(k1.toString());
        k1.Felvesz(t2);
        System.out.println(k1.toString());

    }

    private static int dobas() {
        int ertek = (int) (Math.random() * 6) + 1;
        ertek += 6;
        return ertek;
    }

}
