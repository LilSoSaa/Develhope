package Enum;

public class Rettangolo extends Forma{
    private double larghezza;
    private double altezza;

    // Costruttore
    public Rettangolo(double larghezza, double altezza) {
        super(TipoForma.RETTANGOLO);
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    // Sovrascrittura del metodo calcolaArea
    @Override
    public void calcolaArea() {
        double area = larghezza * altezza;
        System.out.println("Area del rettangolo: " + area);
    }
}
