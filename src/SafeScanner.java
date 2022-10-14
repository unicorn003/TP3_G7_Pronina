import java.util.Scanner;

public class SafeScanner {
    Scanner sc;
    public SafeScanner() {
         this.sc = new Scanner(System.in);
    }
    public int getInt(){
        return 0;
    }

    public void closeScanner(){
        sc.close();
    }
}
