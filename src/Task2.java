import java.util.Scanner;

public class Task2 {

    static int c1,c2=0;
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String string=s1.nextLine();

        for(int i=0;i<string.length();++i){
            char c = string.charAt(i);
            if(c=='(') ++c1;
            if(c==')') ++c2;
        }
        if(c1==c2) System.out.println("True");
        else System.out.println("False");


    }
}
