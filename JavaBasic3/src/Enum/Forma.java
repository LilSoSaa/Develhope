package Enum;

public class Forma {
    private TipoForma tipo;

    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    public void calcolaArea() {
        System.out.println("Calcolo dell'area per una forma generica.");
    }

    public TipoForma getTipo() {
        return tipo;
    }
}
