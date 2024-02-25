import java.util.Scanner;

public class Prodovec {
    public static int  randomana_stika_odin = 100;
   public static int randomani_stuka_dva = 500;
     public static String nazvanie_pre_tovara = "Какя-то штука ";
    public static String nazvamie_dva_tovarar = "Какая-то вторая штука ";

    public static void  pervod_deistvie() {
        while (true) {



            info_info();
            System.out.println("1.Продать первую штуку");
            System.out.println("2.Продать вторую штуку ");
            Scanner scanner_v_classe = new Scanner(System.in);
            int vubor = scanner_v_classe.nextInt() ;
            if (vubor== 1) {

                System.out.println("Сколько?");
                int scolcco = scanner_v_classe.nextInt();
                System.out.printf("За сколько продать %s  , в кол-во %d", nazvanie_pre_tovara, scolcco);
                int prodat = scanner_v_classe.nextInt();
                randomana_stika_odin = randomana_stika_odin - scolcco;
                int vurocka = scolcco * prodat;
                System.out.printf("Вы получили за &s %d руб", vurocka);


            }else if (vubor == 2) {


                System.out.println("Сколько?");
                int scolcco = scanner_v_classe.nextInt();
                System.out.printf("За сколько продать %s  , в кол-во %d", nazvanie_pre_tovara, scolcco);
                int prodat = scanner_v_classe.nextInt();
                randomani_stuka_dva = randomani_stuka_dva - scolcco;
                int vurocka = scolcco * prodat;
                System.out.printf("Вы получили за &s %d руб", vurocka);



            }
        }
    }
    public  static void vtoroe_deistevie() {
        int zp_prodovca = 15000 ;
        System.out.printf("Ваша зп = %s" , zp_prodovca);

    }
    public static void info_info () {
        System.out.printf("Сейчас на складе есть %s-%d , %s-%d)", nazvanie_pre_tovara, randomana_stika_odin, nazvamie_dva_tovarar, randomani_stuka_dva);

    }

}




