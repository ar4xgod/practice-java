import java.util.Scanner;
public class Snail {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int speedUp = scan.nextInt();
        int speedDown = scan.nextInt();
        int height = scan.nextInt();
        if (height<=speedUp) System.out.println("1");
        else if (speedUp<=speedDown) System.out.println("Impossible");
        else System.out.println((height - speedUp) / (speedUp - speedDown) +1);

    }

}