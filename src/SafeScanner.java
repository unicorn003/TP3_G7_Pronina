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
                System.out.println("Entrez votre âge");
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
