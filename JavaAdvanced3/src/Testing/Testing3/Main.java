package Testing.Testing3;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        String dataFormattata = FormatDate.formattaData(data);
        System.out.println(dataFormattata);
    }
}
