
public class Main {
    public static void main(String[] args) {
       System.out.println(isPalindrom(121));
    }

    static boolean isPalindrom(int input){
        int kalan,gecici,tersSayi=0;

        gecici=input;
        while(gecici!=0){

            kalan=gecici%10;
            tersSayi=tersSayi*10+kalan;
            gecici/=10;
        }
        if(input==tersSayi){
            return true;
        }
        else{
            return false;
        }
    }
}