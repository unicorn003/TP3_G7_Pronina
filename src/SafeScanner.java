import java.util.Scanner;

public class SafeScanner {
    Scanner sc;
    public SafeScanner() {
         this.sc = new Scanner(System.in);
    }
    public int getInt(){
        boolean IsValid = false;
        try {
            return  333;
        }
        catch (){
            return 0;
        }
    }

    public void closeScanner(){
        sc.close();
    }
}
