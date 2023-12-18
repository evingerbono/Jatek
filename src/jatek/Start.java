package jatek;

public class Start extends Helyszin{

    @Override
    public String leiras() {
        return "Ez a start haladj tovább!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }

    @Override
    public String egyikBtn() {
        return "Tovább";
    }
    
}
