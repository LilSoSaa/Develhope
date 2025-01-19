package Polimorfismo;

public class Triangolo extends Forma{
    int base;
    int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcoloArea() {
        int area = (base * altezza)/2;
        System.out.println("Area del Rettangolo = " + area);
    }
}
