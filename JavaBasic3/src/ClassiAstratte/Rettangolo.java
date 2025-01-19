package ClassiAstratte;

public class Rettangolo extends Forma{
    double base;
    double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcoloArea() {
        return base * altezza;
    }
}
