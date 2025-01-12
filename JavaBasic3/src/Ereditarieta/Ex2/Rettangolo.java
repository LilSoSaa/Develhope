package Ereditarieta.Ex2;

public class Rettangolo extends Forma{
    int base;
    int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcoloArea() {
        int area = base * altezza;
        System.out.println("Area del Rettangolo = " + area);
    }
}
