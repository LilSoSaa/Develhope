package DesignPatterns.Factory;
/*Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
Cre una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc)
Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
Stampa a video il risultato della funzione draw di ogni shape creata
    CERCHIO,
    QUADRATO,
    RETTANGOLO,
    TRIANGOLO;
 */
public class ShapeFactory {
    public static Shape createShape(ShapeTypes type) {
        Shape shape; // Dichiarazione della variabile
        switch (type) {
            case CERCHIO:
                shape = new Cerchio();
                break;
            case QUADRATO:
                shape = new Quadrato();
                break;
            case RETTANGOLO:
                shape = new Rettangolo();
                break;
            case TRIANGOLO:
                shape = new Triangolo();
                break;
            default:
                throw new IllegalArgumentException("Tipo di forma non esistente: " + type);
        }
        return shape;

    }
}
