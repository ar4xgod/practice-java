import java.util.Scanner;
public class GoDutch {

    public static void main(String[] args)throws Exception {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int friends = scan.nextInt();
        if (amount<0) {throw new Exception ("Bill total amount can not be negative");}
        if (friends<=0) {throw new Exception ("Number of friends can not be negative or zero");}

        System.out.println(amount*1.1/friends);

    }

}