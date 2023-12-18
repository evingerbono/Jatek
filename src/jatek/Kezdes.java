package jatek;

public class Kezdes extends Helyszin{

    @Override
    public String leiras() {
        return "Kezdés! Jobbra vagy Balra";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Balra();
    }

    @Override
    public String egyikBtn() {
        return "Balra";
    }
    
}
