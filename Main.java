import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int sayi,i,uslu;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayıyı giriniz: ");
        sayi= input.nextInt();
        for(i=0;i<=sayi;i++){
            if(i==sayi){
               uslu = sayi*i ;
                System.out.println("Üslü ifade: "+uslu);
            }
        }
        
    }
}
