import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] freq = new int[100000];
        Scanner s = new Scanner(System.in);
        int c = 0;
        for (int i = 0; i < freq.length; ++i) {
            c = s.nextInt();
            if (c == 0) {
                break;
            }
            freq[c]++;


        }
        System.out.println("                                           ");
        for (int i = 1; i < freq.length; ++i) {

            if (freq[i] > 0) System.out.println(i + "  " + freq[i]);
        }
    }
}
