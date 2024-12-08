package Unboxing;
/*Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing
Usare le funzioni scritte con i valori creati
 */
public class Autoboxing_Unboxing {
    public static void main(String[] args) {


        int num1 = 21;
        int num2 = 17;
        double numDec = 11.5;
        char carattere = 'Z';


        //Autoboxing dei numeri primitivi
        Integer num1Wrapp = num1;
        Integer num2Wrapp = num2;
        Double numDecWrapp = numDec;
        Character carattereWrapp = carattere;

        //Oggetti già Wrappati
        Integer num1GiaWrapp = 25;
        Integer num2GiaWrapp = 7;
        Double numDecGiaWrapp = 9.98;
        Character carattereGiaWrappato = 'v';

        //Unboxing oggetti wrappati
        int num1Unboxed = num1GiaWrapp;
        int num2Unboxed = num2GiaWrapp;
        double numDecUnboxed = numDecGiaWrapp;
        char carattereUnboxed = carattereGiaWrappato;

        sommaPrimitivi(num1, num2);
        sommaIntegerWrapper(num1GiaWrapp, num2GiaWrapp);
        stampaCharPrimitivo(carattere);
        stampaCharWrapper(carattereGiaWrappato);

    }


    public static void sommaPrimitivi (int numero1, int numero2) {
        System.out.println("Somma dei numeri primitivi = " + (numero1 + numero2));
    }

    public static void stampaCharPrimitivo (char input) {
        System.out.println("Stampa del char primitivo = " + input);
    }

    public static void sommaIntegerWrapper (Integer numero1, Integer numero2) {
        System.out.println("Somma dei numeri Wrappati = " + (numero1 + numero2));
    }

    public static void stampaCharWrapper (Character input) {
        System.out.println("Stampa del char Wrappato = " + input);
        }
}
