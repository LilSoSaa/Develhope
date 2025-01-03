package DesignPatterns.Factory;

/*Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
Cre una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc)
Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
Stampa a video il risultato della funzione draw di ogni shape creata
shape scelti:
    CERCHIO,
    QUADRATO,
    RETTANGOLO,
    TRIANGOLO;
 */
public class Main {
    public static void main(String[] args) {

        Shape cerchio = ShapeFactory.createShape(ShapeTypes.CERCHIO);
        cerchio.draw();

        Shape quadrato = ShapeFactory.createShape(ShapeTypes.QUADRATO);
        quadrato.draw();

        Shape rettangolo = ShapeFactory.createShape(ShapeTypes.RETTANGOLO);
        rettangolo.draw();

        Shape triangolo = ShapeFactory.createShape(ShapeTypes.TRIANGOLO);
        triangolo.draw();
    }
}
