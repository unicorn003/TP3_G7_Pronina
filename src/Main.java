public class Main {
    public static void main(String[] args) {
        SafeScanner sc = new SafeScanner();
        int age = sc.getInt();
        System.out.println("Votre age est âge " + age);
        sc.closeScanner();
    }
}