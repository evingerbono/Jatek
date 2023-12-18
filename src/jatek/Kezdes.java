package jatek;

public class Kezdes extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Kezdés! Jobbra vagy Balra";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobra();
    }

    @Override
    public Helyszin masikIrany() {
        return new Balra();
    }

    @Override
    public String egyikBtn() {
        return "Jobra";
    }

    @Override
    public String masikBtn() {
        return "Balra";
    }
}
