public class Main {
    public static void main(String[] args) {
        char ch = '\'';

        SafeScanner sc = new SafeScanner();

        int height = sc.getInt();
        int width = sc.getInt();
        int centre = height / 2 + 1;
        /*for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){

            }
        }*/
        System.out.print("|\\");
        for(int i = 1; i <= width -4; i++)
            System.out.print("-");
        System.out.print("/|");
        System.out.println();
        /*System.out.println("|\\---/|");
        System.out.println("| 0_0 |");
        System.out.println("\\_^^_/");*/
    }
}