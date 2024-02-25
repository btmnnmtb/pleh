import java.util.Scanner;

public class Main {
    public static void  zzz () {
        Menager menager = new Menager() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Вы вошли");
        System.out.println("Выберите действие ");
        System.out.println("1.Добвать работника");
        System.out.println("2.Закупить товары");
        int vubor_dl_men = sc.nextInt() ;
        if(vubor_dl_men == 1 ){
            menager.pervoe_deisetiev();
        }
        else if (vubor_dl_men == 2){
            menager.vtoroe_deistevi();
        }
    }

    public static void main(String[] args) {
        int pass_prodovec = 12345  ;
        String login_prodovec = "Login" ;
        int pass_men = 123 ;
        String meneger = "men" ;

        System.out.println("Ввыберите роль ");
        System.out.println("1.Продовец  ");
        System.out.println("2.Менеджер");

        Scanner scanner = new Scanner(System.in ) ;
        int vubor_r = scanner.nextInt() ;
        if (vubor_r == 1) {
            System.out.println("Продовец");
            System.out.printf("Ваш новый логин %s , и пароль %d)" , login_prodovec , pass_prodovec);
            System.out.println("Введите ваш логин и пароль");
            String login =  scanner.next() ;
            int pass = scanner.nextInt() ;

                if (pass == 12345 && login.equals("Login")) {
                    System.out.println("Вы вошли");
                    System.out.println("Выберите действие ");
                    System.out.println("1.Продать товар");
                    System.out.println("2.Получить зп ");
                    Prodovec prodovec = new Prodovec();

                    int vubor = scanner.nextInt();
                    if (vubor == 1) {

                        prodovec.pervod_deistvie();

                    } else if (vubor == 2) {
                        prodovec.vtoroe_deistevie();

                    }


                }





        } else if (vubor_r == 2 ) {
            System.out.println("Менеджер ");
            System.out.printf("Ваш новый логин %s , и пароль %d)" , meneger, pass_men );
            System.out.println("Введите ваш логин и пароль");
            String login =  scanner.next() ;
            int pass = scanner.nextInt() ;
            if (pass == 123 && login.equals("men")) {
                zzz();
            }



        }

    }
}