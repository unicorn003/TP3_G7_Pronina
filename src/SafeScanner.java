import java.util.Scanner;

public class SafeScanner {
    Scanner sc;
    public SafeScanner() {
         this.sc = new Scanner(System.in);
    }
    public int getInt(){
        int age;
        try {
            do {
                System.out.println("Veuillez saisir un entier positif entre de 1 et 12");
                age = sc.nextInt();
            } while (age <= 0);
            return age;
        }
        catch (Exception e){
            return 0;
        }
    }

    public void closeScanner(){
        sc.close();
    }
}
