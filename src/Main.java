public class Main {
    public static void main(String[] args) {
        char ch = '\'';

        SafeScanner sc = new SafeScanner();

        int height = sc.getInt();
        int width = sc.getInt();
        int centre = height / 2 + 1;
        System.out.print("|\\");
        for(int i = 1; i <= width -4; i++)
            System.out.print("-");
        System.out.print("/|");
        System.out.println();
        for(int i = 2; i < centre; i++){
            System.out.print("|");
            for (int j = 1; j <= width-2; j++ )
                System.out.print(" ");
            System.out.print("|");
            System.out.println();
        }
        System.out.print("| 0");
        for(int i = 1; i <= width -6; i++)
            System.out.print("_");
        System.out.print("0 |");
        System.out.println();
        for(int k = 2; k < height - centre; k++){
            System.out.print("|");
            for (int j = 1; j <= width-2; j++ )
                System.out.print(" ");
            System.out.print("|");
            System.out.println();
        }
        System.out.print(" \\_");
        for(int i = 1; i <= width -6; i++)
            System.out.print("^");
        System.out.print("_/ ");
    }
}