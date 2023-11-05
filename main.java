import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);

        int temp;

        System.out.print("Hava Sıcaklığını Giriniz: ");
        temp = inp.nextInt();

        if (temp<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if (temp >= 5 && temp <=25){

            if (temp<=15)
                System.out.println("Sinemaya gdebilirsin.");
        }
            if (temp>=10&&temp<25){
            System.out.println("Pikniğe gidebilirsiniz");

        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
            
        }


    }

}
