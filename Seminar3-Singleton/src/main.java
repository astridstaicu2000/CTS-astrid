public class main {
    public static void main(String[] args) {
        SoferAutobuz sofer1 = SoferAutobuz.getInstance("mihai");
        SoferAutobuz sofer2 = SoferAutobuz.getInstance("ion");

        System.out.println(sofer1.getNume());
        System.out.println(sofer2.getNume());
    }
}
