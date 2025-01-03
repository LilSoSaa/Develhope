package DesignPatterns.Singleton_Static;
/*Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video
 */
public class Main {
    public static void main(String[] args) {

        User user1 = new User("Sosa", 21);
        System.out.println("Info 1' User:");
        user1.mostraInfo();

        User user2 = new User("Rondo", 17);

        System.out.println("\nInfo 2' User:");
        user2.mostraInfo();


        user2.setNome("Mauro");
        user2.setAge(32);
        System.out.println("\nInfo 2' User Aggiornate:");
        user2.mostraInfo();

    }
}
