package Exceptions;
//Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione
public class Ex2 {
    public static void main(String[] args) {
        char carattere = '3';

        try {
            verificaNumero(carattere);
            System.out.println("Il carattere " + carattere + " è un numero.");
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static void verificaNumero (char carattere) throws  Exception {
        if (carattere < '0' || carattere > '9') {
            throw  new Exception("Il carattere '" + carattere + "' non è un numero.");
        }
    }
}
