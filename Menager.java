import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Menager {

    String [] rabotniki = new String[5] ;
    public void pervoe_deisetiev() {
        Scanner scanner = new Scanner(System.in)  ;
        System.out.println("Введите имя работника");

         do{
             rabotniki [5] = null ;
             rabotniki[0] = scanner.next() ;

             rabotniki[1] = scanner.next() ;

             rabotniki[2] = scanner.next() ;

             rabotniki[3] = scanner.next()  ;

             rabotniki[4] = scanner.next()  ;
             for (int i = 0; i < 5; i++) {
                 System.out.println(rabotniki[i]);
             }
             Main.zzz();
          }while (true);





    }
    public void vtoroe_deistevi() {
        System.out.println("1.Заказать первый товар");
        System.out.println("2.Заказать 2-ой товар ");

        Scanner cvet_spasi_mou_dushu = new Scanner(System.in);
        int vv = cvet_spasi_mou_dushu.nextInt() ;
        if( vv == 1) {
            System.out.printf("заказать товара %s ", Prodovec.nazvanie_pre_tovara);
            System.out.println("СКолько?");
            int kol = cvet_spasi_mou_dushu.nextInt();
            Prodovec.randomana_stika_odin = Prodovec.randomana_stika_odin + kol;
            Prodovec.info_info();
        }
        else if (vv == 2 ) {
            System.out.printf("заказать товара %s ", Prodovec.nazvamie_dva_tovarar);
            System.out.println("СКолько?");
            int kol = cvet_spasi_mou_dushu.nextInt();
            Prodovec.randomana_stika_odin = Prodovec.randomani_stuka_dva + kol;
            Prodovec.info_info();
        }

        }



    }

}
