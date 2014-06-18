import java.util.Scanner;

/**
 * Created by MANASTYP on 18.06.14.
 */
public class MainClass {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array size");
        int N = sc.nextInt();



        QuickFindUF quick = new QuickFindUF(N);
        System.out.println(quick.toString());


    }


}
