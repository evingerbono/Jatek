package jatek;

public class Balra extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Balra jöttél";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String egyikBtn() {
        return "Észak";
    }

    @Override
    public Helyszin masikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String masikBtn() {
        return "Dél";
    }
    
}
