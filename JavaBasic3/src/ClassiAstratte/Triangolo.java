package ClassiAstratte;

public class Triangolo extends Forma{
    double base;
    double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcoloArea() {
        return (base * altezza)/2;
    }
}
