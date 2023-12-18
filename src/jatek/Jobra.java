package jatek;

public class Jobra extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Jobbra jöttél";
    }

    @Override
    public Helyszin egyikIrany() {
       return new Kelet();
    }

    @Override
    public String egyikBtn() {
        return "Kelet";
    }

    @Override
    public Helyszin masikIrany() {
        return new Nyugat();
    }

    @Override
    public String masikBtn() {
        return "Nyugat";
    }

}
