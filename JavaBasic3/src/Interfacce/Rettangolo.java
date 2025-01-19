package Interfacce;

public class Rettangolo implements Forma{
        int base;
        int altezza;

        public Rettangolo(int base, int altezza) {
            this.base = base;
            this.altezza = altezza;
        }
    @Override
    public void calcolaArea() {
        System.out.println(base*altezza);
    }
}
