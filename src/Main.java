import java.util.Scanner;

public class Main {

    static double recPow(int x, int y) {
        double result=1;
        if(y==0) return 1;
        else if(y>0){
            result=recPow(x,y-1);
            result=result*x;
        }
        else{
            result=recPow(x,y+1);
            result=result/x;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        int taban = scanner.nextInt();
        System.out.print("Üs miktarını giriniz : ");
        int us = scanner.nextInt();
        recPow(taban, us);
        System.out.println("Sonuç : " + recPow(taban, us));
    }
}
